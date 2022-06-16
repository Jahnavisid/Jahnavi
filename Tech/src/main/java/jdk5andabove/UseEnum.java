package jdk5andabove;

public class UseEnum {

	public static void main(String[] args) {
	System.out.println(Fruits.apple.details);
	
      System.out.println(Fruits.valueOf("apple").details);
      for(Fruits f:Fruits.values()) {
    	  
      System.out.println(f.details);
	}
      Fruits f=Fruits.grapes;
     switch(f) {
     case apple:{
    	 System.out.println("this is apple");
    	 break;
     }
     case mango:{
    	 System.out.println("this is mango");
    	 break;
     }
     default:{
    	 System.out.println("all your sins are forgiven...");
    	 break;
     }
     
     }
     }
}

