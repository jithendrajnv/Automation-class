package package1;

import java.util.Scanner;

public class Assignment_27 
{
	static Scanner s1 = new Scanner(System.in);

	static void integers() 
	{
		System.out.println("Enter int value");
		int a = s1.nextInt();
	}

	static void doubles() 
	{
		System.out.println("Enter double value");
		double c = s1.nextDouble();

	}

	static void booleans() 
	{
		System.out.println("Enter boolean value");
		boolean d = s1.nextBoolean();

	}

	static void strings() 
	{
		System.out.println("Enter string value");
		String str = s1.next();

	}

	public static void main(String[] args) {
//		integers();
//		doubles();
		booleans();
		strings() ;
		
		

	}

}
