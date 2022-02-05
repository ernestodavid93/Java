package calculadora;


import java.util.Scanner;

public class Calculadora{
	
	static double suma(double a,double b) {
		return a+b;
	}
	static double resta(double a,double b) {
		return a-b;
	}
	static double multiplicacion(double a,double b) {
		return a*b;
	}
	static double division(double a,double b) {
		return a/b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s1= new Scanner(System.in);
      System.out.println("Introduce el primer numero;");
      double x = s1.nextDouble();
      
    
      System.out.println("Introduce el primer numero;");
      double y = s1.nextDouble();
      
      System.out.println("La suma es;"+suma(x,y));
      System.out.println("La resta es;"+resta(x,y));
      System.out.println("La multiplicacion es;"+multiplicacion(x,y));
      System.out.println("La division es;"+division(x,y));
	}

}