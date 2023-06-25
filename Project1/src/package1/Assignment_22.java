package package1;

import java.util.Scanner;

public class Assignment_22 {
	
final static double pi=3.14;

	public static void main(String[] args) {

		Scanner s1=new Scanner(System.in);
		
		System.out.println("Addition");
		System.out.println("Enter the value of n1:");
		int n1=s1.nextInt();
		System.out.println("Enter the value of n2:");
		int n2=s1.nextInt();
		int result1=n1+n2;
		System.out.print("Sum of n1 and n2 is: ");
		System.out.println(result1);
		
		System.out.println("Subtraction");
		System.out.println("Enter the value of n3:");
		int n3=s1.nextInt();
		System.out.println("Enter the value of n4:");
		int n4=s1.nextInt();
		int result2=n3-n4;
		System.out.print("Sum of n3 and n4 is: ");
		System.out.println(result2);
		
		System.out.println("Multiplication");
		System.out.println("Enter the value of n5:");
		int n5=s1.nextInt();
		System.out.println("Enter the value of n6:");
		int n6=s1.nextInt();
		int result3=n5*n6;
		System.out.print("Sum of n5 and n6 is: ");
		System.out.println(result3);
		
		System.out.println("Division");
		System.out.println("Enter the value of n7:");
		int n7=s1.nextInt();
		System.out.println("Enter the value of n8:");
		int n8=s1.nextInt();
		int result4=n7/n8;
		System.out.print("Sum of n7 and n8 is: ");
		System.out.println(result4);
		
		System.out.println("area of circle");
		System.out.println("Enter the value of radius");
		double n9=s1.nextDouble();
		double result5=pi*n9;
		System.out.println(result5);
		
		System.out.println("Area of Rectangle");
		System.out.println("Please enter value of lenth:");
		double l=s1.nextDouble();
		System.out.println("Please enter value of width:");
		double w=s1.nextDouble();
		double area=l*w;
		System.out.print("Area of rectangle is: ");
		System.out.println(area);
		
	}

}
