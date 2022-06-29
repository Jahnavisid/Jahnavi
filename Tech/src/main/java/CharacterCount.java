import java.util.HashMap;

public class CharacterCount {

	public static void main(String[] args) {
		String str="java ";
		int count;
		char ch;
		HashMap<Character,Integer>hashmap=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++) {
			ch= str.charAt(i);
			if(hashmap.containsKey(ch)) {
				count=hashmap.get(ch);
				count++;
				hashmap.replace(ch, count);
				
					
				}
			else {
				hashmap.put(ch,1);
			}
			for(Character key:hashmap.keySet()) {
				System.out.println(key+"="+hashmap.get(key));
			}
			}
		}

	}


