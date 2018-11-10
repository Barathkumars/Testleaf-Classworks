package week1.day1;

public class MobilePhone {

	//companyName, Model , Spec , Color , price
	//call , browsering , capture , recording
	
	//dataType VariableName
	String companyName;
	int model;
	float price;
	
	//accessModifier returnType functionName(args){} 
	public void makeACall() {
		System.out.println("Calling");
	}
	
	public void addContact(String username, long moblieNumber) {
		System.out.println("name: "+username+" mobileNumber: "
	+moblieNumber +" successfully added"); 
	}
	
	public String deleteContact(String name) {
		return name+" deleted successfully";
	}
	
	
	
	
	
	
	
	
}














