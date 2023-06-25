package package1;

abstract class Bharth{	
	abstract void flag();
	abstract void states();	
}

abstract class Karnataka extends Bharth {
	abstract void capital();
	abstract void language();
	
	@Override
	void flag() {
		System.out.println("Our flag is tricolor");		
	}

	@Override
	void states() {
		System.out.println("There are 28 states in India");
	}
}

abstract class Bangalore extends Karnataka
{
	abstract void bmtc();
	abstract void metro();
	
	@Override
	void capital() {
	System.out.println("Bangalore is the capital of Karnataka state");	
	}

	@Override
	void language() {
		System.out.println("Kannada is the regional language of Karnataka");
	}	
}

public class Lalbagh extends Bangalore
{
	void plants() {
		System.out.println("Lalbagh is a botanical garden of bangalore");
	}

	public static void main(String[] args) {
		Lalbagh l1=new Lalbagh();
		l1.plants();
		l1.flag();
		l1.states();
		l1.capital();
		l1.language();
		l1.metro();
		l1.bmtc();	
	}

	@Override
	void bmtc() {
		System.out.println("Bengaluru Metropolitan Transport Corporation");
	}

	@Override
	void metro() {
		System.out.println("Namma metro");
		}
}
