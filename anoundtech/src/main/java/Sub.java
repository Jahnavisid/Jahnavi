
		import java.util.Scanner;
		public class Sub {

			public static void main(String[] args) {
			int n,Count=0;
			System.out.println("enter any Number:");
			Scanner ref=new Scanner(System.in);
			n=ref.nextInt();
			for(int i=1;i<=n;i++)
			{
				if(n%i==0);
				{
					Count++;
					
				}
			}
			if(Count==2)
				System.out.println("prime number:");
			else
				System.out.println(" not prime number:");
			}
		
			}

		
