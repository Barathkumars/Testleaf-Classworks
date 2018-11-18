package week2.day2;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class BicycleStore {

	public static void main(String[] args) {
		// TreeMap , HashMap, LinkedHashMap
		Map<String, Integer> cycles =
				new  TreeMap<String, Integer>();
		cycles.put("hercules", 10);
		cycles.put("bsa", 5);
		cycles.put("firefox", 5);
		System.out.println(cycles.size());
		boolean containsKey = cycles.containsKey("Firefox");
		System.out.println(containsKey);
		Integer value = cycles.get("firefox");
		System.out.println(value);
		cycles.remove("bsa");
		System.out.println(cycles.size());
		/*for (Entry<String, Integer> cycleInfo : cycles.entrySet()) {
			String key = cycleInfo.getKey();
			Integer value = cycleInfo.getValue();
			System.out.println("key "+key+" value "+value);
		}*/
	}

}











