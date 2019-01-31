package arrayProgram;

//Write a Java program to find the common elements between two arrays (string values).

public class commonElementsWitin2Arrays {

	public static void main(String[] args) {
		
		String[] arr = {"ABC", "BCD", "CDE"};
		String[] arr1 = {"EFG", "HIJ", "CDE", "ABC"};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr1.length; j++) {
				if(arr[i].equals(arr1[j])) {
					System.out.println("Common Element b/w 2 Arrays: " + arr1[j]);
				}
			}
		}

	}

}
