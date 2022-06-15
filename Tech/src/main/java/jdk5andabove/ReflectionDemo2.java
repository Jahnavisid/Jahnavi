package jdk5andabove;
import java.lang.reflect.Method;
public class ReflectionDemo2 {
	public static void main(String[] args) throws Exception{
		Demo obj=new Demo();
		System.out.println(obj);
		
		Demo demo=(Demo)Class.forName("jdk5andabove.Demo").newInstance();
		System.out.println(demo);
		
		demo=(Demo)Class.forName("jdk5andabove.Demo").getConstructor().newInstance();
		
		System.out.println(demo);
		
		demo=(Demo)Class.forName("jdk5andabove.Demo").getConstructor(String.class,int.class).newInstance("hello",100);
		System.out.println(demo);
		
		Class c=demo.getClass();
		Method m=c.getDeclaredMethod("met",String.class,Employee.class);
		
		m.setAccessible(true);
		System.out.println(m);
		m.invoke(demo,"hello",new Employee());
	}
}
class Demo{
	public Demo() {
		System.out.println("empty constructor....");
	}
	
	public Demo(String str,int i) {
		System.out.println(str+"....................."+i);
	}
	
	public void met(String s,Employee e) {
		System.out.println(s+"............."+e);
	}
}
class Employee{
	public Employee() {
		System.out.println("employee obj created...");
	}
}