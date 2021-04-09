package Collection_Map;

import java.util.HashMap;
import java.util.Map;

public class Implementing_HashMap {

	public static void main(String[] args) 
	{
		// Creating a map using the HashMap
		 Map<String, Integer> numbers = new HashMap<>();
	
		 // Insert elements to the map
		 numbers.put("One", 1);
		 numbers.put("Two", 2);
		 System.out.println("Map: " + numbers);
		 
		 // Access keys of the map
		 System.out.println("Keys: " + numbers.keySet());
		 
		 // Access values of the map
		 System.out.println("Values: " + numbers.values());
		 
		 // Access entries of the map
		 System.out.println("Entries: " + numbers.entrySet());
		 
		 
		// change element with key 2
		 numbers.replace("One", 10 );
		 System.out.println("HashMap using replace(): " + numbers);
		 
		 
		 
		 // Remove Elements from the map
		 int value = numbers.remove("Two");
		 System.out.println("Removed Value: " + value);
		 
		 System.out.println("Map: " + numbers);


		 
	}

}
