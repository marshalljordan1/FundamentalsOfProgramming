import java.util.Scanner;

public class M7_2_7 {

	public static void main(String[] args) {
		Scanner year = new Scanner(System.in);
		int y;
		boolean isLeap = true;
		
		System.out.println("Enter a year (YYYY):");
		y = year.nextInt();
		
		isLeap = isLeap(y);
		
		if (isLeap == true) {
			System.out.println(y+" is a leap year!");
		} else {
			System.out.println(y+" is NOT a leap year!");
		}
		year.close();
	}

	private static boolean isLeap(int y) {
		
		boolean isLeap = true;
		
		if (y % 400 == 0 || y % 4 == 0 && y % 100 != 0) {
			isLeap = true;
		} else {
			isLeap = false;
		}
		return isLeap;
	}

}
