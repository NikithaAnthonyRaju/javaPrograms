package arrayProgram;

//Write a Java program to check if an array of integers contains two specified elements 65 and 77.

public class validateArrayfor2Specifiedelements {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 4, 76, 9, 67, -11, -22, -66, 0, 768, 65, -1 };
		
		specifiedElements(arr, 65, 77);
	}
	
	static void specifiedElements(int[] arr, int specifiedEle1, int specifiedEle2) {
		
		boolean containsOrNot = false;

		for (int a : arr) {
			if (a == specifiedEle1 || a == specifiedEle1) {
				containsOrNot = true;
				
			} else {
				containsOrNot = false;
				break;

			}

		}

		if (containsOrNot) {
			System.out.println("Specifed Elements are presnt in an array i.e. " + specifiedEle1 + " or " + specifiedEle2);

		} else {

			System.out.println("Specifed Elements are not presnt in an array i.e. " + specifiedEle1 + " or " + specifiedEle2);
		}
		
	}

}
