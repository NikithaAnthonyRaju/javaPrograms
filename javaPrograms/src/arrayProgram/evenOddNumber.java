package arrayProgram;

//Write a Java program to find the number of even and odd integers in a given array of integers. 

public class evenOddNumber {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 3, 40, 5, 6, 70, 8, 9 };

		int even = 0;
		int odd = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}

		System.out.println("Even Numbers in an array: " + even);
		System.out.println("Odd Numbers in an array: " + odd);

	}

}
