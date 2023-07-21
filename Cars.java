/*
Name:Moses Mukudu
Reg_number:R215070Z
Program:HBMSDA
Year:2

*/

//Declaration of class Cars
public class Cars {
	private String name;
	private String type;
	private int yearProduced;
	private String costOfEach;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void settype(String type) {
		this.type=type;
	}
	
	public String gettype() {
		return type;
	}
	
	public void setyearProduced(int yearProduced) {
		this.yearProduced=yearProduced;
	}
	
	public int getyearProduced() {
		return yearProduced;
	}
	
	public void setcostOfEach(String costOfEach) {
		this.costOfEach=costOfEach;
	}
	
	public String getcostOfEach() {
		return costOfEach;
	}

	
	public static void main(String[] args) {
		//Creating Object car
		Cars car=new Cars();
		car.setName("Toyota");
		car.settype("Offroad");
		car.setyearProduced(2014);
		car.setcostOfEach("$2000");
		
		System.out.println(car.getName());
		System.out.println(car.gettype());
		System.out.println(car.getyearProduced());
		System.out.println(car.getcostOfEach());
		

	}

}




