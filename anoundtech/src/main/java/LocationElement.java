import java.util.Scanner;
public class LocationElement {

	
		public static int findLocation(int arr[],int t) {
			
			{
				if(arr==null) {
					return-1;
				}
				int len=arr.length;
				int i=0;
				while(i<len) {
					if(arr[i]==t) {
				
				return i;
			}
			else {
				i=i+1;
			}
		}

	return -1;
	}
	public static void main(String[]args){
	
		int[]my_array= {5,6,8,7,1,5,4,8,9};
		System.out.println("Index position of 5 is:"+findIndex(my_array,5));
		 System.out.println("Index position of 7 is: "
                 + findIndex(my_array, 7));
	}
		}
	
	