package week2.day1;

public class Bicycle {
	
	public void applyBrake() {
		
	}
	public void changeGear() {
		
	}
	public int getPrice() {
		return 10000;
	}
	public String getColor() {
		return "black";
	}
	public String getColor(String whose) {
		if(whose.equalsIgnoreCase("son")) {
			return "blue";
		}else if(whose.equalsIgnoreCase("daughter")) {
			return "pink";
		}else {
			return "red";
		}
	}
	public String getColor(int whose) {
		return "green";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}



