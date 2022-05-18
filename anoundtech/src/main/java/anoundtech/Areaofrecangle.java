package anoundtech;
import java.util.Scanner;
public class Areaofrecangle {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the length of Rectangle:"); 
	       double length = scanner.nextDouble(); 
	       System.out.println("Enter the width of Rectangle:"); 
	       double width = scanner.nextDouble();
	       double area=length*width;
	       System.out.println("area of Rectangle is:"+area); 
	}
}

	        
