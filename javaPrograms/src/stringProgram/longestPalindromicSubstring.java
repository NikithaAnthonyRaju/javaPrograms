package stringProgram;

//Write a Java program to find longest Palindromic Substring within a string.

public class longestPalindromicSubstring {

	public static void main(String[] args) {

		String original = "thequickbrownfoxxofnworbquickthe";
		String reverse = "";

		char[] charArray = original.toCharArray();
		int i, num;
		int j = 0;
		int palidromeLength = 0;

		for (i = 0; i < charArray.length / 2; i++) {

			j = charArray.length - 1 - i;
			num = 0;

			while (charArray[i + num] == charArray[j - num] && num < charArray.length / 2) {

				num++;

			}
			
			if(palidromeLength<num) {
				
				palidromeLength = num;
				
			}

		}

		String substring = original.substring(i, j);
		char[] charArray2 = substring.toCharArray();

		for (int k = charArray2.length - 1; k >= 0; k--) {
			reverse = reverse + charArray2[k];
		}

		System.out.println(original + "\n" + substring + "\n" + reverse);

		if (original.equals(reverse)) {
			System.out.println("Original is equal to reverse.");
		}

	}

}
