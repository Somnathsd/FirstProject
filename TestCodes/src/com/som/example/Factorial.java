package com.som.example;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int fact = 1;
		if(num < 1) {
			System.out.println("Enter number greater than 1");
		}
		else if(num >1) {
		while(num != 0) {
			fact= fact*num;
			num--;
		}
		System.out.println("Factorial :"+fact);
	}}

}
