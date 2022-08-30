import java.util.Scanner;

public class M4_1 {

	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String name = data.nextLine();
		System.out.println("Enter surname: ");
		String surname = data.nextLine();
		System.out.println("Enter age: ");
		int age = data.nextByte();

		if (age <= 18) {
		System.out.println(name +" "+ surname + " is NOT over 18");
		} else {
			System.out.println(name +" "+ surname + " is over 18");
		}
		data.close();
	}
}
