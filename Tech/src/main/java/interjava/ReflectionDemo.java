package interjava;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


	public class ReflectionDemo {
		public static void main(String[] args)throws Exception {
			Politician diamond=new Politician();
			PoliceStation p1=new PoliceStation();
			Barber barber=new Barber();
			
			p1.arrest(diamond);
		}
}
class PoliceStation{
	public void arrest(Object obj)throws Exception{
		Class c=obj.getClass();
		Field f=c.getField("name");
		System.out.println(f.get(obj));
		
		
		Method m=c.getMethod("service");
		m.invoke(obj);
		singamIntrogation(obj);
		
	}
	public void singamIntrogation(Object obj)throws Exception{
		Class c=obj.getClass();
		Field f=c.getDeclaredField("secretName");
		f.setAccessible(true);
		System.out.println(f.get(obj));
		
		
		Method m=c.getDeclaredMethod("secret service");
		m.setAccessible(true);
		m.invoke(obj);
	}
}
		
		

class Barber{
	public String name="Iam a good barber...";
	private String secretName="Iam a non incomeTax payer...";
}
class Politician{
	public String name="Iam a good man..";
	private String secretName="Iam a gunda...theif...";
	public void service() {
		System.out.print("i do social service...");
	}
	private void secretService() {
		System.out.println("i do loot people...");
	}
}
	
	
