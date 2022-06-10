
public class ProtoDemo {

	public static void main(String[] args) {
		Balance b1=new Balance();
		Balance b2=b1;
		Balance b3=b1;
		b2=new Balance();
		b2=b1.getClone();
		b1.amt=1000;
		System.out.println(b1.amt);
        b2.amt=500;
		
		System.out.println(b2.amt);

	}

}
class Balance implements Cloneable{
	public Balance() {
		System.out.println("balance object created...");
	}
	int amt;
	public Balance getClone() {
		try {
			return (Balance)super.clone();
		}catch(Exception e) {
			System.out.println(e);
			return null;
		}
	}
		
	}
