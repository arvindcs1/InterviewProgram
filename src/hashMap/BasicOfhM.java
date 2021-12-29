package hashMap;

import java.util.HashMap;
import java.util.Iterator;

public class BasicOfhM {

	public static void main(String[] args) {
		HashMap<String,String> capitalmap = new HashMap<String,String>();

		//to tstore data
			capitalmap.put("India", "New Delhi");
			capitalmap.put("UK", "London");
			capitalmap.put("USA", "Washington");
			capitalmap.put(null, "Berlin");
			capitalmap.put("UP", null);
			capitalmap.put("Bengal", null);
			//to fetch value from hashmap we need to use KEY
			System.out.println(capitalmap.get("India"));
			System.out.println(capitalmap.get("UK"));
			System.out.println(capitalmap.get(null));
			System.out.println(capitalmap.get("UP"));
			
//			to traverse we will Use itrator on key
			Iterator<String> it=	capitalmap.keySet().iterator();
			while(it.hasNext()) {
				String key = it.next();
				String value = capitalmap.get(key);
				
				System.out.println("Key = "+key+" Value ="+value);
	}

}
}
