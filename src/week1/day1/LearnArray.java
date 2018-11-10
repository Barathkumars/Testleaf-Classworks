package week1.day1;

import java.util.Scanner;

public class LearnArray {

	public static void main(String[] args) {
		//int[] empId = {101, 102, 103, 104, 105};
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size = sc.nextInt();
        String[] empName = new String[size];
        for(int i=0; i<size; i++) {
        	empName[i] = sc.next();
        }
        //foreach syntax
       /* for(dataType variableName : sourceData){
          System.out.println(variableName);    
	    }*/
        for(String eachName : empName) {
        	System.out.println(eachName); 
        }
		/*for(int i=0; i<size; i++)
			System.out.println(empName[i]);*/
		sc.close();
	}

}






