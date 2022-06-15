package interjava;

public class GenericDemo {

	public static void main(String[] args) {
	GoodPaintBrushVer3<Air> gp=new GoodPaintBrushVer3<>();
	Air air=new Air();
	gp.setObj(air);
	air=(Air)gp.getObj();
	air.dusting();
	
	
	}

}
class Water{
	public void sprinkle() {
		System.out.println("water is sprinkled...");
		
	}
}
class Air{
	public void dusting() {
		System.out.println("dusting....");
		
	}
}
class GoodPaintBrushVer3<T>{
	private T obj;
	public T getObj() {
		return this.obj;
	}
	public void setObj(T obj) {
		this.obj=obj;
	}
}






	
