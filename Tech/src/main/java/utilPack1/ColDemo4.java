package utilPack1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map;
public class ColDemo4 {

	public static void main(String[] args) {
	TreeMap<String,String> hm=new TreeMap<String,String>();
	//HashMap<String,String> hm=new HashMap<String, String>();
	hm.put("s111","tanish");
	hm.put("s222","yash");
	hm.put("s333","deelip");
	hm.put("444","kalyani");
	System.out.println(hm);
	//System.out.println(hm.get("s222"));
	Set<Map.Entry<String,String>>s=hm.entrySet();
	Iterator<Map.Entry<String,String>>iter=s.iterator();
	while(iter.hasNext()) {
		Map.Entry<String, String>me=iter.next();
		System.out.println(me.getKey()+":"+me.getValue());
		
	}
	}

}
