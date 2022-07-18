/*Kübra YAYLA
Problem:
A prime number is an integer greater than 1 and divisible by only itself and
1. The first seven prime numbers are 2, 3, 5, 7, 11, 13, and 17. Write a
method that returns true if its parameter is a prime number. Using this
method, write a program that repeatedly asks the user for input and displays
Prime if the input is a prime number and Not Prime, otherwise. Stop the
repetition when the input is a negative number. 

Date:18.07.2022

*/

import java.util.Scanner;

public class isPrimeNumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
	
		int number;
		 
		do {
			System.out.println("please enter a number to check if it is prime");
			 number = s.nextInt();
			System.out.println(isPrime(number)); 
			 
		}while(number>0);
	}
	
	public static boolean isPrime(int number) {
		int counter=0;
		for(int i = 2; i<number; i++) {
		
			if(number%i==0)
				counter++;
				 
		}		
		if(counter==0)
		{
			return true;
		}
		else
			return false;
		
		
	}

}
