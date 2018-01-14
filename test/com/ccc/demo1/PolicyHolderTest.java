package com.ccc.demo1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
	public class PolicyHolderTest {
		@Test
		public void testShouldProvidePolicyInfo() {
			PolicyHolder policyHolder = new PolicyHolder();
			policyHolder.setAge(34);
			policyHolder.setName("John Doe");
			policyHolder.setApartmentNumber("10");
			policyHolder.setCity("Zion");
			policyHolder.setState("IL");
			policyHolder.setStreetName("Main");
			policyHolder.setStreetNumber("1234");
			policyHolder.setZip("60666");
			assertEquals("John Doe:10 1234 Main, Zion IL, 60666",
					policyHolder.toDisplaString());
		}
	}
