
 class EnumDemo {
  enum Level1{
	  Low,MEDIUM;
	  
  }
	public static void main(String[] args) {
		for(Level1 X:Level1.values())
		{	
		System.out.println(X);
	}
}
 }
