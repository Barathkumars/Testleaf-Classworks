package week2.day2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class GetCharCountUsingMap {

	public static void main(String[] args) {
		String companyName = "PayPal India";
		Map<Character, Integer> charMap = 
				new LinkedHashMap<Character, Integer>();
		char[] charArray = companyName.toLowerCase().toCharArray();
		for (char eachCharacter : charArray) {
			if (charMap.containsKey(eachCharacter)) {
				charMap.put(eachCharacter, 
						charMap.get(eachCharacter)+1);
			}else {
				charMap.put(eachCharacter, 1);
			}
		}
		System.out.println(charMap);
	}

}




