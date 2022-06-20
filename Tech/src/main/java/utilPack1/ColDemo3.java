package utilPack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.HashSet;
public class ColDemo3 {

	public static void main(String[] args) {
		List<Student> list=new ArrayList<Student>();
		list.add(new Student("suma"));
		list.add(new Student("janu"));
		list.add(new Student("keerthi"));
		list.add(new Student("harika"));
		list .add(new Student("akshaya"));
		System.out.println("Before sorting.."+list);
		Collections.sort(list,new MyComparator());
		System.out.println("After sorting.."+list);
		
		HashSet<Student>hs=new HashSet<Student>(list);
		System.out.println(hs);
		
		TreeSet<Student> ts=new TreeSet<Student>(new MyComparator());
		ts.addAll(hs);
		System.out.println(ts);
	}

}
class MyComparator implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		
		return o2.compareTo(o1);
	}
}
class Student implements Comparable<Student>{
	String name;
	public Student(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		
		return this.name;
	}
	@Override

public int compareTo(Student o) {
	
	return this.name.compareTo(o.name);
}
}
