package Practisee;

class Lion{
	public static void makeSound() {
		System.out.println("Lions sound .......they roar");
	}
	
	public void graze() {
		System.out.println("They eat meat");
	}
	
}

class Cat extends Lion{
	public static void makeSound() {
		System.out.println("Cat sound .......they meow");
	}
	
	public void graze() {
		System.out.println("They do not eat meat");
	}
	
	
		
}

public class Animal1 extends Cat{
	public static void makeSound() {
		System.out.println("Animal sound .......different");
	}
	
	public void graze() {
		System.out.println("They eat everything");
	}
	
	
	
	
	public static void main(String[] args) {
		Lion l1=new Animal1();
		l1.makeSound();
		l1.graze();
	}

}
