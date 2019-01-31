package com.som.example;

public class SumFirstAndLastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumFirstLastDigit(651));

	}
	
	public static int sumFirstLastDigit(int number) {
		if(number < 10) {
			return -1;
		}
		
		int lastDigit = number %10;
		int firstDigit = number;
		while(firstDigit >= 10) {
			firstDigit /=10;
			
		}
		return firstDigit + lastDigit;
		
	}

}
