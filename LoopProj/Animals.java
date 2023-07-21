
public class Animals {
	

		public void colour() {
			System.out.println("stue");
		}
		
		public static void legs() {
			System.out.println("i have 4 legs");
		}

	public static void main(String[] args) {
		Animals anim1 = new Animals();
		anim1.colour();
	
		
		//Lion lili = new Lion();
		//lili.colour();
		//Chicken chick =new Chicken();
		//chick.legs();

	}

}
class Lion extends Animals {
	
	
	void sound() {
		System.out.println("lions roars !!!!!!");
	}
	
	
	
	
}


class Goat extends Lion {
	
	void sound() {
		System.out.println("a goat mweeeeee!!");
	}
	public  static void legs() {
		System.out.println("I just dont know");
	}
	
	
}

class Chicken extends Goat{

	void sound() {
		System.out.println("a chicken crkkkkkk!!");
	}

	
	
}
