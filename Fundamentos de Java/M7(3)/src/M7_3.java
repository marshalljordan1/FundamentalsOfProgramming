import java.util.Scanner;

public class M7_3 {

	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		int num;
		boolean check;
		
		System.out.println("Enter a number: ");
		num = data.nextInt();
		
		check = checkEven(num);
		
		if (check == true) {
			System.out.println("Number is even");
		}
		else {
			System.out.println("Number is odd");
		}
		data.close();
	}

	private static boolean checkEven(int num) {
		Scanner data = new Scanner(System.in);
		boolean check;
		
		if ((num % 2) == 0) {
			check = true;
			} else {
			  check = false;
			}
		data.close();
		return check;
	}
}