
class test{
	 // Case 1: Static variable 
    static int i;
    // Case 2: non-static variables
    int j;
 // Case 3: Static block
    static
    {
    	i=10;
    	System.out.println("static block called");
    }
}
class Test1{
	
	
	public static void main(String[] args) {

		 System.out.println(testh.i);

	}
}

