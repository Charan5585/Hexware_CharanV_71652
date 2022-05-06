class A
{
	int b=1000;
}
class B extends A
{
	int b=10;
	B(int b)
	{
		System.out.println("B:"+b);
		System.out.println("B:"+this.b);
		System.out.println("B:"+super.b);
	}
}


class demo9 
{
	public static void main(String args[])
	{
		B b=new B(100);
	}
}