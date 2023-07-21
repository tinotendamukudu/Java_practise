package myFirstOne;

interface  A {
	
	public void speak();
	
	public void hear();
	
	
}

class B implements A {
	public void speak() {
		System.out.println("Just what i wanted to say");
	}
	
	public void hear() {
		System.out.println("Thats music to my ears");
	}
	
}

public class Interfaces {

	public static void main(String[] args) {
		A j1=new B();
		j1.hear();
		j1.speak();

	}

}
