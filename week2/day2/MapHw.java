package week2.day2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapHw {
	public static void main(String[] args) {
		
		Map<String, Integer> mobile = new HashMap<String, Integer>();
		mobile.put("Samsung", 50000);
		mobile.put("sony", 50000);
		mobile.put("Apple", 6000);
		mobile.put("Redmi", 2000);
		mobile.put("Oppo", 6000);
		mobile.put("Apple", 8000);
		//Collection<Integer> values = mobile.values();
		//List<Integer> ls = new ArrayList<>();
		int max = 0;
		for (Integer mo : mobile.values()) {
			//ls.add(mo);
			if (mo > max) {
				max = mo;
			}
		}
		System.out.println(max);
		for (Entry<String, Integer> eachMobile : mobile.entrySet()) {
			if(max == eachMobile.getValue()) {
				System.out.println(eachMobile.getKey()+
						"-->"+eachMobile.getValue());
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
