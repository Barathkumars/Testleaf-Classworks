package week2.day1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LearnExceptions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		try {
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
			System.out.println(num1/num2);
			
		} catch (ArithmeticException e) {
			System.err.println("something went wrong");
		} 
		finally {
			System.out.println("finally always run");
		}
		/*catch (ArithmeticException e) {  
			System.err.println("should not enter zero");
		}
		catch (InputMismatchException e) {
			System.err.println("should not enter charatcer"); 
		}
		catch (Exception e) {
			System.err.println("something went wrong");
		}
*/
	}

}







