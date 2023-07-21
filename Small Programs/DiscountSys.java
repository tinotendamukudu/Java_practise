package com.Tino;
import java.util.Scanner;
public class DiscountSys {
	//private String Gold;
	//private String Silver;
	//double discount;
	//int service_value;
	
	/*public double forGold(double discount) {
		
	}*/
	

	public static void main(String[] args) {
		Scanner m1=new Scanner(System.in);
		
		System.out.println("Name :");
		String memberName=m1.nextLine();
		
		System.out.println("The membershipType please :");
		String member=m1.nextLine();
		
		System.out.println("The service value is :");
		int serviceValue=m1.nextInt();
		
		System.out.println("The discount offered is :");
		double discount=m1.nextDouble();
		
		
		String[] membershipType= {"Gold","Silver","No_Ownership"};
		
		//double discount=1.0;
		//double discount1=0.15;
		//double discount2=0.1;
		double newDiscount=1;
		if (member=="Gold") {
			newDiscount=discount*serviceValue;
			System.out.println(newDiscount);
		}
		else if(member=="Silver") {
			newDiscount=discount*serviceValue;
			System.out.println(newDiscount);
		}
		else if("No_Ownership" != null) {
			newDiscount=discount*serviceValue;
			System.out.println(newDiscount);
		}
		else {
			System.out.println("All is fine thank you");
		}
		String output="Good day Mr"+" "+memberName+" "+"Your membership is"+" "+member+" "+"your total bill is "+" "+newDiscount+" "+"After a discount of "+" "+discount;
		System.out.println(output);
	}

}
