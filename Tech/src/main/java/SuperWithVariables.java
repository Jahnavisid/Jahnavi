
public class SuperWithVariables {
	public static void main(String[] args) {
		VarBot vb=new VarBot();
		System.out.println(vb.top);
		vb.met();
	}
}
class VarTop{
	int top=30;
}
class VarMed extends VarTop{
	int top=20;
}
class VarBot extends VarMed{
	int top=10;
	public void met() {
		System.out.println("Local...:"+top);
		System.out.println("Parent..:"+super.top);
	}
}
