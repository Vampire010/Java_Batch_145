package Collection_Set;

import java.util.TreeSet;

public class TreeSET_EX2 {

	public static void main(String[] args) 
	{
		TreeSet<Integer> numbers = new TreeSet<>();
		 numbers.add(2);
		 numbers.add(5);
		 numbers.add(4);
		 numbers.add(6);
		 System.out.println("TreeSet: " + numbers);
		
		 // Using higher()
		 System.out.println("Using higher: " + numbers.higher(4));
		 
		 // Using lower()
		 System.out.println("Using lower: " + numbers.lower(4));
		 
		 // Using ceiling()
		 System.out.println("Using ceiling: " + numbers.ceiling(4));
		 
		 // Using floor()
		 System.out.println("Using floor: " + numbers.floor(3));
		 
		 
		// Using headSet() with default boolean value
		 System.out.println("Using headSet without boolean value: " + numbers.headSet(5));
		 
		 // Using headSet() with specified boolean value
		 System.out.println("Using headSet with boolean value: " + numbers.headSet(5, true));
		 
		// Using tailSet() with default boolean value
		 System.out.println("Using tailSet without boolean value: " + numbers.tailSet(4));
		 // Using tailSet() with specified boolean value
		 System.out.println("Using tailSet with boolean value: " + numbers.tailSet(4, false));
		 
		 
		// Using subSet() with default boolean value
		 System.out.println("Using subSet without boolean value: " + numbers.subSet(4, 6));
		 // Using subSet() with specified boolean value
		 System.out.println("Using subSet with boolean value: " + numbers.subSet(4, false, 6, true));
	}

}
