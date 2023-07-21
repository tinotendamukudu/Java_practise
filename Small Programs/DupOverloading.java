package com.Tino;

public class DupOverloading extends Overloading {

	public static void main(String[] args) {
		DupOverloading d = new DupOverloading();
		//d.kick(2,"Dexter");
		String b=d.kick("Dexter");
		System.out.println(b);
		

	}

}
