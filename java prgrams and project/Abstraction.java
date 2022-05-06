abstract class A
{
	abstract void loan();
	
	abstract void mini();

	void abc()
	{
		System.out.println("hi");
	}
}

abstract class B extends A
{
	void lpoan()
	{
		System.out.println("hi demo");
	}
	{	
	}
	abstract void OT();
}
class Demo extends B
{
	void OT()
	{
	}
}
class Abstraction
{
	public static void main(String args[])
	{
		Demo d=new Demo();
		d.OT();d.loan();d.mini();
	}
}