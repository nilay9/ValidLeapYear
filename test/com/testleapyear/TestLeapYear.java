package com.testleapyear;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import com.leapyear.LeapYear;

class TestLeapYear {

	@Test
	public void checkA4DigitYear() {
		LeapYear validator = new LeapYear();
		boolean result = validator.checkLeapYear("2000");
		assertTrue("first value", result);
	}

}
