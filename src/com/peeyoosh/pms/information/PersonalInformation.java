package com.peeyoosh.pms.information;

public class PersonalInformation implements Information {

	private String firstName;
	private String LastName;
	private Address address;
	private String dateOfJoining; // For simplicity date is taken as string

	public PersonalInformation(String firstName, String lastName, Address address, String dateOfJoining) {
		super();
		this.firstName = firstName;
		LastName = lastName;
		this.address = address;
		this.dateOfJoining = dateOfJoining;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

}
