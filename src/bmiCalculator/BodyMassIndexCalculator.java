package bmiCalculator;

import java.util.Scanner;

public class BodyMassIndexCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		float weight, height, bmi;

		try {
			System.out.print("Enter your weight in Kilograms only: ");
			weight = sc.nextFloat();

			System.out.print("Enter your height in Meters only: ");
			height = sc.nextFloat();

			if (weight != 0 && height != 0) {
				bmi = weight / (height * height);
				System.out.println("Your Body Mass Index is " + bmi + ".");

				if (bmi < 18.5) {
					System.out.println("This is considered underweight!");
				} else if (bmi >= 18.5 || bmi <= 24.9) {
					System.out.println("This is considered normal.");
				} else {
					System.out.println("This is considered overweight!");
				}
			} else if (weight == 0) {
				System.out.println("Your weight cannot be equal to Zero.\nPlease provide valid weight input!");
			} else {
				sc.close();
				throw new ArithmeticException(
						"Your Body Mass Index cannot be Infinity!\nPlease provide non-zero value!");
			}

		} catch (Exception e) {
			System.out.println("Error: " + e);
		}

	}

}
