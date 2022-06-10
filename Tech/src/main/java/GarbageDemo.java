
public class GarbageDemo {

	public static void main(String[] args) {
		Runtime r=Runtime.getRuntime();
		System.out.println("Free Memory..:"+r.freeMemory());	
		r.gc();
	   GrandFather tatha=new GrandFather();
	   System.out.println("free Memory..:"+r.freeMemory());
	   tatha=null;
	   System.out.println(tatha.getGold());
	   System.out.println("After tathas death..:"+r.freeMemory());
	}

}
class GrandFather{
	String age;
	private String gold="under the tree...";
	public GrandFather() {
		for(int i=0;i<1000;i++) {
			age=new String("my name is billa..."+i);
		}
	}
	protected String getGold() {
		return "the gold is...:"+gold;
	}
	protected void finalize()throws Throwable{
		System.out.println(getGold());
		
			
		}
	}
	

