package asignaciones;
import java.util.Scanner;

public class PracticasJuntas {

	public static void main(String[] args) {
		try (Scanner scann = new Scanner(System.in)) {
			//Ingresar nombres y edades
				   System.out.println("Dame el primer nombre ");
				   String name1 = scann.nextLine();
				   
				   System.out.println("Dame el segundo nombre ");
				   String name2 = scann.nextLine();
				   
				   System.out.println("Dame la edad de " + name1);
				   int age1 = scann.nextInt();
				   
				   System.out.println("Dame la edad de " + name2);
				   int age2 = scann.nextInt();
				   
				   

				   
			//Comparativa de edades ingresadas
				   if(age1 > age2) {
					   System.out.println(name1 + " es mayor que " + name2);
				   }else if (age1 == age2){
					   System.out.println(name1 + " y " + name2 + " tienen la misma edad.");
				   }else {
					   System.out.println(name2 + " es mayor que " + name1);
				   }
				   
				   
			//Comparativa de nombres
				   int names = name1.compareToIgnoreCase(name2);
					
					if(names==0) {
						System.out.println("Los nombre son iguales");
					}else {
						System.out.println("Los nombre son distintos");
					}
					
					
					System.out.println("El contenido de los nombres es: " + name1.equals(name2));
						   
			}

		
	}

}
