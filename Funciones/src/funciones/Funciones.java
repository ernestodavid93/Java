package funciones;

public class Funciones {

	public static void ernesto(String nombre, String apellido, int edad) {
		System.out.println(nombre+ " " + apellido + " "+ edad);
	}
	
	public static double operaciones(double a, double b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		//System.out.println("hola mejo");
		//ernesto("Mejo", "Lopez", 23);
	
		System.out.println(operaciones(32, 2.9));
	}

}
