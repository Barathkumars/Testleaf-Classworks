package week2.day2;

public class GetCharCount {

	public static void main(String[] args) {
		String companyName = "hexaware";
		char c = 'h';
		int i =0;
		char[] charArray = companyName.toCharArray();
		for (char d : charArray) {
			if (d == c) {
				i++;
			}
		}
		System.out.println(i);
	}

}
