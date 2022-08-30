import java.util.Scanner;

public class M3_1 {

	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String name = data.nextLine();
		System.out.println("Enter surname: ");
		String surname = data.nextLine();
		System.out.println("Enter age: ");
		String age = data.nextLine();

		System.out.println("First name: "+name);
		System.out.println("Surname: "+surname);
		System.out.println("Age: "+age);
		data.close();
	}
}