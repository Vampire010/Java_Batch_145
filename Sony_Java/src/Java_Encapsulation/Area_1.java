package Java_Encapsulation;

public class Area_1 
{
	// fields to calculate area
	  int length;
	  int breadth;

	  // constructor to initialize values
	  Area_1(int lengths, int breadths)
	  {
	    this.length = length;
	    this.breadth = breadth;
	  }
	  // method to calculate area
	  public void getArea() 
	  {
	    int area = length * breadth;
	    System.out.println("Area: " + area);
	  }

}
