package stringProgram;

//Write a Java program to compare a given string to the specified character sequence

public class contentEqualSequenceOfChar {

	public static void main(String[] args) {

		String original = "Java Program and exercises.";
		String ori = "exceed.com";
		
//		CharSequence is an interface.
		CharSequence charOri = "exceed.com";

		System.out.println("First: " + original.contentEquals("and"));
		System.out.println("Second: " + ori.contentEquals(charOri));
	
	}

	
}
