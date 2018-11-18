package week2.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class BicycleSet {

	public static void main(String[] args) {
		Set<String> brand = new HashSet<>();
		brand.add("Hercules");
		brand.add("bsa");
		brand.add("firefox");
		System.out.println(brand.size());
		List<String> brandList = new ArrayList<String>();
		brandList.addAll(brand);
		String last = brandList.get(brandList.size()-1);
		System.out.println(last);
	}


}




