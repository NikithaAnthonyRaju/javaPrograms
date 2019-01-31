package arrayProgram;

//Write a Java program to find the common elements between two arrays (Integer values).

public class commonElementsWitin2Arrays_Integer {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int[] arr1 = { 2, 4, 6, 8, 10, 12 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (arr[i] == arr1[j]) {
					System.out.println("Common Element b/w 2 Arrays: " + arr1[j]);
				}
			}
		}

	}

}
