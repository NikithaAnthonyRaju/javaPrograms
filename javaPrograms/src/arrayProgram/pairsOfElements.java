package arrayProgram;
//Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number.
public class pairsOfElements {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int sum = 5;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum) {
					System.out.println(arr[i] + "+" + arr[j] + "=" + sum);
				}
			}
		}

	}

}
