package jdk5andabove;
import java.util.*;
public class CollectionDemo1 {

	public static void main(String[] args) {
		List<String>a2=new ArrayList<>();
		a2.add("aaa");
		a2.add("bbb");
		a2.add("ccc");
		System.out.println("Original size..:"+a2.size());
         a2.add("ddd");
         a2.add("fff");
        System.out.println("modified...add...:"+a2.size()); 
         a2.remove(0);
        System.out.println("modified..remove..:"+a2.size());
         System.out.println(a2.get(2));
	
         System.out.println(a2);
	
         System.out.println("...............");
         for(int i=0;i<a2.size();i++) {
        	 System.out.print(a2.get(i));
         }

	
	System.out.println("====================");
	  ListIterator<String>list=a2.listIterator();
	  while(list.hasNext()){
		  System.out.println(list.next());
	  }
	  System.out.println("--------------------");
	  while(list.hasPrevious()) {
		  System.out.println(list.previous());
	  }
	  
}
}