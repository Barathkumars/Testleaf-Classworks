package week2.day1;

import java.util.Scanner;

public class LearnThroes {

	public static void main(String[] args) throws InterruptedException 
	 {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num1 = sc.nextInt();
		if (num1<18) {
			throw new ArithmeticException();
		}
		System.out.println("program completed");
		//Thread.sleep(3000);     
		//System.out.println(10/0);
	}
}






