// how to handle different errors
public class Errors {

	public static void main(String[] args) {
		try {
			 
			 int []nums= {2,4,6};
			int x=nums[3];
			//System.out.println(x);
			int i=7;
			int a=0;
			System.out.println(i/a);
			
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("first error");
		}
			
		
		catch(ArithmeticException e ) {
			System.out.println("Error two handled");
		}
		catch(Exception e) {
			System.out.println("douBLE HANDLER");
						
		}			
			
		finally {
			System.out.println("just print anything");
		}
	}

}
