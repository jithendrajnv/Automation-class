package package1;

class GrandFather
{
	void dada() 
	{
		System.out.println("Grabd father method");
	}
}
class Father extends GrandFather
{
	void dad() 
	{
		System.out.println("Father method");
	}
	
}
public class Son extends Father
{
	void me() 
	{
		System.out.println("My method");
	}

	public static void main(String[] args) {
		GrandFather g1= new Father();
		g1.dada();
		System.out.println("Upcasting done below");
		
		Father f1=(Father) g1;
		System.out.println("\nDownasting done below");
		f1.dad();
		f1.dada();
	

	}

}
