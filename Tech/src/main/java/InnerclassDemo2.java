
public class InnerclassDemo2 {
	public static void main(String[] args) {
		Pepsi pepsiCo=new Pepsi();
		
		Kalimark kali=new Kalimark();
		
		pepsiCo.sellCola();
		kali.sellCola();
				
	}
}
class Pepsi{
	public void sellCola() {
		Kalimark.CampaCola cc= new Kalimark().new CampaCola();
		cc.makeCola();
		System.out.println("pepsi fills the cola in pepsi bottle and sells....");
	}
}
class Kalimark{
	public void sellCola() {
		CampaCola cc=new CampaCola();
		cc.makeCola();
		System.out.println("kalimark fills the cola in bovonto bottle and sells...");
	}
	class CampaCola{
		public void makeCola() {
			System.out.println("campa cola makes cola...");
		}
	}
}