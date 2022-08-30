import java.util.ArrayList;
import java.util.Scanner;

public class M7_3_4 {

	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		System.out.println("Enter a number:");
		String num = data.nextLine();
		
		num = (num % 23);
			System.out.println(num);
			
			ArrayList<String> dni = new ArrayList<String>();
			dni.add("T");
			dni.add("R");
			dni.add("W");
			dni.add("A");
			dni.add("G");
			dni.add("M");
			dni.add("Y");
			
	}

}
