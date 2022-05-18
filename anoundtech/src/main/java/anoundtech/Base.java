package anoundtech;

public class Base {

    Base(int i){ 
    System.out.println("base constructor"); 
    } 
    Base(){ 
    } 
} 
public class Sup extends Base{ 
    public static void main(String argv[]){ 
         Sup s= new Sup(); 
    //One 
    } 
    Sup() 
    { 
        //Two 
    } 
    public void derived() 
    { 
        //Three 
    }