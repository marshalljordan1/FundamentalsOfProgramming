import java.util.ArrayList;
import java.util.Scanner;

public class M5_1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		String word;
		
		
		System.out.println("enter number of words:");
		int numwords = sc.nextByte();
		sc.nextLine();
		
		for (int i = 0; i < numwords; i++) {
			System.out.println("enter word: "+(i+1)+":");
			word = sc.nextLine();
			list.add(word);
		}
		
		
		System.out.println("**List**"); 
		int size = list.size();
		for (int i = 0; i < size; i++ ) {
			System.out.println(list.get(i));
		sc.close();
		}
	}
}