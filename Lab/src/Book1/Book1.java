package Book1;

import java.util.Scanner;

import Book2.Book2; // My Miss

public class Book1 extends Book2 {   // using Book2 methods in Book1
	
public String s1(String name, int options) {               // First method with 2 args 
	
	System.out.println("*****  Your In Computer related Section List of Books & Authors ********* \\\"\"");
	System.out.println("1:Clean Code -Robert C. Martin");
	System.out.println("2:Design Patterns -Erich Gamma");
	
	System.out.println();
	
	Scanner kj = new Scanner(System.in);                         // User inputs
	
	System.out.print("Enter Your Book No To Read :");
	int a = kj.nextInt();
		
		if("Sec A".equals(name)) {                // checking with user input if Sec A switch will be executed         
			
			switch(a) {
			
			case 1:
				System.out.println();
				return "*********  Welcome to Clean Code Writen by RObert C. Martin   ************ ";
			case 2:
				System.out.println();
				return " ************ Welcome Design Patterns Writen by Erich Gamma *********** ";
				
				default:
					return "No Books available Limites";	
			
			}
			
		}
		else
		{
			return "Invalid Section";
			
		}
			
	}

	
	public static void main(String[] args) {
		
		

	}
}
