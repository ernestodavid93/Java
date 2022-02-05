package arrays;
import java.util.*;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap<String, String> capitalCities = new HashMap<String,String>();
		
		

		capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    
	    
	    for (String i : capitalCities.keySet()) { System.out.println(i); }
		for (String i : capitalCities.values()) { System.out.println(i); }
		for (String i : capitalCities.keySet()) {  System.out.println("key: " + i + " value: " + capitalCities.get(i));}
	    
	    
		System.out.println(capitalCities.get("England")); 
		//Eliminar un artículo
		capitalCities.remove("England");
		//Para eliminar todos los elementos
		capitalCities.clear();
		//Tamaño de HashMap
		capitalCities.size();
		//Recorrer un HashMap
		
	}


}


