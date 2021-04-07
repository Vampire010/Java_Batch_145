package Java_Abstraction;

public class Multiplication extends Addition
{

	public static void main(String[] args)
	{
		Multiplication mult =new Multiplication();
		 mult.add(4, 3);
		 mult.mul(5, 6);
	}

	@Override
	public void mul(int a, int b) 
	{
		int c = a * b;
		System.out.println("multiplication is:  " + c);
		
	}

}
