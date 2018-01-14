package com.ccc.demo2;

public class Address {
	private String streetNumber;
	private String apartmentNumber;
	private String streetName;
	private String city;
	private String state;
	private String zip;

	@Override
	public String toString() {
		final StringBuffer value = new StringBuffer();
		if (getStreetNumber() != null && !getStreetNumber().trim().isEmpty()) {
			value.append(getStreetNumber());
			value.append(", ");
		}
		value.append(getStreetName());
		value.append(", ");
		if (getApartmentNumber() != null
				&& !getApartmentNumber().trim().isEmpty()) {
			value.append(getApartmentNumber());
			value.append(", ");
		}
		value.append(getCity());
		value.append(", ");
		value.append(getState());
		value.append(" ");
		value.append(getZip());
		return value.toString();
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setApartmentNumber(String apartmentNumber) {
		this.apartmentNumber = apartmentNumber;
	}

	public String getApartmentNumber() {
		return apartmentNumber;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getZip() {
		return zip;
	}

}
