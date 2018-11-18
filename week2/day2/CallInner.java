package week2.day2;

import week2.day2.Outer.Inner;

public class CallInner {

	public static void main(String[] args) {
		Outer out = new Outer();
		out.walk();
		
		Inner inner = new Outer().new Inner();
		inner.run();

	}

}
