package package1;

public class Assignment_16 {

	static void add() {
		System.out.println("This is a static methos");
	}
	void multiple() {
		System.out.println("this is a non static method");
	}
	//Constructor
	Assignment_16(){
		System.out.println("This constructor");
	}
	//SIB
	static {
		System.out.println("Static initialization block");
	}
	//IIB
	{
		System.out.println("Instance initialization block");
	}
	public static void main(String[] args) {
		
		System.out.println("main method 1");
		new Assignment_16();
		System.out.println("main method 2");


	}

}
