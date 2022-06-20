package utilPack1;

import java.util.Iterator;
import java.util.Stack;

public class ColDemo2 {

	public static void main(String[] args) {
		Stack<String> stack=new Stack<String>();
		stack.push("Beautiful");
		stack.push("picture");
		stack.push("of that");
		Iterator<String> itr=stack.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+"");
		}
		
		System.out.println();
		stack.pop();
		itr=stack.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+"");
		
	}

	}
}
