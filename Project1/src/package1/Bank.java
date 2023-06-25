package package1;
//

class Rbi                         //Parent class p1
{
	static void reporate() 
	{
		System.out.println("Repo rate changes");
	}
	
	void guidelines() 
	{
		System.out.println("RBI guidelines");	
	}
}

class Atm extends Rbi             //Child class c1
{
	static void withdraw()
	{
		System.out.println("Cash withdrawal");
	}
	
	void balancecheck() 
	{
		System.out.println("Check account balance");
	}
}

public class Bank extends Rbi
{
	static void loan() 
	{
		System.out.println("Apply for house loan");
	}
	
	void deposits() 
	{
		System.out.println("Make cash deposits");
	}
	public static void main(String[] args) 
	
	{
		reporate();               //static method from parent class
		Bank r1=new Bank();       //non-static method from parent class
		r1.guidelines(); 
		
		loan();                   //static method from same class
		r1.deposits();            //non-static method from same class
		
//		withdraw();               //static method from another child class
//		r1.balancecheck();           //non-static method from another child class
	}

}