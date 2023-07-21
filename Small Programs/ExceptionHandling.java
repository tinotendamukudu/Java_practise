package com.Tino;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		try {
		int num=6;
		int num1=0;
		int output;
		output=num/num1;
		System.out.println(output);
		}
		catch(Exception e) {
			System.out.println("You cannot divide the number by zero");
			System.out.println("Print the second line");
		}
		finally {
			System.out.println("All is well");
		}
		
		
		
	}

}
