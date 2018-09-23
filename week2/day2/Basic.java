package week2.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Basic {
	public static void main(String[] args) {
		/*		String name = "koushik";
		String[] names = new String[2];
		names[0] = "koushik";
		names[1] = "gayathri";
		System.out.println(names.length);
		names[2] = "sarath";*/
		/*Basic run  = new Basic();
		run.learnList();
		 */
		learnList();

	}
	public static void learnList() {
		//List<Integer> ls = new ArrayList<>();
		List<String> mobiles = new ArrayList<>();
		mobiles.add("samsung");
		mobiles.add("apple");
		mobiles.add("lenovo");
		mobiles.add("redmi");
		mobiles.add(1,"apple");
		Set<String> set = new LinkedHashSet<>();
		set.addAll(mobiles);
		System.out.println(set);
		System.out.println("-----------");
		
		
		
		
		
		
		
		System.out.println(mobiles.size());
		//mobiles.remove("apple");
		System.out.println(mobiles.size());

		//mobiles.size();
		System.out.println(mobiles.size());
		String mb = mobiles.get(1);
		//	System.out.println(mb);
		//mobiles.add("at");
		for (String eachMob : mobiles) {
			if(eachMob.startsWith("a") 
					|| eachMob.startsWith("s")) {
				System.out.println(eachMob);
			}
		}
		boolean contains = mobiles.contains("Apple");
		System.out.println(contains);
		Collections.sort(mobiles);
		System.out.println(mobiles);
		Collections.reverse(mobiles);
		
		
		mobiles.clear();
		System.out.println(mobiles.isEmpty());
		
	}












}
