package Utilpack;
import java.util.ArrayList;
import java.util.Iterator;

import java.util.List;
import java.util.ListIterator;
public class ColDemo1 {

	public static void main(String[] args) {
		List<String>list=new ArrayList<>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		System.out.println("Original size..:"+list.size());
		list.add("dddd");
		System.out.println("modified...add..:"+list.size());
        list.remove(0);
        System.out.println("modified..remove...:"+list.size());
        list.add("bbb");
        list.add("aaa");
        System.out.println(list.get(1));
        System.out.println(list);
for(String s:list){
	System.out.println(s);
}
System.out.println("...............................");


for(int i=0;i<list.size();i++) {
	System.out.println(list.get(i));
}
System.out.println("****************************");
Iterator<String> iter=list.iterator();
while(iter.hasNext()) {
	System.out.println(iter.next());
}

System.out.println("============================");
ListIterator<String> lit=list.listIterator();
while(lit.hasNext()) {
	System.out.println(lit.next());
}
System.out.println("_________________________________");
while(lit.hasPrevious()) {
	System.out.println(lit.previous());
}

}
}