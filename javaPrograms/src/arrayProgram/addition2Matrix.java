package arrayProgram;

//Write a Java program to add two matrices of the same size
import java.util.Arrays;

public class addition2Matrix {

	public static void main(String[] args) {

		int[][] a = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };

		int[][] b = { { 2, 1, 1 }, { 1, 2, 1 }, { 1, 1, 2 } };

		if (a.length == b.length) {

			int[][] c = new int[a.length][a.length];

			for (int i = 0; i < a.length; i++) {

				for (int j = 0; j < a.length; j++) {

					c[i][j] = a[i][j] + b[i][j];

				}
			}

			for (int i = 0; i < a.length; i++) {

				System.out.println();

				for (int j = 0; j < a.length; j++) {

					System.out.print(c[i][j]);

				}

			}
		} else {
			System.out.println("Matrix size is not same to sum up the values.");
		}

	}

}
