/*Part 2: Do While loops
Create a new Java class with a main method(so you can run your code) called Fibonacci

The Fibonacci numbers are a traditional computer science problem: "each number is the sum of the two preceding ones, starting from 0 and 1."

The beginning of the sequence is thus:

0 1 1 2 3 5 8 13 21 34 55 89 ...

Add the following import to be able to capture user input n

  import java.util.Scanner;
Implement a Do While loop that calculates Fibonacci(n)

n	Fibonacci(n)
0	0
1	1
2	1
3	2
4	3
5	5
6	8
7	13
...	... 

package loops;
import java.util.Scanner;

public class Fibonacci {
	
	public static Scanner console;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		console = new Scanner(System.in);
		int i = 1;
		int inicio = 1;
		int sig = 1;
		
		
		do {
			
			System.out.println(fibo);
			int num = console.nextInt();
			
		}
		while(i<10);
			System.out.println(aux);
			aux = fibo + aux;
	        fibo = aux - fibo;
	        
		
        
        
        

	}

}*/

package loops;
import java.util.*;
/**
 * Serie de Fibonacci en Java
 * Programa que imprima los N primeros números de la serie de Fibonacci.
 * El primer número de la serie es 1, el segundo número es 1 y cada uno de los                                    
 * siguientes es la suma de los dos anteriores.
 * 1, 1, 2, 3, 5, 8, 13,  ....... , N
 * @author Enrique
 */
public class Fibonacci{

    public static void main(String[] args){
 
        Scanner sc = new Scanner(System.in);
        int numero,fibo1,fibo2,i = 2;
  
        
            System.out.print("Introduce numero mayor que 1: ");
            numero = sc.nextInt();
        
  
        System.out.println("Los " + numero + " primeros términos de la serie de Fibonacci son:");                 

        fibo1=0;
        fibo2=1;

        System.out.print(fibo1 + " "); //0,    
        while(i<=numero){
            System.out.print(fibo2 + " "); //0, 1, 1, 2, 3, 
            fibo2 = fibo1 + fibo2; //1
            fibo1 = fibo2 - fibo1; //1
            i++;
        }
        
    }
}
