import java.util.Scanner; 
public class QuadraticEquationExample1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);  
		System.out.print("Enter the value of a: ");  	
	   double a=input.nextDouble();
	   System.out.print("Enter the value of b: ");  	
	   double b=input.nextDouble();
	   System.out.print("Enter the value of c: ");  	
	   double c=input.nextDouble();
		double d=b*b-4.0*a*c;
		if(d>0.0)
		{
			double r1=(-b+Math.pow(d,0.5))/(2.0*a);
		
			double r2=(-b-Math.pow(d,0.5))/(2.0*a);
			System.out.println("the roots are"+r1+"and"+r2);
		}
		else if(d==0.0)
		{
			double r1=-b/(2.0*a);
			System.out.println("the roots is"+r1);
		}
		else
		{
			System.out.println("roots are not real");
		}
	}

		}
		
		


