package decimalToBinary;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		String binary;
		try {
			System.out.print("Enter your number ");
			number = sc.nextInt();
			binary = Integer.toBinaryString(number);
			System.out.println("Binary format is " + binary);
		} catch (Exception e) {
			System.out.println("Error -> " + e);
		}
		sc.close();
	}

}
