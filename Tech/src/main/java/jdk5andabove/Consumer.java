package jdk5andabove;
import java.lang.reflect.Method;
public class Consumer {

	public static void main(String[] args)throws Exception {
		Food food=new Food();
		//veg veg=food.getClass().getAnnotation(veg.class);
        //if(veg==null) {
        	//System.out.println("non vegetarian food...");
        	
      //  }
        //else {
        	//System.out.println("this is a vegetarian food...");
        //}
        
        Method m=food.getClass().getMethod("rice");
        veg veg=m.getAnnotation(veg.class);
        if(veg==null) {
			System.out.println("rice is non vegetrian food");
		}
		else {
			System.out.println("rice is vegetarian food...");
		}
	}
}


