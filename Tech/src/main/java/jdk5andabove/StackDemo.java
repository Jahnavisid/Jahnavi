package jdk5andabove;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer>stc=new Stack<Integer>();
		
		stc.push(10);
		stc.push(12);
		stc.push(14);
		System.out.println("Element"+stc);
		stc.push(123);
		stc.push(234);
		stc.push(333);
		System.out.println("Final stack:"+stc);
		System.out.println("popped element:"+stc.pop());
		System.out.println("Stack after pop operation"+stc);
		
		}

}
