
public class ExcepDemo {
	public static void main(String[] args) {
		System.out.println("before exception....");
		try {
			int i=1/0;
		}catch(ArithmeticException e) {//try-catch is to avoid abnormal termination of the program
			System.out.println(e);//Exception printing...
			new Handler().handle(e);//Exception handling
		}
		System.out.println("After exception....");
	}
}
class Handler{
	public void handle(ArithmeticException ae) {
		System.out.println("please dont divide the number by zero..");
	}
}