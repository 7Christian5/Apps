package com.example.meep.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.meep.model.Resource;

@FeignClient(name="meepFeign", url="${meep.service.url}")
public interface MeepFeign {

	@RequestMapping(method=RequestMethod.GET, value="/{zone}/resources")
    List<Resource> getMeepResources( 
    		@PathVariable("zone") String zone,
    		@RequestParam(value="lowerLeftLatLon") String lowerLeftLatLon,
            @RequestParam(value="upperRightLatLon") String upperRightLatLon,
            @RequestParam(value="companyZoneIds") String companyZoneIds
    );
	
}
