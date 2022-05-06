import java.util.Scanner;
class A 
{
	A()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name:");
		String name = sc.next();
		System.out.println("Enter age");
		int age = sc.nextInt();
		System.out.println("Name is: "+ name);
		System.out.println("Age: "+ age);
	}


}
	
class Demo2
{
	public static void main(String args[])
	{
		
		A a=new A();
		
	}
}