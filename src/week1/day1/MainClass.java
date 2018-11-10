package week1.day1;

public class MainClass {

	public static void main(String[] args) {
		System.out.println(" Welcome to java ");
		//ClassName refName = new ClassName();
		MobilePhone mp = new MobilePhone();
		//refName.functionName()/refName.variableName;
		mp.makeACall();
		mp.addContact("Gayatri", 1234567890l); 
		//System.out.println(mp.deleteContact("gayatri"));
		String msg = mp.deleteContact("sarath");
		System.out.println(msg);


	}  

}
