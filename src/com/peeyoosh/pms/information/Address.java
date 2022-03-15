package com.peeyoosh.pms.information;

public class Address {

	private final String street;
	private final String town;
	private final String city;
	private final String pincode;
	private final String state;

	private Address(AddressBuilder addressBuilder) {
		this.street = addressBuilder.street;
		this.town = addressBuilder.town;
		this.city = addressBuilder.city;
		this.pincode = addressBuilder.pincode;
		this.state = addressBuilder.state;
	}

	public String getStreet() {
		return street;
	}

	public String getTown() {
		return town;
	}

	public String getCity() {
		return city;
	}

	public String getPincode() {
		return pincode;
	}

	public String getState() {
		return state;
	}

	public static class AddressBuilder {
		private final String street;
		private String town;
		private final String city;
		private String state;
		private String pincode;

		public AddressBuilder(String street, String city) {
			this.street = street;
			this.city = city;
		}

		public AddressBuilder setTown(String town) {
			this.town = town;
			return this;
		}

		public AddressBuilder setState(String state) {
			this.state = state;
			return this;
		}

		public AddressBuilder setPincode(String pincode) {
			this.pincode = pincode;
			return this;
		}

		public Address build() {
			Address address = new Address(this);
			return address;
		}
	}

}
