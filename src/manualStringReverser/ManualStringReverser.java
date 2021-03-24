package manualStringReverser;

import java.util.Scanner;

public class ManualStringReverser {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String string;

		try {
			System.out.println("Enter your string to reverse: ");
			string = sc.next();
			char[] reverse = new char[string.length()];

			for (int i = 0; i < string.length(); i++) {
				reverse[i] = string.charAt(string.length() - i - 1);
			}

			System.out.println(reverse);
		} catch (Exception e) {
			System.out.println("Error -> " + e);
		}
		sc.close();
	}

}
