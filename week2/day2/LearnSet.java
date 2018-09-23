package week2.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		// ---- HashSet = Random order
		// ---- TreeSet = ASCII order
		// ---- LinkedHashSet = Insertion order
		Set<String> mobiles = new LinkedHashSet<>();
		mobiles.add("samsung");
		mobiles.add("apple");
		mobiles.add("lenovo");
		mobiles.add("redmi");
		mobiles.add("apple");
		List<String> ls = new ArrayList<>();
		ls.addAll(mobiles);
		ls.get(1);
		
		System.out.println(mobiles.size());
		/*for (int i = 0; i < mobiles.size(); i++) {
			// not possible
		}*/
		for (String eachMob : mobiles) {
			System.out.println(eachMob);
		}
		
	}
	
	
	
	
	

}






