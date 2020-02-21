package com.example.meep.server;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.meep.client.MeepFeign;
import com.example.meep.model.Resource;
import com.example.meep.model.RestParams;

@Component
public class Processor extends Server {

	private static final Logger logger = LogManager.getLogger(Processor.class);
	
	private Set<Resource> storedResourceSet = new HashSet<>();
	
	@Autowired
	MeepFeign meepFeign;
	
	@Autowired
	RestParams params;
	
	@Override
	public List<Resource> getMeepResources() {
		logger.debug("****  getMeepResources():  START");

		List<Resource> list = null;
		try {
			logger.info(">>  Calling rest service");
			// call to Meep api with the FeignClient
			list = meepFeign.getMeepResources(params.getZone(),params.getLowerLeftLatLon(),params.getUpperRightLatLon(),params.getCompanyZoneIds());
			logger.debug("****  Found {} resources", ((list!=null) ? list.size() : 0));
			
		} catch (Exception e) {
			logger.error("cannot get the resources", e);
			// If it's produced an error return an empty list.
			// In this way, an option is given to resolve the error and the server continues to work normally
			list = new ArrayList<>();
		}
		
		logger.debug("****  getMeepResources():  END");
		return list;
	}

	@Override
	public void processMeepResources(List<Resource> newResourceList) {
		logger.debug("****  processMeepResources(): START");
		
		// Reboot the lists of changes
		Set<Resource> addedList = new HashSet<>();
		Set<Resource> removedList = new HashSet<>();
		
        // Prepare a HashSet of newResourceList
        Set<Resource> newResourceSet = new HashSet<>();
        newResourceSet.addAll(newResourceList);
        logger.debug("****  Delete {} duplicated data", newResourceList.size()-newResourceSet.size());

        // Check the stored resource list for the resources no longer available
        for(Resource previousResource : storedResourceSet) {
            if(!newResourceSet.contains(previousResource)) {
                removedList.add(previousResource);
            }
        }
        
        // Check the obtained resources list for new resources
        for(Resource newResource : newResourceSet) {
            if(!storedResourceSet.contains(newResource)) {
                addedList.add(newResource);
                logger.debug("** New resources {}", newResource);
            }
        }
        
        // Show the process results
        logger.info(">>  Process results: There were {} resources in the previous List.", storedResourceSet.size());
		logger.info(">>  Process results: Found {} new resources available.", addedList.size());
		logger.info(">>  Process results: {} resources are no longer available.", removedList.size());
		logger.info(">>  Process results: There are {} available resources in total.", newResourceSet.size());
		
		// Update the stored resources with the new resources
		storedResourceSet.clear();
		storedResourceSet.addAll(newResourceSet);
		
		logger.debug("****  processMeepResources(): END");
	}

}
