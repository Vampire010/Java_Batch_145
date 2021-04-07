package Arrays_example;

public class Arrays_ex1 {

	public static void main(String[] args) 
	{
		int[] numbers = {1,5,6,8 };
		
		String[] Names = {"John" , "Max" ,"Ken"};
		
		char[] alphabets = {'a','b','c' , 'd'};
		
		for(int i = 0 ; i < numbers.length ; i++)
		{
			System.out.println(numbers[0]);
			
		}
		System.out.println("**************" + numbers.length);
		for(String name : Names)
		{
			System.out.println(name);
		}
		System.out.println("*************" + Names.length);
		for(int i = 0 ; i < alphabets.length ; i++)
		{
			System.out.println(alphabets[i]);
			
		}
		System.out.println("*************" +alphabets.length);

	}

}
