package Lab;

import java.util.Scanner;

import Book1.Book1; // My miss

public class Lab extends Book1 {         //  using all the related books and display methods it's called Multilevel Inheritance
	
	private String SectionA;
	private String SectionB;
	//private String SectionC;
	 
	public Lab(String SectionA, String SectionB) {   // Constructors objects
		
		this.SectionA = SectionA;
		this.SectionB = SectionB;
		//this.SectionC = SectionC;
	}
	
	public static void main(String[] args) {
		
		System.out.println("@@@@----Wellcome to SMART LIBRABY SYSTEM----@@@");
		System.out.println();
		System.out.println("---- List Of Sections Available ----");
		System.out.println();
		
		Lab obj = new Lab("Sec A" , "Sec B");                // Creating the object for a Class
		
		obj.s();
		
		System.out.println();
		
		Scanner obj1 = new Scanner(System.in);                 // Users Inputs
		
		System.out.print("Enter the Section Name : ");
		String n1 = obj1.nextLine();
		System.out.println();
		
        String n2 ="";                                               // Empty string Object for n2.
		
		if ("Sec A".equals(n1)) {			
			n2 = obj.s1(n1,0);                             // n2 to store the values of user input (n1,0) we have to pass two arguments bcz we use 2 argms in methods
		}
			else if ("Sec B".equals(n1)){			
				n2 = obj.s2(n1,2);
			}
			else {
				n2 = "Invalid";
		}
		
		 System.out.println(n2);
	

	}
	
	

}
