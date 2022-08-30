import java.util.Scanner;

public class M5_4 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("I'm thinking of a number between 1 and 10.");
        System.out.println("Can you guess it?");
        String playagain = new String();
        do {
        	int tries = 0;
            int max = 5;
            byte random = (byte) Math.ceil((Math.random() * 10));
            int guess = -1;

            while (guess != random && tries != max) {
            	System.out.println("\nPick a number: ");
            	tries += 1;
                guess = sc.nextInt();
                
                if (guess < 1 || guess > 10) {
                	System.out.println("Number needs to be between 1 and 10!");
                }
            	/*if (guess != random && guess >= 1 && guess <= 10) {
                    System.out.println("\nWrong");*/
                  if (guess < random) {
                	  System.out.println("\nNumber too low, try again.");
                } if (guess > random) {
                  	  System.out.println("\nNumber too high, try again.");
                } if (guess == random) {
                    System.out.println("Good guess! The number was " + random + ". You guessed it in "+tries+" tries.");
                } if (tries == max) {
                	System.out.println("You have used up all your attempts, the number was "+random+"");
                }
            }
            
            System.out.println("\nWould you like to play again (yes/no)?");
            tries = 0;
            sc.nextLine();
            playagain = sc.nextLine();
        } while (playagain.equals("yes"));
        	if (playagain.equals("no")) 
        	System.out.println("\nGood game!");
        sc.close();
	}
}