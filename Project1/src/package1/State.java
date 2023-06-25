package package1;

class India
{
	India()           //Constructor
	{
		System.out.println("India");
	}
}

class Bihar extends India
{
	Bihar()            //Constructor
	{
		System.out.println("Bihar");
	}
}

class Up extends Bihar
{
	Up()            //Constructor
	{
		System.out.println("UP");
	}
}

public class State 
{

	public static void main(String[] args) 
	{
		new Up();
		

	}

}
