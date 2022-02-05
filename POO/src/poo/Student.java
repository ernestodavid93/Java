
package poo;


public class Student {
	
  String firstName;
  String lastName;
  int registration;
  int grade;
  int year;
  
  public static void main(String[] args) {
	Student student1 = new Student("Guillermo", "Chang", 13, 100, 2022); 
	Student student2 = new Student(30,30,2002);
	Student student3 = new Student(45, 2022);
	
	student1.printFullName();
	student1.isApproved();
	
	student2.isApproved();
	System.out.println(student2.changeYearIfApproved()); 
	
	student3.isApproved();
	
	
}
  
  
  
  public Student(String firstName, String lastName, int registration, int grade, int year) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.registration = registration;
	this.grade = grade;
	this.year = year;
}
  
  public Student(int registration, int grade, int year) {
	  	
		this.registration = registration;
		this.grade = grade;
		this.year = year;
	  
  }
  
  public Student(int grade, int year) {
	  	
		
		this.grade = grade;
		this.year = year;
	  
}
  



public void printFullName(){
    System.out.println(this.firstName+" "+this.lastName);
 }

 public void isApproved(){
     if(this.grade >= 60) {
    	 System.out.println(true);
    	 
     }else {
    	 System.out.println(false);
     }
 }

 public int changeYearIfApproved(){
     //TODO implement: the student should advance to the next year if he/she grade is >= 60
     // Make year = year + 1, and print "Congragulations" if the student has been approved
	 
	 this.year++;
	 System.out.println(this.year);
	 
     return this.year;
 }
  
  
}



