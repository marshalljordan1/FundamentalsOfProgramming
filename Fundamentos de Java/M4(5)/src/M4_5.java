import java.util.Scanner;

public class M4_5 {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = num.nextInt();
		System.out.println("Enter second number: ");
		int num2 = num.nextInt();
		System.out.println("Choose + - / * : ");
		num.nextLine();
		String sym = num.nextLine();

		switch (sym) {
		case "+":
			System.out.println("The addition of these two numbers is: "+(num1 + num2)+"");
		    break;
		case "-":
			System.out.println("The subtraction of these two numbers is: "+(num1 - num2)+"");
		    break;
		case "*":
			System.out.println("The multiplication of these two numbers is: "+(num1 * num2)+"");
		    break;
		case "/":
			System.out.println("The division of these two numbers is: "+(num1 / num2)+"");
		    break;
		}
		num.close();
	}
}
