package com.testleapyear;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.leapyear.LeapYear;

class TestLeapYear {
	
	private LeapYear validator;
	
	@BeforeEach
	public void initBefore() {
		validator = new LeapYear();
	}
	

	@Test
	public void checkA4DigitYear() {
		String result = validator.checkLeapYear("2008");
		assertEquals("Leap Year",result);
	}
	
	@Test
	public void checkMoreThan4DigitYear() {
		Assertions.assertThrows(NumberFormatException.class, () -> {
			validator.checkLeapYear("20500");
		});
	}
	
	@Test
	public void checkIfValidIntegerYear() {
		Assertions.assertThrows(NumberFormatException.class, () -> {
			validator.checkLeapYear("20a0");
		});
	}
	
	@Test
	public void checkIfYearIsDivisibleBy4AndNot100ThanIsALeapYear() {
			String result = validator.checkLeapYear("2012");
			assertEquals("Leap Year",result);
	}
	
	@Test
	public void checkIfYearIsDivisibleBy100AndNot400ThanIsNotALeapYear() {
			String result = validator.checkLeapYear("2100");
			assertEquals("Leap Year",result);
	}
	

}
