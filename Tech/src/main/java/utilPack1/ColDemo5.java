package utilPack1;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class ColDemo5 {
   public static void main(String[] args) {
	Map<String,String> map=new WeakHashMap<String,String>();
	String key1=new String("a1 1000");
	String key2=new String("a2 1000");
	
	map.put(key1,"befind force");
	map.put(key2,"tech solutions");
	System.out.println(map);
	key1=null;
	System.out.println(map);
	System.gc();
	System.out.println(map);
}
}

