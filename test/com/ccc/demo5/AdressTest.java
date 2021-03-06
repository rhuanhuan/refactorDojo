package com.ccc.demo5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AdressTest {
	@Test
	public void testToString() {
		Adress address = new Adress();
		address.setStreetNumber("734");
		address.setStreetName("Crane Canyon Place");
		address.setCity("Round Rock");
		address.setState("TX");
		address.setZip("78665");
		assertEquals("734, Crane Canyon Place, Round Rock, TX 78665",
				address.toString());
	}

	@Test
	public void testToStringWithoutStreetNumber() {
		Adress address = new Adress();
		address.setStreetName("Crane Canyon Place");
		address.setCity("Round Rock");
		address.setState("TX");
		address.setZip("78665");
		assertEquals("Crane Canyon Place, Round Rock, TX 78665",
				address.toString());
	}

	@Test
	public void testToStringWithoutZip() {
		Adress address = new Adress();
		address.setStreetNumber("734");
		address.setStreetName("Crane Canyon Place");
		address.setCity("Round Rock");
		address.setState("TX");
		assertEquals("734, Crane Canyon Place, Round Rock, TX",
				address.toString());
	}
}
