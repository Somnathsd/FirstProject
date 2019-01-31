package com.som.example;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		int temp = num;
		int rem,sum=0 ;
		
		while(num !=0) {
			rem = num%10;
			sum = sum + rem*rem*rem;
			num=num/10;
		}
		if(temp == sum) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		}

	}

}
