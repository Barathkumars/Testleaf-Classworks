package week2.day2;

public class Outer {
	public void walk() {
		System.out.println("Outer walk");

	}

	
	public class Inner{
		public void run() {
			System.out.println("Inner run");
		}
	}
}
