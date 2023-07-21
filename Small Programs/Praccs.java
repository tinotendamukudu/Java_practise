package com.Tino;

public class Praccs {
	int num;
	String name;
	double salary;
	
	public Praccs () {
		num=7;
		name="King";
		salary=30.50;
		
	}
	void addingTwo() {
		double output=0.30;
		double finalOutput=salary*output;
		System.out.println(finalOutput);
		
	}
	
	void addingTwo2() {
		double output=5.30;
		double finalOutput=salary*output;
		System.out.println(finalOutput);
	}
	
	public void stringSep() {
		String randomWord="TheguyDidnotCome";
		String newString=randomWord.substring(0,6);
		
		System.out.println(newString);
		
	}
	public void arrayString() {
		String randomWord="The,guyDid,notCome";
		String []newList=randomWord.split(",");
		System.out.println(newList);

		
			}

	public static void main(String[] args) {
		Praccs obj1=new Praccs();
		//obj1.addingTwo();
		//obj1.addingTwo2();
		obj1.stringSep();
		obj1.arrayString();
		
				

		
		

	}

}
