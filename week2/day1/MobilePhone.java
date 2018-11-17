package week2.day1;

public class MobilePhone 
implements ThirdGenCalculator,ThirdGenRadio {

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

	@Override
	public void turnCamera() {
		// TODO Auto-generated method stub

	}

	@Override
	public void turnWifi() {
		// TODO Auto-generated method stub

	}

	@Override
	public void recVoice() {
		// TODO Auto-generated method stub

	}

	@Override
	public void touchScreen() {
		// TODO Auto-generated method stub

	}

	@Override
	public void enableSatRadio() {
		// TODO Auto-generated method stub
	}







}

