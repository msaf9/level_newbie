package primeNumberChecker;

import java.util.Scanner;

public class PrimeNumberMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number;

		System.out.println("Please enter a number to check whether it is a prime number or not: ");
		number = sc.nextInt();

		try {
			if (number > 0) {
				
			} else {
				System.out.println(number +" is not a Prime number!");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
