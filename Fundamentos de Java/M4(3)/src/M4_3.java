import java.util.Scanner;

public class M4_3 {

	public static void main(String[] args) {

	Scanner data = new Scanner(System.in);
	
	System.out.println("Enter age: ");
	int age = data.nextByte();
	data.nextLine();
	
	System.out.println("Do you have a University degree?: ");
	String degree = data.nextLine();
	degree.toLowerCase();
	char deg = degree.charAt(0);
	
	System.out.println("Are you employed?: ");
	String dole = data.nextLine();
	dole.toLowerCase();
	char job = dole.charAt(0);
	
	if (age >= 18 && deg == 'y' || job == 'n') {
		System.out.println("Congratulations, you have a scholarship!");
	}	else {
		System.out.println("Sorry, you don't have a scholarship.");
	}
	data.close();
	}
}

