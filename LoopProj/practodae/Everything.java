package practodae;

public class Everything {
	static String name="Tatenda";
	static int age=23;
	char letter='w';
	boolean isItTrue=true;
	double number=34.0;
	float size=4.0f;
	
	
	public void yourName() {
		System.out.println("my name is tare");
	}
	
	public boolean addNumbers() {
		boolean output=false;
		return output;
		
		
	}
	public void multiplyNumbers(int num1,int num2) {
		int output=num1*num2;
		//System.out.println(output);
		
	
	}
	
	
	static String surname="clive";
	
	public static void main(String[] args) {
		
		Everything tafadzwa=new Everything();
		//System.out.println(tafadzwa.name);
		//System.out.println(tafadzwa.age);
		//System.out.println(tafadzwa.isItTrue);
		Everything tafex=new Everything();
		tafex.yourName();
		//System.out.println(tafadzwa.size);
		boolean addition=tafex.addNumbers();
		System.out.println(addition);
		//System.out.println(tafadzwa.multiplyNumbers(6,6));
		
		
		
		
	}

}
