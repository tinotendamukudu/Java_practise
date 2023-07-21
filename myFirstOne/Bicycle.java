package myFirstOne;

interface BicyleCycling {
	int gear=3;
	int increaseSpeed(int gear);
	int decreaseSpeed(int gear);
	
	
 public class Bicycle implements BicyleCycling {

	
	public int increaseSpeed (int gear) {
		return gear = gear+1;
	}
	public int decreaseSpeed(int gear) {
		return gear= gear-1;
		
	}	
		
	
	
			
}
	
	
	

	public static void main(String[] args) {
		Bicycle bi = new Bicycle ();
		System.out.println(bi.increaseSpeed (4));
		System.out.println(bi.decreaseSpeed (5));
	}

}




