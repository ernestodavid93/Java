package loops;

/*Part 1: While loops
Open your IDE and create a new Java class named Table
Copy the following code into your Java class Table and verify it works*/
import java.util.Scanner;

	public class Table
	{
	    public static void main(String[] args)
	    {
	        try (Scanner console = new Scanner(System.in)) {
				int num;
				
				System.out.print("Enter any positive integer: ");
				num = console.nextInt();
				        
				System.out.println("Multiplication Table of " + num);
				int j = 1;
				while(j <=10) {
					int total = num * j;
					 System.out.println(total);
					 j++;
				}
			}
	        

	    }
	}
//Implement a while loop that prints out the multiplication table of the given input number.
	
	