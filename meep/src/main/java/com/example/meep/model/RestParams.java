package com.example.meep.model;

public class RestParams {
	
    private String lowerLeftLatLon;
    private String upperRightLatLon;
    private String companyZoneIds;
    private String zone;
    
    
	/**
	 * @return the lowerLeftLatLon
	 */
	public String getLowerLeftLatLon() {
		return lowerLeftLatLon;
	}
	/**
	 * @param lowerLeftLatLon the lowerLeftLatLon to set
	 */
	public void setLowerLeftLatLon(String lowerLeftLatLon) {
		this.lowerLeftLatLon = lowerLeftLatLon;
	}
	
	
	/**
	 * @return the upperRightLatLon
	 */
	public String getUpperRightLatLon() {
		return upperRightLatLon;
	}
	/**
	 * @param upperRightLatLon the upperRightLatLon to set
	 */
	public void setUpperRightLatLon(String upperRightLatLon) {
		this.upperRightLatLon = upperRightLatLon;
	}
	
	
	/**
	 * @return the companyZoneIds
	 */
	public String getCompanyZoneIds() {
		return companyZoneIds;
	}
	/**
	 * @param companyZoneIds the companyZoneIds to set
	 */
	public void setCompanyZoneIds(String companyZoneIds) {
		this.companyZoneIds = companyZoneIds;
	}
	
	
	/**
	 * @return the zone
	 */
	public String getZone() {
		return zone;
	}
	/**
	 * @param zone the zone to set
	 */
	public void setZone(String zone) {
		this.zone = zone;
	}
    

}
