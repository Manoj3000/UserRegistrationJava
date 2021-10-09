package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import utility.UtilRegex;

public class PasswordTest {

	@Test
	public void testValidPassword() {
		assertTrue("Manoj#123".matches(UtilRegex.password));
	}
	
	@Test
	public void testPasswordWithoutCapitalWord() {
		assertFalse("manoj#123".matches(UtilRegex.password));
	}
	
	@Test
	public void testPasswordWithoutSmallWord() {
		assertFalse("MANOJ#123".matches(UtilRegex.password));
	}
	
	@Test
	public void testPasswordWithoutNumbers() {
		assertFalse("Manoj#gaikwad".matches(UtilRegex.password));
	}
	
	@Test
	public void testPasswordWithoutSpecialCharacter() {
		assertFalse("Manoj123".matches(UtilRegex.password));
	}
	
}
