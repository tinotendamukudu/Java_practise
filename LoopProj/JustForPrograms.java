
public class JustForPrograms {
	private String name;
	private int age;
	private int books;
	
	public void setName(String tiya) {
		this.name = tiya;
	}
	
	public String getName() {
		return name;
	}
	
	
	
	public static void main(String[] args) {
		JustForPrograms programs = new JustForPrograms();
		programs.setName("tiyapo"); 
		System.out.println(programs.getName());
		

	}

}