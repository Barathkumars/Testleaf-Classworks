package week2.day2;

public class SubClass extends BaseClass{

	final int number = 10;
	@Override
	public void display() {
		//super.display();
		//int i = super.num;
		//number = 20;
		//super(5);
		System.out.println("SubClass display");
	}
	public static void main(String[] args) {
		SubClass ac = new SubClass();
		ac.display();
	}
}
