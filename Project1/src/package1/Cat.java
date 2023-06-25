package package1;
class Wolf{
	void wild() {
		System.out.println("Wild wolf");
	}
}

class Doggy extends Wolf{
	void retriever() {
		System.out.println("Retriever dog");
	}
	
}
public class Cat extends Doggy{
	void persian() {
		System.out.println("Persian cat");
		
	}

	public static void main(String[] args) {
		Doggy d1=new Cat();
		System.out.println("Upcasting");
		d1.retriever();
		d1.wild();
		
		System.out.println("\nDowncasting");
		 Cat c1= (Cat) d1;
		 c1.persian();
		 c1.retriever();
		 c1.wild();
		

	}

}
