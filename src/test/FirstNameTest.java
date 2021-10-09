package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import utility.UtilRegex;

public class FirstNameTest {

	@Test
	public void testFirstLetterCapital() {
		assertTrue("Manoj".matches(UtilRegex.name));
	}
	
	@Test
	public void testFirstTwoLetterCapital() {
		assertFalse("MAnoj".matches(UtilRegex.name));
	}
	
	@Test
	public void testCapitalLetterPositionWrong() {
		assertFalse("mAnoj".matches(UtilRegex.name));
	}
	
	@Test
	public void testFirstLetterSmall() {
		assertFalse("manoj".matches(UtilRegex.name));
	}

	@Test
	public void testFirstNameWithNumer() {
		assertFalse("manoj123".matches(UtilRegex.name));
	}
	
	@Test
	public void testFirstNameWithSpecialCharacter() {
		assertFalse("m@noj!".matches(UtilRegex.name));
	}
	
	@Test
	public void testFirstNameMinLengthIs3() {
		assertFalse("Om".matches(UtilRegex.name));
	}
	
	@Test
	public void testFirstNameMinLength() {
		assertTrue("Sai".matches(UtilRegex.name));
	}
	
}
