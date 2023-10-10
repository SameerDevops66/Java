package Book2;

import java.util.Scanner;

import Diplay.DisplayItems;

public class Book2 extends DisplayItems  { // using Display methods in Book2 
	
public String s2(String name1, int choice) {
	
	System.out.println("*****  Your In Laws related Section List of Books & Authors ********* ");
	System.out.println();
	System.out.println("1: To Kill a Mockingbird --by Harper Lee");
	System.out.println("2: The Interpretation of Dreams  --by Sigmund Freud");
	System.out.println();
    Scanner kj2 = new Scanner(System.in);
	
	System.out.print("Enter Your Book No To Read :");
	int a = kj2.nextInt();
		
		if("Sec B".equals(name1)) {
			
			switch(a){
			
			case 1:
				return ("*****  Welcome to To Kill a Mockingbird writen by Harper Lee ******  ");
				
			case 2:
				return ("*********** Welcome to The INTERPRETATION OF DREAMS writen By SIGMUND FREUD ***** ");
				
				default:
					return("Invalid Book NUmber.");
			
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
