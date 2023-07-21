package com.Tino;

public class Shirt {
	
	public String color;
	public char size;
	
	

	public static void putOn() {
		System.out.println("Shirt is on");
		
	}
	
	public static void takeOff() {
		System.out.println("Shirt is off!");
	}
	
	public static void setColor(String newColor) {
		color = newColor;
	}
	
	public static void setSize(char newSize) {
		size = newColor;
	}

	public static void main(String[] args) {
	    Shirt s = new Shirt();
	    s.setColor("White");
	    s.setSize('M');
	    s.putOn();
	    
	    System.out.println(s.color);
	    System.out.println(s.size);

	}

}
