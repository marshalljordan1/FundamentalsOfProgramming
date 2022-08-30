import java.util.Scanner;

public class M7_3_3 {

	public static void main(String[] args) {
		Scanner string = new Scanner(System.in);
		System.out.println("Write a sentence:");
		String word = string.nextLine();
		String wordNoSpaces = word.replaceAll(" ", "");
		string.close();

		int size = wordNoSpaces.length();
		String reverse = "";
		for (int i = size - 1; i >= 0; i--) {
			reverse += wordNoSpaces.charAt(i);
		}
		if (wordNoSpaces.equalsIgnoreCase(reverse)) {
			System.out.println("the sentence is a palindrome");
		} else {
			System.out.println("the sentence is NOT a palindrome");
		}
	}
}