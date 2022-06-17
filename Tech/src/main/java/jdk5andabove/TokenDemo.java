package jdk5andabove;

import java.util.StringTokenizer;

public class TokenDemo {

	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("my name is jahnavi"," ");
			while(st.hasMoreTokens()) {
			String s=st.nextToken();
			System.out.println(s);
				
		}

	}

}
