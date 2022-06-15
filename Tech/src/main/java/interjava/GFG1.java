package interjava;

public class GFG1 {
	 public static Object Lock=new Object();
    public static void main(String[] args)
  		  throws InterruptedException {
		Thread.sleep(80);
		System.out.println("Thread"+Thread.currentThread().getName()+"is woken..");
		synchronized (Lock)
		{
		Lock.wait(90);
		System.out.println("Thread"+Thread.currentThread().getName()+"is woken after..");
		
		
		}
	}
}
    
