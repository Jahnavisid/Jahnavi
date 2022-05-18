import java.util.*;
public class Demo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the array");
		int []arr=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
			System.out.println("array elements is");
			for(int i=0;i<arr.length;i++)
				System.out.println(arr[i]+"");
		}

	}


