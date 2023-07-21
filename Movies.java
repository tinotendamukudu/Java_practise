
public class Movies {
	private String name;
	private String type;
	private int yearProduced;
	private int costOfEach;
	
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
	
	public void setcostOfEach(int costOfEach) {
		this.costOfEach=costOfEach;
	}
	
	public int getcostOfEach() {
		return costOfEach;
	}

	
	public static void main(String[] args) {
		Movies movie=new Movies();
		movie.setName("Creed");
		movie.settype("Action");
		movie.setyearProduced(2012);
		movie.setcostOfEach(10);
		
		System.out.println(movie.getName());
		System.out.println(movie.gettype());
		System.out.println(movie.getyearProduced());
		System.out.println(movie.getcostOfEach());
		

	}

}
