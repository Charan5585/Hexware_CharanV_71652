import java.util.Scanner;
import java.io.*;

class exceptionn
{
	public static void main(String args[]) 
	{
		m1();
	}
	public static void  m1()
	{
		m2();
		System.out.println("bye");
	}
	public static void  m2()
	{
		m3();
		System.out.println("hi");
	}
	public static void  m3() 

	{
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A:");
		int a = sc.nextInt();
		
		System.out.println("Enter B:");
		int b = sc.nextInt();
		int c=a/b;

		System.out.println("Result :"+c);
		}

		catch(ArithmeticException ae)
		{
			System.out.println("please dont enter anything / 0, it is invalid please enter correct values");

		}
		finally
		{
			System.out.println("thank you");

		}
	}
}