package com.testleapyear;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.leapyear.LeapYear;

class TestLeapYear {

	@Test
	public void checkA4DigitYear() {
		LeapYear validator = new LeapYear();
		boolean result = validator.checkLeapYear("2000");
		assertTrue("first value", result);
	}
	
	@Test
	public void checkMoreThan4DigitYear() {
		LeapYear validator = new LeapYear();
		Assertions.assertThrows(NumberFormatException.class, () -> {
			validator.checkLeapYear("20500");
		});
	}
	
	@Test
	public void checkIfValidIntegerYear() {
		Assertions.assertThrows(NumberFormatException.class, () -> {
			LeapYear validator = new LeapYear();
			validator.checkLeapYear("20a0");
		});
		
	}

}
