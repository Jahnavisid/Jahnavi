package jdk5andabove;

import java.util.HashSet;
import java.util.Set;

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
		
		
		
	}

}
