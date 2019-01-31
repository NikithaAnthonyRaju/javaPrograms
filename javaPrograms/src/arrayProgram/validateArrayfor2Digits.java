package arrayProgram;

//Write a Java program to check if an array of integers without 0 and -1.

public class validateArrayfor2Digits {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 4, 76, 9, 67, -11, -22, -66, 0, 768, 65, -1 };

		boolean containsOrNot = false;

		for (int a : arr) {
			if (a == 0 || a == -1) {
				containsOrNot = true;
				break;
			} else {
				containsOrNot = false;

			}

		}

		if (containsOrNot) {
			System.out.println("Array contains 0 or -1 value.");

		} else {

			System.out.println("Array doesnot contains 0 or -1 value.");
		}
	}

}
