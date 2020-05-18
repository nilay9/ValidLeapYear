package com.leapyear;

public class LeapYear {
	private static final int YEAR_LENGHT = 4;
	
	public String checkLeapYear(String year) {
		int leapYear;
		leapYear = validatinInput(year);
		
		return findLeapYear(leapYear);
	}

	private String findLeapYear(int leapYear) {
		if ((leapYear % 4 == 0) && (leapYear % 100 != 0) || (leapYear % 400 != 0) && (leapYear % 100 == 0)) {
			return "Leap Year";
		} 
		return "Not a Leap Year";
	}

	private Integer validatinInput(String year) {
		if ( YEAR_LENGHT != year.length()) { 
			throw new NumberFormatException();
		}
		for (int i = 0; i < YEAR_LENGHT; i++) {
			if (!Character.isDigit(year.charAt(i))) {
				throw new NumberFormatException();
			} 
		}
		return Integer.parseInt(year);
	}
}
