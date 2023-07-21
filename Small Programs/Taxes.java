package com.Tino;

import java.util.Scanner;

public class Taxes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Product1");
		String productOne=sc.nextLine();
		
		System.out.println("Product2");
		String productTwo=sc.nextLine();
		
		System.out.println("The Price of Product1");
		double priceOfEach=sc.nextDouble();
		
		System.out.println("The Price of Product2");
		double priceOfEach2=sc.nextDouble();
		
		System.out.println("The Quantity sold in a month");
		int quantityOne=sc.nextInt();
		
		System.out.println("The Quantity sold in a month of product 2");
		int quantityTwo=sc.nextInt();
		
		
		
		double totalOutput;
		totalOutput=quantityOne*priceOfEach;
		System.out.println(totalOutput);
		
		double totalOutput1;
		totalOutput1=quantityTwo*priceOfEach2;
		System.out.println(totalOutput1);
		
		
		double VAT=1.45;
		double newVAT=VAT*priceOfEach;
		
		
		double newVATFor2=VAT*priceOfEach2;
		
		System.out.println("The VAT to be paid to ZIMRA is as follows: ");
		double totalpaidVAT=newVAT*quantityOne;
		System.out.println(productOne+":"+totalpaidVAT);
		
		double totalpaidVATfor=newVATFor2*quantityTwo;
		System.out.println(productTwo+":"+totalpaidVATfor);
		
		
		
				

}
}