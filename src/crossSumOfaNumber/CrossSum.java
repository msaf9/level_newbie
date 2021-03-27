package crossSumOfaNumber;

import java.util.Scanner;

public class CrossSum {

	public static void main(String[] args) {

		int sum = 0;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter your number: ");
			sum(sum, sc);
		} catch (Exception e) {
			System.out.println("Error -> " + e);
		}
		sc.close();
	}

	private static void sum(int sum, Scanner sc) throws Exception {
		int number;
		int remainder;
		number = sc.nextInt();
		if (number < 0) {
			throw new Exception("Input number is less than zero!");
		} else {
			while (number > 0) {
				remainder = number % 10;
				sum += remainder;
				number /= 10;
			}
			System.out.println("Cross sum of a number: " + sum);
		}
	}

}
