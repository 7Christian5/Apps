package com.example.meep.model;

import java.math.BigDecimal;

public class Resource {
	
	private String id;
	private String name;
	private BigDecimal x;
	private BigDecimal y;
	private String licencePlate;
	private Integer range;
	private String batteryLevel;
	private Integer seats;
	private String model;
	private String resourceImageId;
	private BigDecimal pricePerMinuteParking;
	private BigDecimal pricePerMinuteDriving;
	private Boolean realTimeData;
	private String engineType;
	private String resourceType;
	private Long companyZoneId;
	
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	/**
	 * @return the x
	 */
	public BigDecimal getX() {
		return x;
	}
	/**
	 * @param x the x to set
	 */
	public void setX(BigDecimal x) {
		this.x = x;
	}
	
	
	/**
	 * @return the y
	 */
	public BigDecimal getY() {
		return y;
	}
	/**
	 * @param y the y to set
	 */
	public void setY(BigDecimal y) {
		this.y = y;
	}
	
	
	/**
	 * @return the licencePlate
	 */
	public String getLicencePlate() {
		return licencePlate;
	}
	/**
	 * @param licencePlate the licencePlate to set
	 */
	public void setLicencePlate(String licencePlate) {
		this.licencePlate = licencePlate;
	}
	
	
	/**
	 * @return the range
	 */
	public Integer getRange() {
		return range;
	}
	/**
	 * @param range the range to set
	 */
	public void setRange(Integer range) {
		this.range = range;
	}
	
	
	/**
	 * @return the batteryLevel
	 */
	public String getBatteryLevel() {
		return batteryLevel;
	}
	/**
	 * @param batteryLevel the batteryLevel to set
	 */
	public void setBatteryLevel(String batteryLevel) {
		this.batteryLevel = batteryLevel;
	}
	
	
	/**
	 * @return the seats
	 */
	public Integer getSeats() {
		return seats;
	}
	/**
	 * @param seats the seats to set
	 */
	public void setSeats(Integer seats) {
		this.seats = seats;
	}
	
	
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	
	
	/**
	 * @return the resourceImageId
	 */
	public String getResourceImageId() {
		return resourceImageId;
	}
	/**
	 * @param resourceImageId the resourceImageId to set
	 */
	public void setResourceImageId(String resourceImageId) {
		this.resourceImageId = resourceImageId;
	}
	
	
	/**
	 * @return the pricePerMinuteParking
	 */
	public BigDecimal getPricePerMinuteParking() {
		return pricePerMinuteParking;
	}
	/**
	 * @param pricePerMinuteParking the pricePerMinuteParking to set
	 */
	public void setPricePerMinuteParking(BigDecimal pricePerMinuteParking) {
		this.pricePerMinuteParking = pricePerMinuteParking;
	}
	
	
	/**
	 * @return the pricePerMinuteDriving
	 */
	public BigDecimal getPricePerMinuteDriving() {
		return pricePerMinuteDriving;
	}
	/**
	 * @param pricePerMinuteDriving the pricePerMinuteDriving to set
	 */
	public void setPricePerMinuteDriving(BigDecimal pricePerMinuteDriving) {
		this.pricePerMinuteDriving = pricePerMinuteDriving;
	}
	
	
	/**
	 * @return the realTimeData
	 */
	public Boolean getRealTimeData() {
		return realTimeData;
	}
	/**
	 * @param realTimeData the realTimeData to set
	 */
	public void setRealTimeData(Boolean realTimeData) {
		this.realTimeData = realTimeData;
	}
	
	
	/**
	 * @return the engineType
	 */
	public String getEngineType() {
		return engineType;
	}
	/**
	 * @param engineType the engineType to set
	 */
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	
	
	/**
	 * @return the resourceType
	 */
	public String getResourceType() {
		return resourceType;
	}
	/**
	 * @param resourceType the resourceType to set
	 */
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}
	
	
	/**
	 * @return the companyZoneId
	 */
	public Long getCompanyZoneId() {
		return companyZoneId;
	}
	/**
	 * @param companyZoneId the companyZoneId to set
	 */
	public void setCompanyZoneId(Long companyZoneId) {
		this.companyZoneId = companyZoneId;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Resource [id=" + getId() + ", name=" + getName() + ", x=" + getX() + ", y=" + getY() + ", licencePlate=" + getLicencePlate()
				+ ", range=" + getRange() + ", batteryLevel=" + getBatteryLevel() + ", seats=" + getSeats() + ", model=" + getModel()
				+ ", resourceImageId=" + getResourceImageId() + ", pricePerMinuteParking=" + getPricePerMinuteParking()
				+ ", pricePerMinuteDriving=" + getPricePerMinuteDriving() + ", realTimeData=" + getRealTimeData()
				+ ", engineType=" + getEngineType() + ", resourceType=" + getResourceType() + ", companyZoneId=" + getCompanyZoneId()
				+ "]";
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Resource other = (Resource) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}
	
	
	
}
