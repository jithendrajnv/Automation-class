package package1;

class days                                 //p1
{
	static void currentDay() {
		System.out.println("Today is Sunday");
	}
	void numberOfDays() {
		System.out.println("today's day count is 1");
	}
}
class week extends days                   //c2
{
	static void weekNo() {
		System.out.println("This week count is 37");
	}
	void weekCount() {
		System.out.println("This month has 4 weeks");
	}
}
class year extends days                    //c3
{
	static void leapYear() {
		System.out.println("This is leap year");
	}
	void nonLeapYear() {
		System.out.println("This is non leap year");
	}
}
public class Month extends week            //c1
{
	static void birthMonth(){
		System.out.println("My birth month");
	}
	void monthCount(){
		System.out.println("total no of months: 12");
	}
	public static void main(String[] args) 
	{
		currentDay();
		weekNo();
//		leapYear();                         
		birthMonth();
		Month m1=new Month();
		m1.monthCount();
		m1.numberOfDays();
		m1.weekCount();


	}

}
