package anoundtech;
import java.util.Scanner;
public class WhileLoopDemonstration {

	public static void main(String[] args) {
		int number,sum=0;
		Scanner sc=new Scanner(System.in);
       System.out.println("n please enter any integer value below 10:");
       number=sc.nextInt();
       while(number<=10) {
    	   sum=sum+number;
    	   number++;
    	   
       }

       System.out.format("sum of the numbers from the while Loop is:%d",sum); 
}
}