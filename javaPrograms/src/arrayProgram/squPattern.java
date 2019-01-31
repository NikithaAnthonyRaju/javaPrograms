package arrayProgram;

//Square pattern:

public class squPattern {
	public static void main(String[] args) {
		int count = 10;
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count; j++) {
				System.out.print("-");
			}
			System.out.println();
		}
	}
}