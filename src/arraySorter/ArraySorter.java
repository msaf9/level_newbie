package arraySorter;

import java.util.Scanner;

public class ArraySorter {

	public static void main(String[] args) {

		int elementCount;
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Enter number of element: ");
			elementCount = sc.nextInt();
			int[] array = new int[elementCount];
			System.out.print("Enter your elements to sort: ");
			int length = arraySorter(sc, array);
			System.out.print("\nAfter sorting: ");
			displayArray(array, length);
		} catch (Exception e) {
			System.out.println("Error -> " + e);
		}
		sc.close();
	}

	private static int arraySorter(Scanner sc, int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		int length = array.length;
		System.out.print("Before sorting: ");
		displayArray(array, length);

		int biggest;
		for (int j = 0; j < array.length; j++) {
			for (int k = j + 1; k < array.length; k++) {
				if (array[j] > array[k]) {
					biggest = array[j];
					array[j] = array[k];
					array[k] = biggest;
				}
			}
		}
		return length;
	}

	private static void displayArray(int[] array, int length) {
		while (length > 0) {
			System.out.print(array[array.length - length] + " ");
			length--;
		}
	}

}
