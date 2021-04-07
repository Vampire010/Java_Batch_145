package Variables;

public class Ex1 
{
	String Name = "Girish";
	char Intail = 'G';
	
	public void My_Office()
	{
		String EmpID = "GIRI010";
		int Exp = 10;
		double salary = 89000.50;
		boolean empstatus = true;
		System.out.println("EmpID is : " + EmpID + " Emp_Name : " + Name );
		
	}
	
	public void My_Bank()
	{
		int age = 28 ;
		double Accnt_Bal = 60000.40;
		boolean Account_Status = true;

		String Accnt_num = "2014578AC12";
		System.out.println("Accnt_num is : " + Accnt_num + " Emp_Name : " + Name );
	}

	public static void main(String[] args) 
	{
		Ex1 ex = new Ex1();
		ex.My_Office();
		ex.My_Bank();

	}

}
