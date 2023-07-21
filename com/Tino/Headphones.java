package com.Tino;

public class Headphones {
	
	String charge = "Micro usb";
	String [] controls = {"power","volume","skip","play/pause"};
	String color = "Red/black";
	
	static boolean power = false;
	static int volume = 0;
	
	public static void powerOn() {
		power = true;
	}
	
	public static void powerOff() {
		power = false;
	}
	
	public static void volumeUp() {
		volume++;
	}
	
	public static void volumeDown() {
		volume--;
	}
	
	

	public static void main(String[] args) {
		Headphones h = new Headphones();
		
		System.out.println(h.color);
		System.out.println(h.charge);
		System.out.println(h.controls);
		System.out.println(h.power);
		System.out.println(h.volume--);
		
		
		
		
	}

}
