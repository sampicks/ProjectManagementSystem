package com.peeyoosh.pms.information;

public class Address {

	private String street;
	private String town;
	private String city;
	private String pincode;
	private String state;
	
	
	public Address(String street, String town, String city, String pincode, String state) {
		super();
		this.street = street;
		this.town = town;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
	}
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
}
