package myFirstVariableNaming;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class UserProfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// users name, age, gender, job preference, nationality and blood type
		
		Scanner console = new Scanner(System.in);
		
		System.out.println("Please enter your name: ");
		String name = console.nextLine();
		
		System.out.println("Please enter your gender: ");
		String gender = console.nextLine();
		
		System.out.println("Please enter your job: ");
		String job = console.nextLine();
		
		System.out.println("Please enter your nationality: ");
		String nat = console.nextLine();
		
		System.out.println("Please enter your blood type: ");
		String blood = console.nextLine();
		
		System.out.println("Please enter your year of birthday: ");
		String year = console.nextLine();
		int year_int = Integer.parseInt(year);
		
		String anio = new SimpleDateFormat("yyyy").format(Calendar.getInstance().getTime());
		int anio_int = Integer.parseInt(anio);
		//System.out.println(anio);
		

		
		int age = anio_int - year_int;
		
		System.out.println("Your name: " +name+ ", your gender is: "+gender+", your job is :" +nat+ ", your job is: " +job+ ", your blood is: "+blood+ ", Your age is: " +age);
		
	}

}
