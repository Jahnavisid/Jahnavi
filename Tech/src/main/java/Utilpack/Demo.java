package Utilpack;

import java.util.PriorityQueue;

public class Demo {

	public static void main(String[] args) {
		PriorityQueue<Integer> pQueue=new PriorityQueue<Integer>();
		pQueue.add(10);
		pQueue.add(7);
		pQueue.add(15);
		pQueue.add(05);
		
		System.out.print(pQueue.peek());
		
		System.out.print(pQueue.peek());
		System.out.print(pQueue.peek());	
		
		System.out.print(pQueue.poll());	
		System.out.print(pQueue.poll());	
		System.out.print(pQueue.poll());	
		System.out.print(pQueue.poll());	
		
	}

}
