package com.ccc.demo7;

public class PolicyHolder {
	private String name;
	private Address adress;
	private int age;

	public String getDisplayString() {
		return getName() + "\n" + getAdress();
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAdress(Address adress) {
		this.adress = adress;
	}

	public Address getAdress() {
		return adress;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
}
