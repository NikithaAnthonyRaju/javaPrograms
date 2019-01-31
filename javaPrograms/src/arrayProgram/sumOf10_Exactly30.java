package arrayProgram;

//Write a Java program to check if the sum of all the 10's in the array is exactly 30. Return false if the condition does not satisfy, otherwise true.

public class sumOf10_Exactly30 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 10, 20, 10, 10, 10 };

		System.out.println("Validation to check the sum is eaual to 30 = " + sumOf10IsEqualTo30(arr));

	}

	static boolean sumOf10IsEqualTo30(int arr[]) {

		int sum = 0;
		for (int a : arr) {
			if (a == 10) {
				sum += a;
			}
		}
		if (sum == 30) {
			return true;
		} else {
			return false;
		}
	}

}
