package Java_Abstraction;

public abstract class Addition
{
	public abstract void mul(int a , int b);
	
	public void add(int a , int b)
	{		
		int c = a + b;
		System.out.println("Addition is:  " + c);		
	}

}
