import java.util.*;
class Emp

{
	String name;
	String desig;
	Emp()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("NAME:");
		name = sc.next();

		System.out.print("Desig:");
		desig = sc.next();
	}
}
 
class Clerk extends Emp
{
	Clerk()
	{
	}
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Desig: "+desig);
	}
}class Dev extends Emp
{
	Dev()
	{
	}
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Desig: "+desig);
	}
} 
class Tester extends Emp
{
	Tester()
	{
	}
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Desig: "+desig);
	}
}
class demo7
{
	public static void main(String args[])
	{
		Clerk c=new Clerk();
		c.display();

		Dev d=new Dev();
		c.display();

		Tester t=new Tester();
		c.display();
	}
}