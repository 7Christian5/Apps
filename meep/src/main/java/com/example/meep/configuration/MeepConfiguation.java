package com.example.meep.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.meep.model.RestParams;

@Configuration
public class MeepConfiguation {

	@Value("${meep.client.param.lowerLeftLatLon}")
	private String lowerLeftLatLon;
	
	@Value("${meep.client.param.upperRightLatLon}")
	private String upperRightLatLon;
	
	@Value("${meep.client.param.companyZoneIds}")
	private String companyZoneIds;
	
	@Value("${meep.client.param.zone}")
	private String zone;
	
	@Bean
	public RestParams params() {
		RestParams params = new RestParams();
		params.setLowerLeftLatLon(lowerLeftLatLon);
		params.setUpperRightLatLon(upperRightLatLon);
		params.setCompanyZoneIds(companyZoneIds);
		params.setZone(zone);
		return params;
	}
	
}
