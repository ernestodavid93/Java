/*Part 1: Commission Calculator
Using IntelliJ, write a Java app that takes numerical input from a user
The app should calculate commission based on this chart used by the retail store.
Sales Range	Commission
above 10000$	30%
5001 - 9999$	20%
1001 - 4999$	10%
below 1000$	N/A
Example: if a user enters 7677 as their sales figure, it should calculate commission at 20%.*/


/*Part 2: Movie Discounts
A movie cinema does price discounting depending on a customer's age.
The app prompts a user to enter their age on the IntelliJ console after which it checks whether the user meets the discount conditions.
Age range	Ticket Price
Normal ticket	7 Euros
Below 5	60% Discount
Over 60	55% Discount
Write the app so that the conditions above are met and the correct ticket price is returned.


Extra features
If done with the first part of the exercise with time to spare add the following feature.

Have the app prompt normal ticket buyers for the number of tickets they wish to buy.
For every two or more tickets sold, give a 30% discount.*/

package javaControlFlow;
import java.util.Scanner;

public class JavaControlFLow {
	public static Scanner console;
	public static void main(String[] args) {
		console = new Scanner(System.in);
		
		
		System.out.println("Tu dedes pagar: $" + calculateCommission()); 
		System.out.println("Debe pagar: $" + calculateAge() + " dolares");
	}
	
	/**
	 * 
	 * @return Esta funcion devuelve el monto a pagar con descuento respecto el precio de compra
	 */
	private static Double calculateCommission() {
		
		System.out.println("Insert your amount: ");
		String amountStr = console.nextLine();
		Double amount = Double.parseDouble(amountStr);
		
		Double total = 0.0;
		
		if(amount >= 10000) {
			total = amount - (amount * .30);
		} else if(amount >= 5001 && amount <= 9999) {
			total = amount - (amount * .20);
		} else if(amount >= 1001 && amount <= 5000) {
			total = amount - (amount * .10);
		} else if(amount <= 1000 && amount > 0.1) {
			total = amount;
		}else {
			total = amount;
			System.out.println("El dato no es correcto");
		}
		return total;
	}
	
	private static Integer calculateAge() {
		
		System.out.println("Type your age: ");
		Integer age = console.nextInt();
		
		Integer total = 0;
		Integer normalPrice = 7;
		
		if(age <= 5 && age > 0) {
			
			total = (int) (normalPrice - (normalPrice * .60));
			
		} else if(age >= 60 && age < 150) {
			
			total = (int) (normalPrice - (normalPrice * .55));
			
		} else if(age >= 6 && age<=59) {
			
			total = normalPrice;
		} else {
			
			total = normalPrice;
			System.out.println("Valor incorrecto");
		}

		return total;
	}
	
	

}
