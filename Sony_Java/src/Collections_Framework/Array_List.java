package Collections_Framework;

import java.util.ArrayList;
import java.util.List;

public class Array_List {

	public static void main(String[] args)
	{
		// Creating list using the ArrayList class
		 List<Integer> numbers = new ArrayList<>();
		
		 // Add elements to the list
		 numbers.add(5);
		 numbers.add(6);
		 numbers.add(7);
		 System.out.println("Elements in List : " + numbers);
		
		 // Access element from the list
		 int number = numbers.get(2);
		 System.out.println("Accessed Element: " + number);		 
		 
		 // Remove element from the list
		 int removedNumber = numbers.remove(1);
		 System.out.println("Removed Element: " + removedNumber);

	}

}
