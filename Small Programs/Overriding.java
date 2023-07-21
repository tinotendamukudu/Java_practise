package com.Tino;

import java.util.ArrayList;

public class Overriding {
	ArrayList<String> num1=new ArrayList<String>();
	
	public void test1() {
		num1.add("John");
		num1.add("Simpiwe");
		num1.add("Lebogang");
		num1.add("King");
		System.out.println(num1);
	}
	
	public int test2(int result,int num) {
		int total=num*result;
		return total;
			
	}
		
		

	public static void main(String[] args) {
		Overriding obj1=new Overriding();
		obj1.test1();
		int finalResult=obj1.test2(20, 30);
		System.out.println(finalResult);
		Overriding obj=new Overriding();
		obj.test1();
		int finalResult1=obj.test2(20, 30);
		System.out.println(finalResult1);
		
		
		

	}

}
