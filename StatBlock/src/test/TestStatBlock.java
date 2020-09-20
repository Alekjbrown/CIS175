package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.StatBlock;

public class TestStatBlock {
	StatBlock sb = new StatBlock(16,14,12,10,8,6);

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSetModifiers() {
		assertTrue(sb.getCharisma()==0);
		assertTrue(sb.getConstitution()==0);
	}
	
	public void testCalcMod() {
		assertEquals(5,sb.calcMod(20));
		assertEquals(4,sb.calcMod(18));
		assertEquals(3,sb.calcMod(16));
		assertEquals(2,sb.calcMod(14));
		assertEquals(1,sb.calcMod(12));
		assertEquals(0,sb.calcMod(10));
		assertEquals(-1,sb.calcMod(8));
		assertEquals(-2,sb.calcMod(6));
		assertEquals(-3,sb.calcMod(4));
		assertEquals(-4,sb.calcMod(2));
		assertEquals(-5,sb.calcMod(1));
	}

}
