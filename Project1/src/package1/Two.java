package package1;
class Two2
{
	void two2() 
	{
		System.out.println("Two2");
	}
}
class Two1 extends Two2
{
	void two1() 
	{
		System.out.println("Two1");
	}
}

public class Two extends Two1
{
	void two() 
	{
		System.out.println("Two");
	}

	public static void main(String[] args) 
	{
		Two1 t1=new Two();
		System.out.println("Upcasting");
		t1.two1();
		t1.two2();
		
	}
}