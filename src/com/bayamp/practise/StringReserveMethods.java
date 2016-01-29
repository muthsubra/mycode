package com.bayamp.practise;

import java.util.Scanner;

public class StringReserveMethods {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String word = new String("Learning Java");
		System.out.println("Return output:");
		System.out.println(word.toCharArray());*/
		
		String original, rverse = "";
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter String");
		original = in.nextLine();
		
		int length = original.length();
		for(int i = length-1; i >=0; i--);
		rverse = rverse + original.charAt(i);
		
		System.out.println("Reverse String is:"+rverse);
	
	}
//Using StringBuffer
	
	/*public static void main1(String[] args){
	StringBuffer a = new StringBuffer("Java Code is fun");
	System.out.println(a.reverse());
	}*/
}


//String myString = new String("Bayamp");
System.out.println("the company:");
String newSring = myString


