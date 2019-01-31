package arrayProgram;

public class duplicateString {

//	Write a Java program to find the duplicate values of an array of string values

	public static void main(String[] args) {

		String[] arr = { "ABC", "DEF", "GHI", "JKL", "JKL", "GHI" };

		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i + 1; j < arr.length; j++) {
				
				if (arr[i].equals(arr[j])) {
					
					System.out.println("Duplicate Value: " + arr[i]);
			
				}
			}
		}
	}

}
