package com.leapyear;

public class LeapYear {

	public boolean checkLeapYear(String year) {
		int yearLenght = 4;
		
		if ( yearLenght != year.length()) { 
			return false;
		}
		
		return true;
	}
}
