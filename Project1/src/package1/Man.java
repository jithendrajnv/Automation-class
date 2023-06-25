package package1;
class God
{
	void create() 
	{
		System.out.println("Creator of everything");
		
	}
}
class  Woman extends God 
{
	void beauty() 
	{
		System.out.println("known for beauty");
	}
	
}
public class Man extends Woman 
{
	void work() 
	{
		System.out.println("Works hard");
	}
	
	public static void main(String[] args) 
	{
		God g1=new Man();
		System.out.println("Upcasting done below");
		g1.create();
		
		Man m1=(Man) g1;
		System.out.println("\nDowncasting done here");
		m1.beauty();
		m1.create();
		m1.work();
		

	}

}
