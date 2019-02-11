package stringProgram;

//Write a java program to compare two strings lexicographically, ignoring case differences.

public class compareStringInLexicographically_ignoreCases {

	public static void main(String[] args) {

		String a = "This is world";
		String b = "This is World";

		int result = a.compareToIgnoreCase(b);
		
		if(result < 0) {
			System.out.println("a<b");
		}
		else if(result==0) {
			System.out.println("a=b");
		}
		else {
			System.out.println("a>b");
		}

	}

}
