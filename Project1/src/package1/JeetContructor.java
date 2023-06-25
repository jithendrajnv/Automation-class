package package1;

public class JeetContructor {

	JeetContructor(){
		System.out.println("Constructor 1");
		
	}
	JeetContructor(int a){
		System.out.println("Constructor 2");
		
	}
	JeetContructor(double b){
		System.out.println("Constructor 3");
	
	}
	JeetContructor(int c, double d){
		System.out.println("Constructor 4");
		
	}
	
	
	
	public static void main(String[] args) {
		new JeetContructor(1);
		new JeetContructor(4,69.00);
		new JeetContructor(0.0);
		new JeetContructor();

	}

}
