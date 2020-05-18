package com.leapyear;

public class LeapYear {

	public String checkLeapYear(String year) {
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
		if ((leapYear % 4 == 0) && (leapYear % 100 != 0) || (leapYear % 400 != 0) && (leapYear % 100 == 0)) {
			return "Leap Year";
		} 
		return "Not a Leap Year";
		
	}
}
