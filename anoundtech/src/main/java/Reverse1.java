import java .util.Scanner;
public class Reverse1 {

	public static void main(String[] args) {
		int n,r;
		System.out.println("enter any number");
		Scanner ref=new Scanner(System.in);
		n=ref.nextInt();
		while(n>0)
		{
		r=n%10;
		n=n/10;
		System.out.println("Reverse order"+r);
		}
	}

}
