import java.util.Scanner;

public class M7_3_2 {

	public static void main(String[] args) {
		Scanner string = new Scanner(System.in);
		System.out.println("Write a sentence:");
		String reverse = string.nextLine();
		string.close();

		int size = reverse.length();
		for (int i = size - 1; i >= 0; i--) {
			System.out.print(reverse.charAt(i));
		}
	}
}