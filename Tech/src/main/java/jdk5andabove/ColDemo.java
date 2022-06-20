package jdk5andabove;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;
public class ColDemo {

	public static void main(String[] args) {
		Set<String> hs=new HashSet<String>();
		
		hs.add("aaa");
		hs.add("baa");
		hs.add("caa");
		System.out.println(hs);
		hs.remove("aaa");
		System.out.println(hs.size());
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains("baa"));
		hs.forEach(System.out::println);
		//hs.forEach(new MyConsumer());
	   // hs.forEach((s)->{System.out.println(s);});
	
	  
	    //hs.forEach(System.out::println);
		Iterator<String>it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		
		}
	}
	
	static void print(String s) {
		
		System.out.println(s);
	}
			
			
			
	
	}


class MyConsumer implements Consumer<String>{
	@Override
	public void accept(String s) {
		System.out.println(s);
		
	}

	
}

