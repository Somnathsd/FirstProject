package com.som.example;

import java.util.Scanner;

public class StringNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String strNew = "";

		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			if(Character.isAlphabetic(str.charAt(i))) {
				count = 1;
			}
//			if(Character.(str.charAt(i))) {
			else {
				count = 0;
			}
			if (count == 1) {
				strNew = strNew + String.valueOf(str.charAt(i));
			}
	}
		System.out.println("Alphabets present in the string are \n" + strNew);
		
	}
}
