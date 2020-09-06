package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Wristwatch;
import model.WristwatchLogic;

public class WristwatchLogicTest {
	Wristwatch wristwatch = new Wristwatch("Irish");
	WristwatchLogic wwl = new WristwatchLogic();

	@Before
	public void setUp() throws Exception {
		wristwatch.setNew(false);
		wristwatch.setMsrp(2000);
	}

	@Test
	public void testIsPremier() {
		assertFalse(wwl.isPremier(wristwatch));
	}
	
	@Test
	public void testPrint() {
		assertEquals("This is a(n) " + wristwatch.getCountry() + " wristwatch.", wwl.printOriginDescription(wristwatch));
	}

}
