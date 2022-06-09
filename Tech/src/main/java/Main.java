class Inner{
	public void show() {
		System.out.println("nested statement");
	}
	class Outer{
		public void show() {
			System.out.println("nested statement");
		}
		class Outer2{
			private static String money2="two hundred rupees............";
			public static Object Inner;
			private static void outerMethod2() {
			}
		}
	}
}
public class Main {

	public static void main(String[] args) {
	Inner.Outer in =new Inner().new Outer();
    in.show();
  
    
	}

}

