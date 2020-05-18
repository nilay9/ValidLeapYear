package com.leapyear;

public class LeapYear {

	public boolean checkLeapYear(String year) {
		int yearLenght = 4;
		int leapYear;
		if ( yearLenght != year.length()) { 
			throw new NumberFormatException();
		}
		for (int i = 0; i < yearLenght; i++) {
			if (!Character.isDigit(year.charAt(i))) {
				throw new NumberFormatException();
			} 
		}
		leapYear = Integer.parseInt(year);
		return true;
	}
}
