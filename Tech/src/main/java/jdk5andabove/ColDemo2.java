package jdk5andabove;
import java.util.Comparator;

import java.util.TreeSet;
import java.util.Set;


public class ColDemo2 {

	public static void main(String[] args) {
		Set<String> ts=new TreeSet<String>();
		
		ts.add("aaa");
		ts.add("bbb");
		ts.add("ccc");
		System.out.println(ts);

	}

}
class MyComparator implements Comparator<A>{
	@Override
	public int compare(A o1, A o2) {
		
		return o1.compareTo(o2);
	}
}
class A implements Comparable<A>{
	public A(String name) {
		this.name=name;
	}
	String name;
	@Override
	public int compareTo(A s) {
		System.out.println(s);
				return name.compareTo(s.name);
				
	}
	@Override
	public String toString() {
		
		return this.name;
	}
}

	 

