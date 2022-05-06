import java.util.Scanner;
import java.io.*;

class exc
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
		
		File f= new File("xyz.txt");
		FileReader fr= new FileReader(f);
		}
		catch(FileNotFoundException fn)
	}
}