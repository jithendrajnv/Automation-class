package package1;
class Me
{
	void add1() 
	{
		System.out.println("add1");
	}
}
class Kumar extends Me
{
	void add2() 
	{
		System.out.println("add2");
	}
	
}
class Jithendra extends Kumar 
{
	void add3() 
	{
		System.out.println("add3");

	}
}

public class Jeet extends Jithendra
{
	void add4() 
	{
		System.out.println("add4");
	}

	public static void main(String[] args) {
		Kumar k1=new Jithendra();
		System.out.println("Upcasting done below");
		k1.add1();
		k1.add2();
		
		Jeet j1=(Jeet) k1;
		System.out.println("Downcasting done below");
		j1.add1();
		j1.add2();
		j1.add3();
		j1.add4();
	}

}
