package com.som.example;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i = 10;i<=50;i++) {
			if(isPrime(i)) {
				count++;
				System.out.println(i+" is prime");
				if(count == 10) {
					System.out.println("Exiting the loop");
					break;
				}
			} 
		}
		
		
	}
	
	public static boolean isPrime(int n) {
		//Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number");
//		int num = sc.nextInt();
		if(n == 1) {
			return false;
		}
		
		
		boolean b = true;
		for(int i=2;i<n;i++) {
			
			if(n%i == 0) {
				b = false;
				break;
			}
		}
		if(b) {
			//count++;
			//System.out.println(n+" is prime");
			return true;
		}else {
			//System.out.println(n+" is not prime");
			return false;
		}
		

	}

}
