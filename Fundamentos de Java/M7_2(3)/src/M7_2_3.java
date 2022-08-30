import java.util.Scanner;

public class M7_2_3 {

	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);

        System.out.println("How many lines do you want me to print?");
        int lines = data.nextByte();
        
       printLinesAscending(lines);
       printLinesDescending(lines);
       data.close();
	}

        private static void printLinesAscending(int lines) {
        	final char star = '*';
        	for(int i = 0; i <= lines; i++) {
        		for(int j = 0; j < i; j++) {
    			System.out.print(star);
        	}
        		System.out.println();
        	}
		}
        
        private static void printLinesDescending(int lines) {
        	final char star = '*';
   
        	for(int i = lines; i >= 0; i--) {
        		for(int j = 1; j < i; j++) {
    			System.out.print(star);
        	}
        		System.out.println();
        	}
		}
}