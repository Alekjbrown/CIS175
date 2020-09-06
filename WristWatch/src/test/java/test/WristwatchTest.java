package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Wristwatch;

public class WristwatchTest {
	String country = "Irish";
	Wristwatch wristwatch = new Wristwatch(country);
	
	@Before
	public void setUp() throws Exception {
		wristwatch.setNew(true);
	}

	@Test
	public void testCountry() {
		System.out.println("Inside testCountry()");
		assertEquals(country, wristwatch.getCountry());
	}
	
	@Test
	public void testNew() {
		assertTrue(wristwatch.isNew() == true);
	}

}
