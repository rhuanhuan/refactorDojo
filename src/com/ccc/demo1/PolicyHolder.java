package com.ccc.demo1;

public class PolicyHolder {
	private String name;
	private String streetNumber;
	private String apartmentNumber;
	private String streetName;
	private String city;
	private String state;
	private String zip;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String toDisplaString() {
		StringBuffer displayString = new StringBuffer();
		displayString.append(getName());
		displayString.append(":");
		displayString.append(getApartmentNumber()).append(" ");
		displayString.append(getStreetNumber()).append(" ");
		displayString.append(getStreetName()).append(",").append(" ");
		displayString.append(getCity()).append(" ");
		displayString.append(getState()).append(",").append(" ");
		displayString.append(getZip());
		return displayString.toString();
	}
}
