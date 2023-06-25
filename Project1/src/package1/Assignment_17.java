package package1;

public class Assignment_17 {
	
	static void method1()
	{
		System.out.println("Static non-parameterized");

	}
	static void method2(int a)
	{
		System.out.println("Static parameterized");

	}
	void method3()
	{
		System.out.println("Non-static non-parameterized");

	}
	void method4(int a, int b)
	{
		System.out.println("Non-static parameterized");

	}
	static {
		System.out.println("Static initialization block");
	}
	{
		System.out.println("Instance initialization block");

	}
	
	
	public static void main(String[] args) {
		method1();
		method2(2);
		System.out.println("Main block");
		new Assignment_17();
		Assignment_17 a1=new Assignment_17();
		a1.method3();
		a1.method4(1, 0);
		
		

		

	}

}
