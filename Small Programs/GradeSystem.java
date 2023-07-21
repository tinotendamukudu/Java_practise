
import java.util.Scanner;


public class Degree {
	
	 public static int calculateGrade(String grade){
	        int points = -1;
	        
	        if (grade == "A"){
				points = 5;}
	        if (grade == "B"){
				points = 4;}
	        if (grade == "C"){
				points = 3;}
	        if (grade == "D"){
				points = 2;}
	        if (grade == "E"){
				points = 1;}
	        if (grade == "O"){
				points = 0;}
	            
	        return points;
	    }
	    
	    public static String degree(int points){
	        String degree = "";
	        
	        if (points > 13){
				degree = "Science";}
	        if (points > 11 && points <= 13){
				degree = "Commercial";}
	        if (points > 8 && points <= 11){
				degree = "Arts";}
	        if (points > 9){
	            degree = "No";}
	        
	        
	        return degree;
	    }
	    
	

    public static void main(String[] args) {
        // TODO code application logic here
 b       Scanner input = new Scanner(System.in);
        
        System.out.print("Name: ");
        String name = input.nextLine();
        
        System.out.println("Enter the results: ");
        
        System.out.print("Subject 1: ");
        String subjectA = input.nextLine();
        
        System.out.print("Subject 2: ");
        String subjectB = input.nextLine();
        
        System.out.print("Subject 3: ");
        String subjectC = input.nextLine();
        
        int total = calculateGrade(subjectA) + calculateGrade(subjectB) + calculateGrade(subjectC);
        
        String =  output = "\nGood Day " + name + ", basing of A Level results, you have been awarded " + degree(total) + " degree.";
        
       
        System.out.println(output);
        
    }
    
    
  
    
   
