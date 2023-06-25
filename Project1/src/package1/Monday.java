package package1;

 class Thursday
 {
	 static void method1() {
		 System.out.println("static thurday");		 
	 }
	 void method2() {
		 System.out.println("non-static thursday");
	 }	 
 }
 
 class Wednesday extends Thursday
 {	 
	 static void method3() {
		 System.out.println("static Wednesday");		 
	 }
	 void method4() {
		 System.out.println("non-static Wednesday");
	 }	 
 }
 
 class Tuesday extends Wednesday
 {
	 static void method5() {
		 System.out.println("static Tuesday");		 
	 }
	 void method6() {
		 System.out.println("non-static Tuesday");
	 }
 }
 
 class Saturday extends Thursday
 {
	 static void method7() {
		 System.out.println("static Saturday");		 
	 }
	 void method8() {
		 System.out.println("non-static Saturday");
	 }
	 
 }
 
 class Friday extends Thursday
 {
	 static void method9() {
		 System.out.println("static Friday");		 
	 }
	 void method10() {
		 System.out.println("non-static Friday");
	 }
 }

public class Monday extends Tuesday
{
	static void method11() {
		 System.out.println("static Monday");		 
	 }
	 void method12() {
		 System.out.println("non-static Monday");
	 }

	public static void main(String[] args) {
		
		Monday m1=new Monday();
		
		method1();               //class Thursday
		m1.method2();
		
		method3();			   	 //class Wednesday
		m1.method4();
		
		method5();               //class Tuesday
		m1.method6();
		
//		method7();               //class Saturday
//		method8();
		
//		method9();               //class Friday
//		method10();
		
		method11();              //class Monday
		m1.method12();
		
		
	}

}
