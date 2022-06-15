package interjava;
import java.util.concurrent.Callable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class ThreadDemo4 {

	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(1);
		Future fut=es.submit(new MyCallable());
		
		
	}

}
class MyCallable implements Callable{
	public Object call()throws Exception{
		return "hello from callable...";
	}
}