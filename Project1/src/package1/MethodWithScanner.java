package package1;

import java.util.Scanner;

public class MethodWithScanner {
	static Scanner s2 = new Scanner(System.in);	
	static void add() {
		System.out.println("Enter first number");
		double n1=s2.nextDouble();
		System.out.println("Enter second number");
		double n2=s2.nextDouble();
		double result=n1+n2;
		System.out.println("Result after the operation is: "+ result);		
 	}
	static void sub() {
		System.out.println("Enter first number");
		double n1=s2.nextDouble();
		System.out.println("Enter second number");
		double n2=s2.nextDouble();
		double result=n1-n2;
		System.out.println("Result after the operation is: "+ result);		
 	}
	static void mul() {
		System.out.println("Enter first number");
		double n1=s2.nextDouble();
		System.out.println("Enter second number");
		double n2=s2.nextDouble();
		double result=n1*n2;
		System.out.println("Result after the operation is: "+ result);		
 	}
	static void div() {
		System.out.println("Enter first number");
		double n1=s2.nextDouble();
		System.out.println("Enter second number");
		double n2=s2.nextDouble();
		double result=n1/n2;
		System.out.println("Result after the operation is: "+ result);		
 	}
	static void circle() {
		double pi=3.14;
		System.out.println("Enter the value of radius");
		double n1=s2.nextDouble();
		double result=pi*n1;
		System.out.println("Area of the circle is: "+ result);		
 	}
	static void rectangle() {
		System.out.println("Enter length value");
		double n1=s2.nextDouble();
		System.out.println("Enter width value");
		double n2=s2.nextDouble();
		double result=n1*n2;
		
		System.out.println("Area of the rectangle is is: "+ result);
 	}
	static void triangle() {
		System.out.println("Enter height value");
		double n1=s2.nextDouble();
		System.out.println("Enter base value");
		double n2=s2.nextDouble();
		double result=(n1*n2)/2;
		System.out.println("Area of the triangle is is: "+ result);		
 	}
	//MAIN METHOD
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);	
		System.out.println("Select the operation \n"
				+ "Addition             = 1 \n"  
				+ "subtraction          = 2 \n"
				+ "Multiplication       = 3 \n"
				+ "Division             = 4 \n"
				+ "Area of circle       = 5 \n"
				+ "Area of rectangle    = 6 \n"
				+ "Area of triangle     = 7 \n");
		System.out.println("Operations selected is");

		int a=s1.nextInt();
				
		if (a==1) {
			add();	
		}
		else if (a==2) {
			sub();			
		}
		else if (a==3) {
			mul();			
		}
		else if (a==4) {
			div();			
		}
		else if (a==5) {
			circle();			
		}
		else if (a==6) {
			rectangle();			
		}
		else if (a==7) {
			triangle();			
		}
		else {
			System.out.println("Please select number between 1-7 only");
		}
		

	}

}
