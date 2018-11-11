package week1.day2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LearnRegex {

	public static void main(String[] args) {
      String text = "ABCGF1224M"; 
      String pattern = "[A-Z]{5}[0-9]{4}[A-Z]";
      Pattern p  = Pattern.compile(pattern);
      Matcher m = p.matcher(text);
      System.out.println(m.matches());  
	}

}








