package assignment1;

import java.util.Scanner;

public class EvenOrodd {
     
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
		if(n%2==0)
		{
			System.out.println("It is Even");
		}
		else
		{
			System.out.println("it is odd");
		}

	}

}
