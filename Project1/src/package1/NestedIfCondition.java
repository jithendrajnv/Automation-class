package package1;

public class NestedIfCondition {
	

	public static void main(String[] args) {
		int marks=61;
		
		if (marks>=35) {
			
			if(marks<=60) 
			{
				System.out.println("Second class");
				
			}
			
			else if(marks<=80) 
			{
				System.out.println("First class");
			}
			else 
			{
				System.out.println("Distinction");
			}
			
		}
		else 
		{
			System.out.println("you are failed");
		}
	}

}
