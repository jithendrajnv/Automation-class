package package1;

public class Assignment_23 {
	
	static double a = 10;
	static double b = 24;

	
	static void add() {
		double c= a+b;
		System.out.println("Result after addtion is: "+c);
		
	}
	static void sub() {
		double c= a-b;
		System.out.println("Result after subtraction is: "+c);
	}
	void mul() {
		double c= a*b;
		System.out.println("Result after multiplication is: "+c);
		
	}
	void div() {
		double c= a/b;
		System.out.println("Result after division is: "+c);
		
	}
	
	
	public static void main(String[] args) {
		add();
		sub();
		
		Assignment_23 a1=new Assignment_23();
		a1.mul();
		a1.div();

	}

}
