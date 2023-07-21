package com.Tino;
import java.time.LocalDate;
import java.util.ArrayList;

public class EngineeringCo {
	
	String name;
	LocalDate dateOfEnrollment;
	double salary;
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setdateOfEnrollment(LocalDate date) {
		dateOfEnrollment=date;
	}
	
	public LocalDate getdateOfEnrollment() {
		return dateOfEnrollment;
	}
	
	public void setSalary(double salary) {
		this.salary=salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	void addingToArray() {
		
		
		
	}
	
	
	

	public static void main(String[] args) {
		ArrayList<Object>list=new ArrayList<Object>();
		EngineeringCo normalStaff=new EngineeringCo();
		
		
		normalStaff.setName("Teeman");
		normalStaff.setdateOfEnrollment(LocalDate.of(2012, 06, 15));
		normalStaff.setSalary(300.00);
		
		String newOutput=normalStaff.getName();
		LocalDate newOutput1=normalStaff.getdateOfEnrollment();
		double newOutput2=normalStaff.getSalary();
		list.add(newOutput);
		list.add(newOutput1);
		list.add(newOutput2);
		System.out.println(list);
		
		
		
		

	}

}


	
	




