package com.som.example;

import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) {

		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String strNew = "";

		for (int i = 0; i < str.length(); i++) {
			int count = 0;

			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {

					count++;

				}
			}

			if (count == 1) {
				strNew = strNew + String.valueOf(str.charAt(i));
			}
		}
		System.out.println("Unique characters present in the string are \n" + strNew);
	}
}