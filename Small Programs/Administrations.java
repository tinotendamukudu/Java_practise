package com.Tino;

import java.time.LocalDate;
import java.util.ArrayList;

public class Administrations extends EngineeringCo{
	private String phoneNumber;
	
	
	public void setphoneNumber(String phoneNumber) {
		this.phoneNumber=phoneNumber;
	}
	
	public String getphoneNumber() {
		return phoneNumber;
	}
	
	public double salaryRaise() {
		double Salary=getSalary()*0.05;
		double newSalary=Salary+getSalary();
		//System.out.println(newSalary);
		return newSalary;
	}

	
	public static void main(String[] args) {
		ArrayList<Object> administration=new ArrayList<Object>();
		Administrations adstaff=new Administrations();
		adstaff.setName("Phineas");
		adstaff.setdateOfEnrollment(LocalDate.of(2010, 04, 01));
		adstaff.setSalary(200.50);
		adstaff.setphoneNumber("+263773453980");
		
		String newOutput=adstaff.getName();
		LocalDate newOutput1=adstaff.getdateOfEnrollment();
		double newOutput2=adstaff.salaryRaise();
		String newOutput3=adstaff.getphoneNumber();
		administration.add(newOutput);
		administration.add(newOutput1);
		administration.add(newOutput2);
		administration.add(newOutput3);
		System.out.println(administration);
			
						

}

	


	

}
