package anoundtech;

public class Calculator {

	
		void add1(int i,int j) {
			int sum=i+j;
			System.out.println("the sum of"+i+"and"+j+"is.."+sum);
			
			
		}

		
		int add2(int i,int j) {
			return i+j;
		}
		void add3(int i,int j) {
			display(i+j);
		}
		void display(int s) {
			System.out.println("The result is.."+s);
		}
		void add4(int ...i) {
			int result=0;
			for(int s:i) {
				result=result+s;
			}
			System.out.printf("The result is...%d",result);
		
			}
	  void add5(int i[]) {
		  int result=0;
		  for(int s:i) {
				result=result+s;
			}
			System.out.printf("The result is...%d",result);
	  }

}
