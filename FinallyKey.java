import java.util.Scanner;

class MyException extends Exception
{
	MyException(String msg)
	{
		super(msg);
		System.out.println("Inside User Defined Exception");
	}
}

class Finally
{
	public static void main(String args[])
	{
		int a,b;
		Scanner s =new Scanner(System.in);
		
		System.out.println("Enter First Value");
		a=s.nextInt();
		System.out.println("Enter Second Value");
		b=s.nextInt();

		double c=a/b;

		try
		{
		if(c<1)
		{
			throw new MyException("Result is less then 1...");
		}
		else
		{
			System.out.println("Division is "+c);
			}
		}	
		catch (MyException t1)
		{
			System.out.println("Exception is caught "+t1);
		}
		finally
		{
			System.out.println("Exception is managed ");
		}
	}	
}
