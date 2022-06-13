package interjava;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import java.util.concurrent.Executors;

public class ThreadDemo1 {

	public static void main(String[] args) {
		System.out.println("SOUP...");
		
		ExecutorService es=Executors.newFixedThreadPool(1);
		es.execute(()->{met();});
		es.shutdown();
		
		
		System.out.println("STARTER.....");
		
		
		
	}
	public static void met() {
		try {Thread.sleep(500);}catch(Exception e) {}
		System.out.println("MAIN ITEM....");
	}
	
	public static void getmet() {
		try {Thread.sleep(600);}catch(Exception e) {}
		System.out.println("MA ITEM....");
}
}
	