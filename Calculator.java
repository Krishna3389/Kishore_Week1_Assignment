package assignment1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Select an option");
		System.out.println("1. Addition +");
		System.out.println("2. Subtraction - ");
		System.out.println("3. Multiplication  *");
		System.out.println("4. Addition  /");
		
		int option=scan.nextInt();
		System.out.println("Enter the First number");
		 double n1=scan.nextDouble();
		 System.out.println("Enter the Second Number");
		 double n2=scan.nextDouble();
		   double result;
		 switch(option) {
		  case 1:
              result = n1 + n2;
              System.out.println("Result: " + result);
              break;
          case 2:
              result = n1 - n2;
              System.out.println("Result: " + result);
              break;
          case 3:
              result = n1 * n2;
              System.out.println("Result: " + result);
              break;
          case 4:
              if (n2 != 0) {
                  result = n1 / n2;
                  System.out.println("Result: " + result);
              } else {
                  System.out.println("Error! Division by zero is not allowed.");
              }
              break;
          default:
              System.out.println("Invalid choice. Please select a valid operation.");
              break;
      }

      scan.close();
	}
}
