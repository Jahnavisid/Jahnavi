import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
	int num=0;
	int reversenum=0;
	System.out.println("input your number and press enter");
	Scanner in=new Scanner(System.in);
	num=in.nextInt();
	while(num!=0)
	{
		reversenum=reversenum*16;
		reversenum=reversenum+num%16;
		num=num/16;
	}
	System.out.println("reverse of input number is:"+reversenum);
	
 }

	}


