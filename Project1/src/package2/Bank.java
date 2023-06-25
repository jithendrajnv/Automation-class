package package2;


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
		
		reporate();
		Bank r1=new Bank();
		r1.guidelines(); 
		
		loan();
		r1.deposits();
		
//		withdraw();
//		balancecheck(); 
		
		
	}

}
