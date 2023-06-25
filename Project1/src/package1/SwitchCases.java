package package1;

import java.util.Scanner;

public class SwitchCases {
	
	static Scanner s2=new Scanner(System.in);	

	static void add() {
		System.out.println("Enter value of 'a'");
		int a=s2.nextInt();
		System.out.println("Enter value of 'b'");
		int b=s2.nextInt();
		int c=a+b;
		System.out.println("final result is: "+ c);
	}
	
	static void sub() {
		System.out.println("Enter value of 'a'");
		int a=s2.nextInt();
		System.out.println("Enter value of 'b'");
		int b=s2.nextInt();
		int c=a-b;
		System.out.println("final result is: "+ c);	
	}
	
	static void mul() {
		System.out.println("Enter value of 'a'");
		int a=s2.nextInt();
		System.out.println("Enter value of 'b'");
		int b=s2.nextInt();
		int c=a*b;
		System.out.println("final result is: "+ c);		
	}
	
	static void div() {
		System.out.println("Enter value of 'a'");
		int a=s2.nextInt();
		System.out.println("Enter value of 'b'");
		int b=s2.nextInt();
		int c=a/b;
		System.out.println("final result is: "+ c);		
	}

	public static void main(String[] args) {
		

		System.out.println("List of operations.\n"
				+ "Addition             = 1 \n"  
				+ "subtraction          = 2 \n"
				+ "Multiplication       = 3 \n"
				+ "Division             = 4 \n");
		System.out.println("Please select the operation that you want to perform");
		
		Scanner s1 = new Scanner(System.in);

		int n=s1.nextInt();
		
		System.out.println("Operations selected is: "+ n);
				
		switch(n) 
		{
		case 1: add();
		break;
		
		case 2: sub();
		break;
		
		case 3: mul();
		break;
		
		case 4: div();
		break;
		
		default:
			System.out.println("Please select number between 1-4 only");
		}
		s1.close();


	}

}
