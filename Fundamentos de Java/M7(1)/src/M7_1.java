import java.util.Scanner;

public class M7_1 {
	
	public static int average(int sum) {
		int result = 0;
		result = sum / 3;
		return result;
	}

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		int i=0; 
		int sum = 0;
		
		while (i<3) {
			System.out.println("Enter grade "+(i+1)+": ");
			sum += data.nextInt();
			i++;
		}
		if (average(sum) < 5) {
			System.out.println("You haven't passed. You need to repeat the course");
		}
		else if (average(sum) >= 5 && average(sum) <= 7) {
			System.out.println("Congratulations! You've passed but you should keep practising");
		}
		else  {
			System.out.println("Congratulations! You've passed You can go to the next level!");
		}
		data.close();
	}	
}
