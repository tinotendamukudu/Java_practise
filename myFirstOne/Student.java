package myFirstOne;



public class Student {
    private String studentName; 
    private int studentAge;
    private String studentRegNumber;		
	
	  private Student (String studentName, int studentAge, String studentRegNumber) {
    	  this.studentName = studentName;
          this.studentAge = studentAge;
          this.studentRegNumber = studentRegNumber;
      
      
      
      }
	
	
	
	public static void main(String[] args) {
	    Student stud1 = new Student("DAPRA", 19,"R215084H"); 
	    Student stud2 = new Student("DKAY", 21,"R215087K"); 
	    Student stud3 = new Student("SHEPIRO", 22,"R215134J"); 
	    Student stud4 = new Student("ELSSY", 20,"R215154T"); 
	    System.out.println("This is student's name is "+ stud1.studentName);
	    System.out.println("This is student's name is "+ stud2.studentName);
	    System.out.println("This is student's name is "+ stud3.studentName);
	    System.out.println("This is student's name is "+ stud4.studentName);
	    System.out.println("This is student's age is "+ stud1.studentAge);
	    System.out.println("This is student's age is "+ stud2.studentAge);
	    System.out.println("This is student's age is "+ stud3.studentAge);
	    System.out.println("This is student's age is "+ stud4.studentAge);
	    System.out.println("This is student's Regnumber is "+ stud1.studentRegNumber);
	    System.out.println("This is student's Regnumber is "+ stud2.studentRegNumber);
	    System.out.println("This is student's Regnumber is "+ stud3.studentRegNumber);
	    System.out.println("This is student's Regnumber is "+ stud4.studentRegNumber);
	
	}

}
