package primeNumberChecker;

import java.util.Scanner;

public class PrimeNumberMain {

	public static void main(String[] args) {

//		Scanner object initialized
		Scanner sc = new Scanner(System.in);

//		variables initialized
		int number, i = 0;
		boolean primeFlag = false;

//		Logic to check primeFlag
		try {
//			Taking number input from user
			System.out.print("Please enter a number to check whether it is a prime number or not: ");
			number = sc.nextInt();

			if (number > 0) {
				if (number == 1) {
					primeFlag = true;
				} else {
					for (i = 2; i <= number / 2; ++i) {
						if (number % i == 0) {
							primeFlag = true;
							break;
						}
					}
				}
			} else {
				if (number == 0) {
					primeFlag = true;
					System.out.println("Your input is Zero!\nPlease provide non-zero number only.");
				} else {
					primeFlag = true;
					System.out.println(
							"Your input " + number + " is a negative number!\nPlease provide positive number only.");
				}
				System.exit(0);

			}

			/*
			 * Check the primeFlag: primeFlag = false is Prime number primeFlag = true is
			 * non-prime number
			 */
			if (!primeFlag) {
				System.out.println(number + " is a Prime number.");
			} else {
				System.out.println(number + " is not a Prime number!");
			}
		} catch (Exception e) {
//			Exception handling using try catch
			System.out.println("Error: " + e);
		}

		sc.close();
	}

}
