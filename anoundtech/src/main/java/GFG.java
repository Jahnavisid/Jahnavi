
public class GFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Singleton x = Singleton.getInstance();
		 Singleton y = Singleton.getInstance();
		 Singleton Z = Singleton.getInstance();
		
		
		
		
		 System.out.println("Hashcode of x is "
                 + x.hashCode());
System.out.println("Hashcode of y is "
                 + y.hashCode());
System.out.println("Hashcode of z is "
                 + Z.hashCode());

// Condition check
if (x == y && y == Z) {

  // Print statement
  System.out.println(
      "Three objects point to the same memory location on the heap i.e, to the same object");
}

else {
  // Print statement
  System.out.println(
      "Three objects DO NOT point to the same memory location on the heap");
}
}
}
		
		
		
	


