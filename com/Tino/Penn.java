package com.Tino;

public class Penn {


	String type = "gel";
	String color = "blue";
	int point = 10;
	
	static boolean clicked = false;
	
	public static void click() {
		clicked = true;
	}
	
	public static void unclick() {
		clicked = false;
	}
	    

	public static void main(String[] args) {
		Penn p = new Penn();
		
		System.out.println(p.color);
		System.out.println(p.point);
		System.out.println(p.type);
		System.out.println(p.clicked);
		
		p.click();
		
		System.out.println(p.clicked);

	}

}
