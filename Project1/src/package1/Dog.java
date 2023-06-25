package package1;

class Dog1
{
	void Bark1() 
	{
		System.out.println("Dog1 barks");
	}		
}

interface dog2
{
	void Bark2();

}

interface dog3
{
	void Bark3();

}

public class Dog extends Dog1 implements dog2,dog3 

{
	public static void main(String[] args) 
	{
		Dog d1=new Dog();
		
		d1.Bark1();
		d1.Bark2();
		d1.Bark3();

	}

	@Override
	public void Bark2() {
		System.out.println("Dog2 barks");
		
	}

	@Override
	public void Bark3() {
		System.out.println("Dog3 barks");
		
	}

}
