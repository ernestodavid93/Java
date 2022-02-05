package areaOfCircle;
import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		
		System.out.println("Type the diameter");
		double diameter = console.nextDouble();
		
		
		
		
		double radio = diameter / 2;
		
		final double pi = 3.1416;  
		int area = (int) (pi*(radio * radio));
		int perimeter = (int) (radio*(pi*pi));
		
		double area2 = (double)area;
		double perimeter2 = (double)perimeter;
		
		//int area3 = (int)area;
		//int perimeter3 = (int)perimeter;
		
		System.out.println("The area of circle is: "+area2+" and perimeter is: "+perimeter2);
		

	}
	



}
