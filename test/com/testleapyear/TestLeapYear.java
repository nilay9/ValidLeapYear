package com.testleapyear;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.leapyear.LeapYear;

class TestLeapYear {

	@Test
	public void checkA4DigitYear() {
		LeapYear validator = new LeapYear();
		String result = validator.checkLeapYear("2008");
		assertEquals("Leap Year",result);
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
	
	@Test
	public void checkIfYearIsDivisibleBy4AndNot100ThanIsALeapYear() {
			LeapYear validator = new LeapYear();
			String result = validator.checkLeapYear("2008");
			assertEquals("Leap Year",result);
	}
	
}
