package week2.day2;

public class Employee {

	int salary;
	String empName ;
	public double getSalary() {
		return 10000;
	}
	
	public Employee() {
		this(6);
		System.out.println("no argument");
	}
	public Employee(int num) {
		this("TESTLEAF");
		System.out.println("one int argument");
	}
	public Employee(String name) {
		System.out.println("one string argument");
	}
	
	
	//public Employee() {}  
	/*public Employee() {
		salary = 1000;
		empName = "TL";
		System.out.println("New Employee");  
	}*/
	public static void main(String[] args) {
		Employee emp = new Employee();
		//new Employee("TL");  
		/*//int empSalary =5000;
		Employee emp  = new Employee();
		System.out.println(emp.getSalary());
		//System.out.println(empSalary);
		System.out.println(emp.empName);*/  
	}
}











