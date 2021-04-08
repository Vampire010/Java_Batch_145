package Collection_Set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet_TreeSet {

	public static void main(String[] args)
	{
		// Creating SortedSet using the TreeSet
		 SortedSet<Integer> numbers = new TreeSet<>();
	
		 // Insert elements to the set
		 numbers.add(5);
		 numbers.add(2);
		 numbers.add(3);
		 numbers.add(1);
		 System.out.println("SortedSet: " + numbers);
		 
		 // Access the element
		 int firstNumber = numbers.first();
		 System.out.println("First Number: " + firstNumber);
		
		 int lastNumber = numbers.last();
		 System.out.println("Last Number: " + lastNumber);
		 
		 // Remove elements
		 boolean result = numbers.remove(2);
		 System.out.println("Is the number 2 removed? " + result);

	}

}
