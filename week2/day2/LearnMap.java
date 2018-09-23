package week2.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LearnMap {

	public static void main(String[] args) {

		Map<String, Integer> mobile = new HashMap<String, Integer>();
		mobile.put("Samsung", 5000);
		mobile.put("Apple", 6000);
		mobile.put("Redmi", 2000);
		mobile.put("Oppo", 6000);
		mobile.put("Apple", 8000);
		//System.out.println(mobile.keySet());
		//System.out.println(mobile.values());
		//System.out.println(mobile.get("Redmi"));  
		//System.out.println(mobile.containsKey("oppo"));
		//System.out.println(mobile.size()); 
		System.out.println(mobile.entrySet());
		/*for (Entry<String, Integer> eachMobile : mobile.entrySet()) {
		System.out.println(eachMobile.getKey()+"-->"+eachMobile.getValue());
	}*/
		Set<String> keyList = mobile.keySet();
		for (String eachKey : keyList) {
			System.out.println(eachKey+"-->"+mobile.get(eachKey));
		}
	}

}




