package Inheritance;

public class ClassB extends ClassA
{
	public void Multiplication(int a , int b)
	{
		
		int c = a * b;
		System.out.println(c);
		
	}


	public static void main(String[] args) 
	{
		
		ClassB clas = new ClassB();
		clas.addition(4, 5);
		clas.Multiplication(2, 3);
		
	}

}
