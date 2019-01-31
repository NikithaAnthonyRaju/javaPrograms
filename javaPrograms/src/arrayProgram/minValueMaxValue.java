package arrayProgram;

//Write a Java program to find the maximum and minimum value of an array.

public class minValueMaxValue {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 887, 8, 9, 0, 88,22 };
		System.out.println(maxValue(arr));
		System.out.println(minValue(arr));

	}

	public static int maxValue(int[] arr) {

		int maxValue = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > maxValue) {
				maxValue = arr[i];
			}
		}

		return maxValue;

	}

	public static int minValue(int[] arr) {

		int minValue = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < minValue) {
				minValue = arr[i];
			}
		}

		return minValue;

	}

}
