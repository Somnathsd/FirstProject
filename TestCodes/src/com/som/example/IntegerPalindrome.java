package com.som.example;

import java.util.Scanner;

public class IntegerPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		int temp = num;
		int rem,rev=0 ;
		
		while(num !=0) {
			rem = num%10;
			rev = rev*10 + rem;
			num=num/10;
		}
		
		System.out.println("Original: "+temp);
		System.out.println("Reverse: "+rev);
		if(temp == rev) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
