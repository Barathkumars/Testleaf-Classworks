package week1.day2;

public class ToUpper {

	public static void display() {
   	 System.out.println("welcome".toUpperCase());  
    }
	
	
	public static void main(String[] args) {
		/*int c ='a';
		c= c-32;
		System.out.println((char)c);*/  
		System.out.println((char) 72);  
		String text = "Welcome";
		for (int i = 0; i < text.length(); i++) {
		 if(i%2!=0)  
		System.out.print((char)(text.charAt(i)-32)); 
		 else
		System.out.print(text.charAt(i)); 
		//System.out.println(text.toUpperCase());
	}
}
	
}





