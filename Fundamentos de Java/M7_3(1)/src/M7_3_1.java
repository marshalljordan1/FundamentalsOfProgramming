import java.util.Scanner;

public class M7_3_1 {
	static Scanner entry = new Scanner(System.in);

	public static void main(String[] args) {
		boolean exit = false;

		do {
			switch (menu()) {
			case 1:
				square();
				break;
			case 2:
				triangle();
				break;
			case 3:
				rectangle();
				break;
			case 4:
				circle();
				break;
			case 0:
				System.out.println("Thank you for using the application.");
				exit = true;
				break;
			}
		} while (!exit);
	}

	public static byte menu() {
		byte option;
		final byte MIN = 0;
		final byte MAX = 4;

		do {
			System.out.println("\nMain menu");
			System.out.println("1. Square.");
			System.out.println("2. Triangle.");
			System.out.println("3. Rectangle.");
			System.out.println("4. Circle.\n");
			System.out.println("0. Exit application.\n");
			option = entry.nextByte();
			if (option < MIN || option > MAX) {
				System.out.println("Choose a valid option");
			}
		} while (option < MIN || option > MAX);
		return option;
	}

	public static void square() {
		System.out.println("What length is each side?");
		float num = (entry.nextFloat() * 4);
		System.out.println("The area of the square is: " + num);
	}

	public static void triangle() {
		System.out.println("What length of the base?");
		float num1 = entry.nextFloat();
		System.out.println("What is the height?");
		float num2 = entry.nextFloat();
		System.out.println("The area of the triangle is: " + (num1 * num2) / 2);
	}

	public static void rectangle() {
		System.out.println("What length is side 1?");
		float num1 = entry.nextFloat();
		System.out.println("What length is side 2?");
		float num2 = entry.nextFloat();
		System.out.println("The area of the rectangle is: " + num1 * num2);
	}

	public static void circle() {
		System.out.println("What is the radius of the circle?");
		float num = entry.nextFloat();
		System.out.println("The area of the square is: " + num * Math.PI);
	}

	public static void exit() {
		System.out.println("Exit");
	}

}
