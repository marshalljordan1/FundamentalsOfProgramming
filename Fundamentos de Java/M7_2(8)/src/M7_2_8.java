import java.util.ArrayList;
import java.util.Scanner;

public class M7_2_8 {

	public static void main(String[] args) {
		int num;
		ArrayList<Integer> results = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Enter a positive integer greater than or equal to 1:");
			num = sc.nextInt();
			if (num < 1) {
				System.out.println("The number must be larger or equal to 1!");
				System.out.println("");
			}

		} while (num < 1);

		results = fibonacci(num);
		System.out.println(results);
		sc.close();
	}
	public static ArrayList<Integer> fibonacci(int num) {
		int aux1 = 0, aux2 = 1, i = 0;
		ArrayList<Integer> results = new ArrayList<Integer>();

		while (i < num) {
			results.add(aux1);
			aux1 = aux1 + aux2;
			i = i + 1;
			if (i < num) {
				results.add(aux2);
				aux2 = aux1 + aux2;
				i = i + 1;
			}
		}
		return results;
	}

}