import java.util.Scanner;

public class M7_8 {

	public static void main(String[] args) {
	Scanner data = new Scanner(System.in);
	int K = 32;

    System.out.println("Enter temperature in °C: ");
    int temp = data.nextByte();
    data.close();
    
    temp = (temp*9/5) + K;
    System.out.println(""+temp+"°F");
	}

}
