import java.util.Scanner;

public class M7_2_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;

		do {
			System.out.println("Enter a number: ");
			numero = sc.nextInt();
			sc.nextLine();
		} while (!primo(numero));

		System.out.println("Exactly, " + numero + " is a prime number.");
		sc.close();
	}

	static boolean primo(int numero) {
		boolean resultado = true;
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0)
				resultado = false;
		}
		return resultado;
	}
}