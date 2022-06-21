package iopack;

import java.io.FileInputStream;

public class FileDemo {

	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("applog.txt");
			System.out.println(fis.available());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
		    System.out.println((char)fis.read());	
		    System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			
			int available=fis.available();
			byte c[]=new byte[available];
			fis.read(c);
			System.out.println(fis.available());
			String s=new String(c,1,available);
			System.out.println(s);
			
			
		}catch(Exception e) {
			e.printStackTrace();
	

}
}
}
	