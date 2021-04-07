package Inheritance;

public class ClassC extends ClassA
{

	public void div(int a , int b)
	{
		
		int c = a / b;
		System.out.println(c);
		
	}
	
	
	public static void main(String[] args) 
	{
		ClassC clas = new ClassC();
		
		clas.addition(4, 5);
		//clas.Multiplication(2, 3);
		clas.div(10, 2);
	}

}
