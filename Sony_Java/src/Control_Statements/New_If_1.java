package Control_Statements;

public class New_If_1 
{

	public static void main(String[] args) 
	{
		
		int num = 0;
		
		if(num <=100 )
		{
			//marks between 80 - 100 = distinction

			if((num > 79 )&&(num < 100))
			{
				System.out.print("Distinction");				
			}
			
			// marks bet  60 - 79 - Fist class

			else if( (num > 59 )&&(num < 80) )
			{
				
				System.out.print("First Class");
			}
			
			// 36 - 59 second class

			else if( (num >= 36 )&&(num < 60) )
			{
				
				System.out.print("Second Class");
			}
			
			//35 = pass

			else if( num == 35 )
			{
				
				System.out.print("Pass");
			}
			
			// <35 = Fail
			else if( (num >= 0 )&&(num < 35) )
			{
				
				System.out.print("Fail");
			}
			
		}
		
		else
		{
			System.out.print("Invalid Marks ");
			
		}
		
		
	}

}
