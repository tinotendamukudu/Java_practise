
public class Practise {
	String fname;
	int age;
	static String co;
	int salary;
	
	
	static {
		co="Ndikoko";
	}
	public Practise() {
		co="Ndikoko";
		
		 
	}
	public void show() {
		System.out.println(fname +":"+age+":"+co+":"+salary);
	}
	
	
	
	

	
	public static void main(String[] args) {
		
		Practise tino=new Practise();
		tino.fname="Tino";
		tino.age=21;
		//tino.co="Quest";	
		tino.salary=21000;
		tino.show();
		
		Practise king=new Practise();
		king.fname="King";
		king.age=23;
		//king.co="Geeal";	
		king.salary=21000;
		king.show();
		
		
		

		

	}

}
