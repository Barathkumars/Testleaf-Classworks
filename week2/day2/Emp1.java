package week2.day2;

public class Emp1 {

	int salary = 10000;
	public void getSalary() {
		int salary= 1000;
		System.out.println(this.salary);   
	}
	public static void main(String[] args) {
		//System.out.println(this.salary);
		Emp1 e =new Emp1();
		e.getSalary();
				
	}
}



