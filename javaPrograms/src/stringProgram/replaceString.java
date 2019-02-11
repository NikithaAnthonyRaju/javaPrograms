package stringProgram;

//Write a Java program to replace all the 'd' characters with 'f' characters.

public class replaceString {

	public static void main(String[] args) {

		String word = "The quick brown fox jumps over the lazy dog.";
		String word1 = "The quick brown fox jumps over the lazy dog.";
		System.out.println("Original String - " + word);
		System.out.println("Replacement of a Char- " + word.replace("d", "f"));
		System.out.println("Original String - " + word1);
		System.out.println("Replacement of word - " + word1.replaceAll("fox", "cat"));

	}

}
