package Collections_Framework;

import java.util.Vector;

public class Remove_Elements {

	public static void main(String[] args)
	{
		Vector<String> animals= new Vector<>();
		 animals.add("Dog");
		 animals.add("Horse");
		 animals.add("Cat");
		 System.out.println("Initial Vector: " + animals);
	
		 // Using remove()
		 String element = animals.remove(1);
		 System.out.println("Removed Element: " + element);
		
		 System.out.println("New Vector: " + animals);
		 
		 // Using clear()
		 animals.clear();
		 System.out.println("Vector after clear(): " + animals);
		 
		 
		 
		 Vector<String> animals1= new Vector<>();
		 animals1.add("Dog");
		 animals1.add("Horse");
		 animals1.add("Cat");
		 System.out.println("Initial animals1 Vector: " + animals1);
		 
		// Using remove()
				 boolean element1 = animals1.removeAll(animals1);
				 System.out.println("Removed Element: " + element1);
		 
				 System.out.println("New Vector: " + animals1);

	}

}
