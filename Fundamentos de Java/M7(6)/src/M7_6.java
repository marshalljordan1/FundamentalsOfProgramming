import java.util.Scanner;

public class M7_6 {

	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		
		final int MAX = 10;
		final int MIN = 0;
		byte num;
		
		do {
			System.out.println("Enter a number between 1 and 10: ");
			num = data.nextByte();
			data.close();
		} while (num < MIN || num > MAX);
		
				for(int i = MIN; i<=MAX; i++) {
					System.out.println(i + " x "+num+" = "+i*num);
		} 
	}

}
