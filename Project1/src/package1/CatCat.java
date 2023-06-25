package package1;

//Assignment_25
class Cat2 
{
	static void add1() 
	{
		System.out.println("cat2 add1");
	}
	void add2() {
		System.out.println("cat2 add2");
	}
}

abstract class Cat1 extends Cat2 {
	
	abstract void add3();
	static void add4() {
		System.out.println("cat1 add4");
	}
}

public class CatCat extends Cat1 {
	static void add5() {
		System.out.println("cat add5");
	}
	void add6() {
		System.out.println("cat add6");
	}

	public static void main(String[] args) {
		CatCat c1 = new CatCat();
		add1();
		add4();
		add5();
		c1.add2();
		c1.add3();
		c1.add6();
	}
	
	@Override
	void add3() {
		System.out.println("Cat1 add3 overridden");		
	}

}
