package utilPack1;

import java.util.Iterator;
import java.util.Vector;
import java.util.function.Consumer;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> vt=new Vector();
		vt.add(" janu");
		vt.add("deepu");
		vt.add("annu");
		vt.add("bindu");
		System.out.println(vt);
		
	System.out.println(vt.size());
	System.out.println(vt.isEmpty());
	System.out.println(vt.contains("bindu"));


Iterator<String> it= vt.iterator();
while(it.hasNext());
System.out.println(it.next());


vt.forEach((s)->{System.out.println(s);});

}
}
class MyConsumer implements Consumer<String>{ 
	@Override
	public void accept(String t) {
		System.out.println(t);
		
	}
}