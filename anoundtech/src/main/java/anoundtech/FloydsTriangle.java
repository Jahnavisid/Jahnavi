package anoundtech;

import java.util.Scanner;
class  FloydsTriangle
{

	public static void main(String[] args) {
		
		{
			int rows,number=1,counter,j;
			Scanner input=new Scanner(System.in);
System.out.println("Enter the number of rows for floyd's traingle:");
	      rows=input.nextInt();
	      System.out.println(" FloydsTriangle");
	      System.out.println("**************");
	      for(counter=1;counter<=rows;counter++)
	      {
	    	  for(j=1;j<=counter;j++)
	    	  {
	    		  System.out.print(number+" ");
	    		  number++;
	    	  }
	    	  System.out.println();
	      }
		}
	}}
	    	  
	      

