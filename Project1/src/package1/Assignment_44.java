package package1;

public class Assignment_44 {


	public static void main(String[] args) 
	{
		String s = "MANISH KUMAR TIWARI";
		
		String a = s.substring(13);
		String b = s.substring(0, 6);	
						
		String c = s.substring(7, 12).toLowerCase();
		System.out.println(c.charAt(0)+c.substring(1,5).toLowerCase()+" "+ b.charAt(0)+ b.substring(1, 6).toLowerCase());


	}

}
