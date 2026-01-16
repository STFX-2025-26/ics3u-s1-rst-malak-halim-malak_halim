package malakJavaCode;

import java.util.Scanner;

public class CalculatorOperations {

	public static void main(String[] args) {
		
		//variables
		Scanner input = new Scanner(System.in);
		double num1;
		double num2;
		int choice;
		int result=0;
		
		System.out.print("Enter first number: ");
	    num1 = input.nextDouble();
	    System.out.print("Enter second number: ");
	    num2 = input.nextDouble();
	    System.out.println("1 - Addition");
	    System.out.println("2 - Subtraction");
	    System.out.println("3 - Multiplication");
	    System.out.println("4 - Division");
	    System.out.print("Choose an option: ");
	    choice = input.nextInt();
	    if (choice == 1) {
	        result = (int)(num1 + num2);
	       } else if (choice == 2) {
	           result = (int)(num1 - num2);
	       } else if (choice == 3) {
	           result = (int)(num1 * num2);
	       } else if (choice == 4) {
	          if (num2 == 0) {
	              System.out.println("Error.");
	              input.close();
	              return;
	           }
	           result = (int)(num1 / num2);
	       } else {
	          System.out.println("Invalid choice.");
	          input.close();
	          return;
	       }
	       System.out.println("Result: " + result);
	       input.close();

		
		
		
		
		
		

	}

}
