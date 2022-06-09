
public class SuperWithVariables {

	public static void main(String[] args) {
		
		varMed vn=new varMed();
 System.out. println(vn.top);
 
 vn.getmet();
 
 vn.getmet();
 
	}

}
class varTop{
	int top=20;
	
}
class varMed extends varTop{
	int top=40;
	
	public void getmet() {
		System.out.println("Local...:"+top);
		System.out.println("Parent..:"+super.top);
}
class varNut extends varMed{
	int top=10;
	public void met() {
	super.getmet();
	
		System.out.println("Local...:"+top);
		System.out.println("Parent..:"+super.top);
	}

	
}
}
