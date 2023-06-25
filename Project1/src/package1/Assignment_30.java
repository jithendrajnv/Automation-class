package package1;

import java.util.Scanner;

public class Assignment_30 {
	

	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of a");

		int a=s1.nextInt();
		
		System.out.println("Enter the value of b");
		int b=s1.nextInt();

		
		
		if(a==b) {
			System.out.println("A is equal to B");		
		}
		else if (a<b) {
			System.out.println("A is less than B");
			
		}		
		else if(a>b) {
			System.out.println("A is greater than B");			
		}
		
		
		
		else if(a!=b) {
			System.out.println("A is not equal to B");			
		}
				
		if (a<b) {
			System.out.println("A is less than B");
			
		}
				
		else if(a>b) {
			System.out.println("A is greater than B");			
		}
				
		else if (a<=b) {
			System.out.println("A is less than or equal to B");			
		}
				
		else if(a>=b) {
			System.out.println("A is greater than or equal to B");
			
		}

	}

}
