class SingletonClassExample   
{   
// static variable s of type Singleton   
private static Singleton s = null;   
// variable of type String   
public String str;   
//private constructor of the Singleton class that restricted to this class itself   
private Singleton()   
{   
str = "it is an example of singleton class.";   
}   
//static method to create an instance of the Singleton class   
// we can also create a method with the same name as the class name  
public static Singleton getInstance()   
{   
//lazy initialization  
if (s== null)   
s = new SingletonClassExample();   
return s;   
}   
}  
	
