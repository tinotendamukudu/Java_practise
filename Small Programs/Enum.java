package com.Tino;

public enum Enum {
	MONDAY,
	TUESDAY,
	FRIDAY,
	SUNDAY;
	
	void setMonday() {
		System.out.println("My favourite day of the week is"+" "+FRIDAY);
	}

	public static void main(String[] args) {
		Enum day=Enum.MONDAY;
		//System.out.println(day);
		//day.setMonday();
		
		for(Enum a:Enum.values()) {
			System.out.println(a);
		}
	
	}

}
