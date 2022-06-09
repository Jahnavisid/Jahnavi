
public class SuperKeyWordDemo {

	public static void main(String[] args) {
		Medium m=new Medium();
		m.topmet();
		//m.topmetSub();

	}

}
abstract class TopTopStar{
	public void topMet() {
		System.out.println("top top met method called...");
	}
	
}
abstract class TopStar extends TopTopStar{
	public void topmet() {
		System.out.println("top met method called...");
	}
}
abstract class Top extends TopStar{
	final public void topmet() {
		super.topmet();
		System.out.println("top met method called...");
	}
}
class Medium extends Top{

	

		
	}
