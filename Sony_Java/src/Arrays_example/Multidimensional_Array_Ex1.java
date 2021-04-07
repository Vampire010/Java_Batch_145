package Arrays_example;

public class Multidimensional_Array_Ex1 {

	public static void main(String[] args)
	{
		int[][] arr = { { 1, 2 ,3 , 4 , 5 ,6 }, { 7, 8, 9, 10 ,11 ,12 } };
		  
        for (int i = 0; i < 6; i++)
        {
            for (int j = 0; j < 6; j++)
            {
                System.out.println("arr[" + i + "][" + j + "] = "
                                   + arr[i][j]);
            }
        }
        
	}

}
