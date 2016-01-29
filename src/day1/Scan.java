package day1;

import java.util.Scanner;

public class Scan {
public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter some number");
	int user_input_number = scan.nextInt();
	
	System.out.println("The entered value is");
	System.out.print(user_input_number);
	
	Scanner scan1 = new Scanner (System.in);
	System.out.println("Enter Decimal vlue");
	double user_input_double = scan1.nextDouble();
		
	System.out.println("The entered value is");
	System.out.print(user_input_double);
	
}
}
