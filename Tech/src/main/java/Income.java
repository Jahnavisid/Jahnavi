import java.util.Scanner;

public class Income {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int income;
		int total=0;
		int avgIncome;
		int x=0;
		
		while(x<10) {
			x++;
			System.out.println("enter the daliy income:");
			
			income=sc.nextInt();
			total=total+income;
		}
		avgIncome=total/10;
			System.out.println();
			System.out.println();
			System.out.println("your total income is:"+total);
			System.out.println("the average of the income is:"+avgIncome);
		}

	}


