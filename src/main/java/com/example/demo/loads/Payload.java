package com.example.demo.loads;

import java.util.UUID;

/*import java.util.UUID;*/

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Payload {
	
	private String loadingPoint;
	private String unloadingPoint;
	private String productType;
	private String truckType;
	private String noOfTrucks;
	private String weight;
	/* Optional<String> comment; */
    private String date;
    @Id
    private UUID shipperId;
	public Payload(String loadingPoint, String unloadingPoint, String productType, String truckType,
			String noOfTrucks, String weight, String date, UUID shipperId) {
		super();
		
		this.loadingPoint = loadingPoint;
		this.unloadingPoint = unloadingPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.noOfTrucks = noOfTrucks;
		this.weight = weight;
		/* this.comment = comment; */
		this.date = date;
		this.shipperId = shipperId;
	}
	public Payload() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getLoadingPoint() {
		return loadingPoint;
	}
	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}
	public String getUnloadingPoint() {
		return unloadingPoint;
	}
	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getTruckType() {
		return truckType;
	}
	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}
	public String getNoOfTrucks() {
		return noOfTrucks;
	}
	public void setNoOfTrucks(String noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}

	/*
	 * public Optional<String> getComment() { return comment; } public void
	 * setComment(Optional<String> comment) { this.comment = comment; }
	 */
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public UUID getShipperId() {
		return shipperId;
	}
	public void setShipperId(UUID shipperId) {
		this.shipperId = shipperId;
	}
    

}
