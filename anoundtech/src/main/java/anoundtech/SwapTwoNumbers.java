package anoundtech;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		float first =2.50f,second = 4.5f;
		System.out.println("--before swap--");
        System.out.println("first number="+first);
        System.out.println("second number="+second);
	
        
        float temporary =first;
        first=second;
        second=temporary;
        
        System.out.println("---after swap--");
    	 
        System.out.println("first number="+first);
        System.out.println("second number="+second);
    	
}
}