package com.Tino;

import java.time.LocalDate;
import java.util.ArrayList;

public class Engineering extends EngineeringCo{
	String emailaddress;
	String sname;
	
	public void setemailAddress(String email) {
		emailaddress=email;
		
	}
	
	public String getemailAddress() {
		emailaddress=sname+name+"@gmail.com";
		return emailaddress;
			
	}
	
	public void setsName(String sname) {
		this.sname=sname;
	}
	
	public String getsName() {
		return sname;
	}
	
	public double salaryRaise() {
		double Salary=getSalary()*0.075;
		double newSalary=Salary+getSalary();
		//System.out.println(newSalary);
		return newSalary;
	}
	

	public static void main(String[] args) {
		Engineering engineer=new Engineering();
		ArrayList<Object> engines=new ArrayList<Object>();
		engineer.setName("Phineas");
		engineer.setdateOfEnrollment(LocalDate.of(2006, 04, 10));
		engineer.setSalary(400.50);
		engineer.setsName("Daniels");
		
		
		String newOutput=engineer.getName();
		LocalDate newOutput1=engineer.getdateOfEnrollment();
		double newOutput2=engineer.salaryRaise();
		String newEmail=engineer.getemailAddress();
		String newOutput3=engineer.getsName();
		engines.add(newOutput);
		engines.add(newOutput1);
		engines.add(newOutput2);
		engines.add(newEmail);
		engines.add(newOutput3);
		System.out.println(engines);


	}

}
