package stringProgram;

//Write a java program to compare two strings lexicographically. 

public class compareStringInLexicographically {

	public static void main(String[] args) {

		String a = "This is world";
		String b = "This is world ";
		
		int result = a.compareTo(b);
		
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
