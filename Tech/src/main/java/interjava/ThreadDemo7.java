package interjava;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo7{

	public static void main(String[] args) {
		CounsellingHall anna=new CounsellingHall();
		ExecutorService es=Executors.newFixedThreadPool(3);
		es.execute(()->{
	Thread.currentThread().setName("kamal");
	anna.showPapers();
	anna.selectCollege();
	anna.payFees();
	anna.exit();
		
});
		es.execute(()->{
			Thread.currentThread().setName("rajini");
			//synchronized(anna) {
			anna.showPapers();
			anna.selectCollege();
			anna.payFees();
			anna.exit();
			//}
		});
		es.execute(()->{
			//synchronized(anna) {
			Thread.currentThread().setName("captain");
			anna.showPapers();
			anna.selectCollege();
			anna.payFees();
			anna.exit();
			//}
		});
		es.shutdown();
	}
}
class CounsellingHall{
	synchronized public void showPapers() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" showing papers...");
		try {Thread.sleep(3000);}catch(Exception e) {}
		System.out.println(name+" completed showing papers...");
	}
	synchronized public void selectCollege() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" selecting college...");
		try {Thread.sleep(3000);}catch(Exception e) {}
		System.out.println(name+" completed selecting college...");
	}
	synchronized public void payFees() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" paying fees...");
		try {Thread.sleep(3000);}catch(Exception e) {}
		System.out.println(name+" payed fees...");
	}
	synchronized public void exit() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" exit...");
	}

	}

