package utilPack1;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ColDemo6 {

	public static void main(String[] args) {
		Properties prop=new Properties();
		prop.put("a121","java" );
		prop.put("a122","oracle" );
		prop.put("a123", "c");
		System.out.println(prop);
		System.out.println(prop.get("s121"));
		
		
		Set s=prop.entrySet();
		Iterator iter=s.iterator();
		while(iter.hasNext()) {
			Map.Entry me=(Map.Entry)iter.next();
			System.out.println(me.getKey()+":"+me.getValue());
		}
		
		
	}

}
