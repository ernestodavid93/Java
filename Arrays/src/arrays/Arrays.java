package arrays;
import java.util.*;

public class Arrays {

	public static void main(String[] args) {
		
		String[] arreglo = {"Mau", "Paco"};
		//System.out.println(arreglo[0]);
		

		//Ordenar numeros-------------------------------------------------------------
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(17);
		numbers.add(23);
		numbers.add(2);
		numbers.add(9);
		
		
		Collections.sort(numbers);
		
		for(int i:numbers) {
			System.out.println(i);
		}
		
		
		

		//Array de carros-----------------------------------------------------------
		
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("Nissan");
		cars.add("Toyota");
		cars.add("Fiat");
		cars.add("Volvo");
		cars.remove(0);
		//cars.size();
		cars.set(0, "VW");
		//System.out.println(cars.size());
		//System.out.println(cars.get(0));
		//System.out.println(cars);
		
		/*for(int j=0; j<cars.size(); j++) {
			System.out.println(cars.get(j));
		}*/
		
		Collections.sort(cars);
		
		for(String i:cars) {
			//System.out.println(i);
		}
		
		
	}

}
