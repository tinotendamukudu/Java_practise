package com.Tino;

public enum Weekdays {
	MONDAY,
	TUESDAY,
	FRIDAY;
	
	void setEnum() {
		System.out.println("My favourite day of the week is "+FRIDAY);
	}

	public static void main(String[] args) {
		//Weekdays day=Weekdays.FRIDAY;
		//System.out.println(day);
		Weekdays day=Weekdays.MONDAY;
		System.out.println(day);
		day.setEnum();
	}

}
