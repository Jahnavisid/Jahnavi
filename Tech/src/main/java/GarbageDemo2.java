import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
public class GarbageDemo2 {

	public static void main(String[] args) {
		Runtime r=Runtime.getRuntime();
		System.out.println("Available memory ..:"+r.freeMemory());
		System.out.println("Available Processors..:"+r.availableProcessors());
		System.out.println("Free Memory..:"+r.freeMemory());
		r.gc();
		
		Food food=new Food();
		System.out.println("Free Memory..:"+r.freeMemory());
		WeakReference weak=new WeakReference(food);
		food=null;
		r.gc();
		System.out.println("Free Memory..:"+r.freeMemory());
		food=(Food)weak.get();
		System.out.println(food);
		
		
	}

}
class Food{
	public void finalize()throws Throwable{
		System.out.println("finalize for the food object called...");
	}
	


	}
