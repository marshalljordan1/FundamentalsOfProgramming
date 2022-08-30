import java.util.Scanner;

public class M7_2_2 {

	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);

        System.out.println("How many lines do you want me to print?");
        int lines = data.nextByte();
        
        printLines(lines);
        data.close();
	}

        private static void printLines(int lines) {
        	final char star = '*';
   
        	for(int i = lines; i >= 0; i--) {
        		for(int j = 0; j < i; j++) {
    			System.out.print(star);
        	}
        		System.out.println();
        	}
		}
}