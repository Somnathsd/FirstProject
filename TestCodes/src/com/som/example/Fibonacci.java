package com.som.example;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int a =0,b=1,c=0;
		System.out.print(a+" "+b+" ");
		
		while(c <= num) {
			c=a+b;
			if(c >= num)
				break;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		
	}

}
