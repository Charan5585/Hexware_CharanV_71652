import java.util.Scanner;

class clerk
{
	cleark()
	salary = 11500;
	designation = 'clerk';
	display();
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter your id: ");
		id = sc.nextInt();

		System.out.println(" enter your name: ");
		String name = sc.next();

		System.out.println(" enter your age: ");
		age = sc.nextInt();

	}
	void display()
	{
	System.out.println(" id is: "+id);
	System.out.println(" name is: "+name);	
	System.out.println(" age is: "+age);
}

class demo5
{
	public static void main(String args[])
	{
		clerk c=new clerk();
 		e.display();