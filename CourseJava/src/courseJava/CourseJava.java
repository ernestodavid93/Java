package courseJava;
import java.util.Scanner;

public class CourseJava {

	private static Scanner console;

	public static void main(String[] args) {
		
		System.out.println("Dame el primer numero: ");
		Integer primero =  pedirNumeros();
				
		System.out.println("Dame el segundo numero: ");
		Integer segundo = pedirNumeros();
		
		System.out.println("Dame el tercer numero: ");
		Integer tercero = pedirNumeros();
		
		calcularMayor(primero, segundo, tercero);
		calcularMenor(primero, segundo, tercero);
		calcularPromedio(primero, segundo, tercero);
		definition(primero);
	}
	
	
	private static boolean esPar(Integer primero) {
		return primero % 2 == 0;
	}
	
	private static void definition(Integer primero) {
		if(esPar(primero)) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}
	}
	
	private static Integer pedirNumeros() {
		console = new Scanner(System.in);
		
		String numeroStr = console.nextLine();
		Integer numero = Integer.parseInt(numeroStr);
		
		return numero;
	}
	
	private static void calcularMayor(Integer primero, Integer segundo, Integer tercero) {
		
		Integer numMayor = primero;
		
		if(segundo > numMayor) {
			numMayor = segundo; 
		}
		
		if(tercero > numMayor) {
			numMayor = tercero;
		}
		
		System.out.println("El numero mayor es: "+numMayor);
	}
	
	private static void calcularMenor(Integer primero, Integer segundo, Integer tercero) {
		
		Integer numMenor = primero;
		
		if(segundo < numMenor) {
			numMenor = segundo;
		}
		
		if(tercero < numMenor) {
			numMenor = tercero;
		}
		
		System.out.println("El numero menor es: " +numMenor);
	}
		
	private static void calcularPromedio(Integer primero, Integer segundo, Integer tercero) {
		
		double promedio = 0.0;
		
		promedio = (double) ((primero + segundo + tercero) / 3);
		
		System.out.println("El promedio es: "+promedio);
	}
	
	

}
