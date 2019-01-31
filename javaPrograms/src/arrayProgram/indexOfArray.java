package arrayProgram;

// To find an index of an array:

public class indexOfArray {
	public static void main(String[] args) {
		int value = 3;
		int arr[] = { 1, 2, 3, 4 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				System.out.println("Index of value '" + value + "' is " + i);
				break;
			}
		}

		String word = "A";
		String arr1[] = { "A", "B", "C" };

		for (int i = 0; i < arr1.length; i++) {
			if (word == arr1[i]) {
				System.out.println("Index of word '" + word + "' is " + i);
				break;
			}
		}
	}
}