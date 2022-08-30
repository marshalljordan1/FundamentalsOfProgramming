import java.util.Scanner;

public class M7_5_range_even {

	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		int num1, num2;
		int i;
		boolean check;
		
		System.out.println("Enter first number: ");
		num1 = data.nextInt();
		System.out.println("Enter second number: ");
		num2 = data.nextInt();
		data.close();
		
		if (num1 > num2) {
			int aux = num1;
			num1 = num2;
			num2 = aux;
		}
		for (i = num1; i <= num2; i++) {
			check = checkEven(i);
			if (check == true) {
			System.out.println(i);
			}
		}
	}
	private static boolean checkEven(int i) {
		boolean check;
		
		if ((i % 2) == 0) {
			check = true;
			} else {
			  check = false;
			}
		return check;
	}

}