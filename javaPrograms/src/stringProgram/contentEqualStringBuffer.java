package stringProgram;

//Write a Java program to compare a given string to the specified string buffer.

public class contentEqualStringBuffer {

	public static void main(String[] args) {

		String original = "Java Program and exercises.";
		String original1 = "exceed.com";
		StringBuffer ori = new StringBuffer(original1);


		System.out.println("First: " + original.contentEquals( new StringBuffer("Java Program and exercises.")));
		System.out.println("Second: " + original.contentEquals(ori));
	
	}

	
}
