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
			for (int i = 0; i < array.length; i++) {
				array[i] = sc.nextInt();
			}

			int length = array.length;
			System.out.print("Before sorting: ");
			while (length > 0) {
				System.out.print(array[array.length - length] + " ");
				length--;
			}
			
			int biggest = array[0];
			
		} catch (Exception e) {
			System.out.println("Error -> " + e);
		}
		sc.close();
	}

}
