import java.util.Scanner;
public class StudentEnrolment {
	
	
	public static void  gradingSystem(String grade) {
		int points=0;
		if(grade=="A") {
			points=5;
		
		if(grade=="B") {
			points=4;
		}
		if(grade=="C") {
			points=3;
		}
		if(grade=="D") {
			points=2;
		}
		if(grade=="E") {
			points=1;
		}
		
		}
		
	}
	
	/*public StudentEnrolment(String name,String programme,char grade) {
		studentName=name;
		
		this.grade=grade;
		
	}*/

	public static void main(String[] args) {
		StudentEnrolment stud1=new StudentEnrolment();
		
		Scanner student1=new Scanner(System.in);
		System.out.println("Name,Grades");
		
		//Input for student name
		String studentName=student1.nextLine();
		
		
		String grade=student1.nextLine();
		String grade1=student1.nextLine();
		String grade2=student1.nextLine();
		
		
		 totalpoints=grade+grade1+grade2;
		
		
	}
	

		
		
		//input for grades
		
		//String grade1=student1.nextLine();
		//String grade2=student1.nextLine();
		
		//int output=grade+grade1+grade2;
		//System.out.println(output);
			
		
			
		

				
			
		
		
				
		
		//System.out.println("The student name is: "+studentName);
		
		//System.out.println("My grades are as follows :"+grade);
		
		
		
		
		
		

	
	public static void gradingSys(String grade) {
		int points=0;
		if(grade=="A") {
			points=5;
		
		if(grade=="B") {
			points=4;
		}
		if(grade=="C") {
			points=3;
		}
		if(grade=="D") {
			points=2;
		}
		if(grade=="E") {
			points=1;
		}
		return points;
		}
		
		
	}
}

