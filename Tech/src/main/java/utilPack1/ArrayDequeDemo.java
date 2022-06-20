package utilPack1;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
	ArrayDeque<Integer> ad=new ArrayDeque<Integer>(10);
	ad.add(10);
	ad.add(20);
	ad.add(30);
	ad.add(40);
	System.out.println(ad);
    ad.clear();
    System.out.println(ad);
    ad.addFirst(999);
    ad.addLast(888);
    
    System.out.println(ad);
    
    ad.addFirst(333);
    ad.addFirst(000);
    
    System.out.println(ad);
	}

}
