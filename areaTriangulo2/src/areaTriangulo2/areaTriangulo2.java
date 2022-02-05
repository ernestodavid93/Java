package areaTriangulo2;

import java.util.Scanner;
public class areaTriangulo2 {


	public static void main(String[] args) {
		
		try (Scanner s = new Scanner(System.in)) {
			System.out.println ("Ingresa la base");
			   double base= s.nextDouble();

			  System.out.println ("Ingresa altura");
			  double altura= s.nextDouble();

			   double area =(base*altura)/2;

			   System.out.println("El area del circulo es: " + area);
		}
	}

}


