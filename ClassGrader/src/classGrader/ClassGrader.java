package classGrader;
import java.util.Scanner;

public class ClassGrader {

		public static void main(String[] args) {
			try (Scanner scann = new Scanner(System.in)) {
				//Ingresar nombres y edades
					   System.out.println("Ingresa tu calificacion ");
					   double score = scann.nextDouble();
					   
					  if(score <= 3 && score >= 0) {
						  System.out.println("No brindaras honor para tu familia");
					  }else if(score > 3 && score <= 5) {
						  System.out.println("Echale ganas mijo");
						  }else if(score > 5 && score <= 9) {
							  System.out.println("Ahi la llevas papi");
						  }else if (score == 10){
							  System.out.println("Eres un campeon");
						  }else {
							  System.out.println("No seas verbo carnal, esa no es una calificacion");
						  }
						  }
					  }

	
}
