package week1.day2;

public class LearnStringBuffer {

	public static void main(String[] args) {
		
       StringBuilder buffer = new StringBuilder("Testleaf");
       String s1= " Chennai";
       //buffer.append(s1);
       buffer.insert(1, 'A');
		/*String s = "Testleaf";
		String s1= " Chennai";
		s =s.concat(s1);*/
		System.out.println(buffer.reverse());
	}

}





