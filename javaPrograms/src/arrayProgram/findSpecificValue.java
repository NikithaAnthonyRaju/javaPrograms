package arrayProgram;

//find an element:

public class findSpecificValue {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		for (int ar : arr) {
			if (ar == 2) {
				System.out.println("Value existed");
				break;
			} else {
				System.out.println("Value does not exist");
			}
		}
	}
}