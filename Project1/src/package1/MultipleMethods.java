package package1;

public class MultipleMethods {
	
	static void add() 
	{
		System.out.println("static with no parameters");
	}
	static void add(int a) 
	{
		System.out.println("static with integer");
	}
	static void add(double a) 
	{
		System.out.println("static with double");
	}
    void multiple() 
	{
		System.out.println("non static with no parameters");
	}
    void multiple2(int a) 
	{
		System.out.println("non static with parameters");
	}
	MultipleMethods(){
		System.out.println("Constructor without parameter");
	}
	MultipleMethods(int a){
		System.out.println("Constructor with integer");
	}
	MultipleMethods(double a){
		System.out.println("Constructor with double");
	}
 
	public static void main(String[] args) {
		add();
		add(2);
		add(1.0);
		MultipleMethods m1= new MultipleMethods();
		m1.multiple();
		m1.multiple2(2);
		new MultipleMethods(2);
		new MultipleMethods(2.1);
			
		
		
	}

}
