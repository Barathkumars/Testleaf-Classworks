package week1.day1;
import java.util.Scanner;
public class LearnIf {

	public static void main(String[] args) {
		/*int num1 = 10;
     int num2 = 3;*/
		//scanner class object creation
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter input");
		int num1 = sc.nextInt();
		//int num2 = sc.nextInt();
		/*if(condition) {
    	 true statement;
     } else {
    	 false statement;
     }*/
		if(num1>=18 && num1<60) 
			System.out.println("adult");
		else if(num1>=60)
			System.out.println("senior citizen");
		else 
			System.out.println("children");
	} 

}




