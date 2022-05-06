class A
{
	static int a = 1000;
	static void abc()
	{
		System.out.println("hi abs method...");
	}
}

class demo4
{
	public static void main(String args[])
	{
		A.abc();
		System.out.println(A.a);
	}
}