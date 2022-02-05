package condicionales;
import java.util.Scanner;

public class Condicionales {
	
	public static Scanner console;
	
	public static void main(String[] args) {
			
		
		System.out.println("Ingresa tu edad: ");
		Integer edad = pedirNumeros(); 
		
		
		System.out.println("Ingresa 1. Pa ir al antro, 2. Pa ir al cine");
		Integer opc = pedirNumeros();
		
		//ifElse(edad);
		//ternario(edad);
		switchBasico(edad, opc);
		
	}
	
	private static void ifElse(Integer edad) {
		if ( edad >= 18 && edad <= 150) {
		System.out.println("Eres mayor");
		}
		else if( edad >= 0 && edad <=18) {
		System.out.println("Eres menor");
		}
		else{
		System.out.println("Valor incorrecto");
		}
	}
	
	
	private static void ternario(Integer edad) {
				
		//System.out.println((edad >= 18) ? "Eres mayor" :  "Eres menor");
		
		
	    String status = (edad >= 18 && edad <= 150) ? "Eres mayor"
	                    : (edad < 18 && edad >= 0) ? "Eres menor"
	                       : "Incorrecto bebe";
	    System.out.println(status);
	}
	
	private static void switchBasico(Integer edad, Integer opc) {
		
		switch(opc) {
		case 1: String status = (edad >= 18 && edad <= 150) ? "Eres mayor, lanzate al antro"
                : (edad < 18 && edad >= 0) ? "Eres menor, vaya al cine"
	                       : "Incorrecto bebe";
				System.out.println(status);
		break;
		case 2: String stado = (edad >= 0 && edad <= 150) ? "Vaya al cine"
                : (edad < 18 && edad >= 0) ? "Todos pueden ir al cine"
	                       : "Incorrecto bebe";
				System.out.println(stado);
		break;
		default: System.out.println("Opcion incorrecta");
		break;
		}
	}
	
	private static Integer pedirNumeros() {
		console = new Scanner(System.in);
		
		String numeroStr = console.nextLine();
		Integer numero = Integer.parseInt(numeroStr);
		
		return numero;
	}

}
