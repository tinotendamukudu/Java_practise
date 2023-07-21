package myFirstOne;

public class AreaCalculation {
    int radius;
    int length;
    int width;
    double totalarea;
    static double PI = Math.PI;
    
    int area(int length, int width) {
    	totalarea = length*width;
    	return (int) totalarea;
    }
	
	double area(int radius) {
		totalarea = PI * radius * radius;
		return totalarea;
	}
	
	
	
	public static void main(String[] args) {
	     AreaCalculation ar = new AreaCalculation();
	     System.out.println 
	     System.out.println(AreaCalculation.PI);
	     

		
	}

}
