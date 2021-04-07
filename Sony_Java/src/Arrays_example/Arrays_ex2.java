package Arrays_example;

public class Arrays_ex2 {

	public static void main(String[] args)
	{
        // create an array of length 5  
        int[] age = new int[6];
        age[0] =10;
        age[1] = 12;
        age[2] = 22;
        age[3] = 15;
        age[4] = 18;
        age[5] = 19;

        
        // access each element of the array using the index number 
        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]);
        System.out.println(age[3]);
        System.out.println(age[4]);
        System.out.println(age[5]);
        
        System.out.println("Array Length is  :  "+age.length);

	}

}
