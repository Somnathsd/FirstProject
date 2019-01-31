package com.som.example;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		String strRev ="";
		for(int i=str.length()-1;i>=0;i--) {
			strRev = strRev + str.charAt(i);
		}
		System.out.println("Original: "+str);
		System.out.println("Reverse: "+strRev);
		   
		if (str.equals(strRev))
		         System.out.println("Palindrome.");
		else
		         System.out.println("Not palindrome.");
	}

}
