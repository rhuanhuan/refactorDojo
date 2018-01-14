package com.ccc.demo7;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PolicyHolderTest {
	@Test
	public void testGetDisplayStringDisplaysInCorrectFormat() {
		PolicyHolder policyHolder = new PolicyHolder();
		Address address = new Address();
		address.setStreetNumber("734");
		address.setStreetName("Crane Canyon Place");
		address.setCity("Round Rock");
		address.setState("TX");
		address.setZip("78665");
		policyHolder.setAdress(address);
		policyHolder.setName("Vijay");
		assertEquals("Vijay\n734, Crane Canyon Place, Round Rock, TX 78665",
				policyHolder.getDisplayString());
	}
}
