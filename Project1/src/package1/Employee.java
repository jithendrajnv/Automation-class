package package1;
class Manager
{
	static void ManageProject() 
	{
		System.out.println("Manager handles all the project");
	}
	
	void manageLeads() 
	{
		System.out.println("Manages all the leads");
	}	
}
abstract class Lead extends Manager          //abstract class
{
	abstract void manageTeam(); //abstract method
	void Report() {
		System.out.println("Prepares performance report");
	}
}
 abstract class SrEmpoloyee extends Lead  //abstract class
{
	abstract void managerJuniors();      //abstract method
	@Override
	void manageTeam() 
	{
		System.out.println("Manages sr employees and juniors");
	}
}
public class Employee extends SrEmpoloyee
{
	static void test() 
	{
		System.out.println("Employee does testing");
	}
	void code() 
	{
		System.out.println("Employee does coding");
	}
	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		ManageProject();
		e1.manageLeads();
		e1.manageTeam();
		e1.Report();
		e1.managerJuniors();
		test();
		e1.code();
	}
	@Override
	void managerJuniors() 
	{
		System.out.println("Sr employess helps juniors");
	}
}
