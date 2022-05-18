package anoundtech;

public class CastingDemo {

	public static void main(String[] args) {
	 byte b=100;
	  int n=b;
	  b=(byte)n;
     System.out.println(b);
     n=513;
     b=(byte)n;
     System.out.println(b);
     byte n1=2;
     byte n2=10;
     System.out.println(n1*n2);
     byte result=(byte)(n1*n2);
     float f=100.23f;
     n=(int)f;
     System.out.println(n);
     f=n;
     char c=97;
     n=c;
     System.out.println(c);
     System.out.println((char)n);
	}

}
