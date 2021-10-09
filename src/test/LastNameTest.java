package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import utility.UtilRegex;

public class LastNameTest {

	@Test
	public void testFirstLetterCapital() {
		assertTrue("Gaikwad".matches(UtilRegex.name));
	}
	
	@Test
	public void testFirstTwoLetterCapital() {
		assertFalse("GAikwad".matches(UtilRegex.name));
	}
	
	@Test
	public void testCapitalLetterPositionWrong() {
		assertFalse("gaikwAd".matches(UtilRegex.name));
	}
	
	@Test
	public void testFirstLetterSmall() {
		assertFalse("gaikwad".matches(UtilRegex.name));
	}

	@Test
	public void testFirstNameWithNumer() {
		assertFalse("gaikwad123".matches(UtilRegex.name));
	}
	
	@Test
	public void testFirstNameWithSpecialCharacter() {
		assertFalse("G@!kw@d".matches(UtilRegex.name));
	}
	
	@Test
	public void testFirstNameMinLengthIs3() {
		assertFalse("Ga".matches(UtilRegex.name));
	}
	
	@Test
	public void testFirstNameMinLength() {
		assertTrue("Gai".matches(UtilRegex.name));
	}
}
