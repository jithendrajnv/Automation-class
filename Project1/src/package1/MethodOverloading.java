package package1;

public class MethodOverloading {

	
	static void jeet () 
	{
		System.out.println("Static method overloaded");
		
	}
	 void multiplication() {
		 int a=10;
		 int b=20;
		 int c= a*b;
		 System.out.println("Non static overloaded");
		 System.out.println(c);

				
	 }
	
	public static void main(String[] args) {
		jeet();
		
		MethodOverloading m1=new MethodOverloading();
		m1.multiplication();
		

	}

}
