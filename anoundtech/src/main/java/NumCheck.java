import java.util.Scanner;
public class NumCheck {
  
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("enter a number maximum 9 digit");
	int num=input.nextInt();		
	System.out.println("Enter the digit according to your choice 1 or 2 or 3 or 4 to check the number what you have entered");
    System.out.println("1.for checking primeNumber");
    System.out.println("2. for checking Armstrong Number");
    System.out.println("3. for checking Palindrome Number");
    System.out.println("4. for checking Perfect Number");
    System.out.println("enter your choice :");

    int a= input.nextInt();
    switch (a){     

    case 1:

        int flag=0;	
        for(int i=2;i<num;i++)
        {
        	if(num%i==0)
        	{
        		System.out.println(num+"is not a prime Number");
        		flag=1;
        		break;
        		
        	}
        }
        if(flag==0)
        	System.out.println(num+"is a primenumber");
        break;
    case 2:
    	int n=num;
    	int res=0,remainder;
    	while(num>0) {
    		remainder=num%10;
    		res=res+(remainder*remainder*remainder);
    		num=num/10;
    	}
    	if(res==n)
    		System.out.println(n+" is an Armstrong Number");
    	 
        else

            System.out.println(n+" is not a Armstrong Number");
           break;
    case 3:
    	int k=num;
    	int reverse=0,rem;
    	while(num>0) {
    		rem=num%10;
    		reverse=reverse*10+rem;
    		num=num/10;
    	}
    	if(reverse == k)
    		 
            System.out.println(k+" is a Palindrome Number");

        else

            System.out.println(k+" is not a Palindrome Number");
        break;
    case 4:
    	int perfectno=0;
    	int i;
    	System.out.println("Factors are:"); 
    	for (i = 1; i < num; i++) {
    		if(num%i==0) {
    		perfectno += i; 
    		System.out.println(i);
    		}
    		}
    	if (perfectno == num) {  
            System.out.println("number is a perfect number");         
        }
        else
        {                      
            System.out.println("number is not a perfect number");    
        }      

    }
}

  

}
