import java.util.Scanner;

public class M7_7 {

	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);

        System.out.println("Enter the size of the square: ");
        int size = data.nextInt();

        System.out.println("Enter the character you want to print the square: ");
        String c = data.next();
        data.close();
        printSquare(size, c);
	}
		
        private static void printSquare(int size, String c) {
        	int x;
        	int y;
        	
        	for(x = 0; x < size; x++) {
        		for(y = 0; y < size; y++) {
    			System.out.print(" "+c);
        	}
        		System.out.println();
        	}
        }
}