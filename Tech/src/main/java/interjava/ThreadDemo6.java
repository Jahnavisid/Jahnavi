package interjava;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ThreadDemo6 {

	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(
			()->{ synchronized(Theatre.class) {
				Thread.currentThread().setName("rajini");
				Theatre.toilet.useToilet();
			}
			}
		);
		es.execute(()->{synchronized(Theatre.class) {
			
			Thread.currentThread().setName("raj");
			Theatre.toilet.useToilet();
			
		}
		
		}
		);
		es.shutdown();
		}
		
		}
class Toilet{
	public void useToilet() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" is using the toilet...");
		try {
			Thread.sleep(5000);}catch(Exception e) {
			}
		System.out.println(name+" came out of toilet...");
		
		System.out.println(name+" came out and use the tissue..");
	}
}
		
		
		
	
class Theatre{
	static Toilet toilet=new Toilet();
	
}


