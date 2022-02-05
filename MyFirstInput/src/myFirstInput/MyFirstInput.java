package myFirstInput;
import java.util.Scanner;

public class MyFirstInput {

	public static void main(String[] args) {
		try (Scanner console = new Scanner(System.in)) {
			System.out.println("Please enter your name: ");
			String name = console.nextLine();
			
			System.out.println("My name is "+name);
		}
	}

}
