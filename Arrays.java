
public class Arrays {

	/*static void newArray() {
		int[] nums= {2,5,7,9,10};
		for (int i:nums) {
			System.out.println(" "+i+" ");
			
		}
	}
	public Arrays (){
		System.out.println("print me first");
	}
	public void test() {
		int[] nums= {2,5,7,9,10};
		System.out.println(nums[3]);
		for (int i:nums) {
			System.out.println(" "+i+" ");
			
		}
		}
	public void multiArray() {
		String [] fruits={"Guava","Mango","Peach","Cucumber"}; 
		for(String y:fruits) {
			System.out.println(y);
		}
		
		for (int x=0;x<fruits.length;x++) {
			System.out.println(x);
		}
	}*/
	public void multiArrays() {
		int[][] multi__array= {{1,3,5,7},{2,4,6,8},{9,6,3,7}};
		System.out.println(multi__array[2][2]);
		
	}
			
		
		
	

	

	public static void main(String[] args) {
		Arrays obj1=new Arrays();
		obj1.multiArrays();
		
	}

}
