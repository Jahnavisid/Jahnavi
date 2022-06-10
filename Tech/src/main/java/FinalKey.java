
public class FinalKey{

	public static void main(String[] args) {
		
	Fincla fc=new Fincla();
	fc.x=200;
	fc.x=290;
	fc.met();
	Fincla1 fc1=new Fincla1();
     fc1.getmet();
	}

}
final class Fincla{
	 int x=100;
	int s=12;
	 void met() {
		 System.out.println("final class");
	}
	final void met(int i) {
	}
}
final class Fincla1{
	int x=300;
	 void getmet() {
		 System.out.println("non");
	 }
	
}


	


