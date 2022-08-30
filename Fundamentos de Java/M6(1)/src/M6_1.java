import java.util.Scanner;

public class M6_1 {
	public static int add(int num1, int num2) {
		int add = num1 + num2;
		return add;
	}

	public static void subtract(int num1, int num2) {
		System.out.println("The subtraction of these two numbers is: " + (num1 - num2) + "");
	}

	public static float divide(float num1, float num2) {
		float divide = (float) num1 / num2;
		return divide;
	}

	public static void multiply(int num1, int num2) {
		System.out.println("The multiplication of these two numbers is: " + (num1 * num2) + "");
	}

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int result;
		float result2;
		System.out.println("Enter first number: ");
		int num1 = num.nextInt();
		System.out.println("Enter second number: ");
		int num2 = num.nextInt();
		System.out.println("Choose + - / * : ");
		num.nextLine();
		String sym = num.nextLine();
		num.close();

		switch (sym) {
		case "+":
			result = add(num1, num2);
			System.out.println("The addition of these two numbers is: " + result + "");
			break;
		case "-":
			subtract(num1, num2);
			break;
		case "/":
			result2 = divide(num1, num2);
			System.out.println("The division of these two numbers is: " + result2 + "");
			break;
		case "*":
			multiply(num1, num2);
			break;
		}

	}
}