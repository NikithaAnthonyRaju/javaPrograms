package arrayProgram;
//Write a Java program to test the equality of two arrays
public class equalityOf2Arrays {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4 };
		int b[] = { 1, 2, 3, 4 };

		boolean eqaulOrNot = true;

		if (a.length == b.length) {

			for (int i = 0; i < a.length; i++) {

				if (a[i] == b[i]) {

//					System.out.println("Arrays are equal.");
					eqaulOrNot = true;

				} else {

//					System.out.println("Arrays are not equal.");
					eqaulOrNot = false;
				}
			}
		} else {

//			System.out.println("Arrays are not of same length.");
			eqaulOrNot = false;
		}

		if (eqaulOrNot) {
			System.out.println("Arrays are equal.");
		} else {
			System.out.println("Arrays are not equal.");
		}

	}

}
