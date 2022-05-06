import java.util.*;
import java.io.*;
class A
{
	void abc() throws MinAgeException
	{
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter Age:");
		int age=sc.nextInt();
	if (age< 18)
	{
		throw new MinAgeException("Age must be more than 18 for employement");
	}
	else
	{
		System.out.println("Eligible for employement");
	}
	}
}
class cust 
{
	public static void main(String args[])
	{
	try
	{
	A a=new A();
	a.abc();
	}
	catch(MinAgeException me)
	{
		System.out.println(me);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}

class MinAgeException extends Exception
{
	MinAgeException(String str)
	{
		super(str);
	}
}

	