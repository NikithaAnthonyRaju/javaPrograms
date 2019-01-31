package arrayProgram;

// AverageValue:

public class averageValue {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int sum = 0;
		int num = arr.length;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum = " + sum);
		System.out.println("Num = " + num);
		System.out.println("Average Value = " + sum / num);
	}
}