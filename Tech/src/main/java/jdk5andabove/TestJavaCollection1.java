package jdk5andabove;
import java.util.*;
class TestJavaCollection1{
	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add("Ravi");
		list.add("vijay");
		list.add("Ajay");
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}