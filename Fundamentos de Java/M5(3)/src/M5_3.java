import java.util.Scanner;

public class M5_3{

     public static void main(String []args){

        Scanner sc = new Scanner(System.in);


        System.out.println("I'm thinking of a number between 1 and 10.");
        System.out.println("Can you guess it?");
        String playagain = new String();
        do {
            byte random = (byte) Math.ceil((Math.random() * 10));
            System.out.println("\nPick a number: ");
            int guess = -1;

            while (guess != random) {
                guess = sc.nextInt();
                
                if (guess < 1 || guess > 10) {
                	System.out.println("Number needs to be between 1 and 10!");
                    System.out.println("\nGuess again: ");
                }
                  
                  if (guess != random && (guess >= 1 && guess <= 10)) {
                    System.out.println("Wrong!");
                    System.out.println("\nGuess again: ");
                } if (guess == random) {
                    System.out.println("Correct! The number was " + random + ".");
                }
            }
            
            System.out.println("\nWould you like to play again (yes/no)?");
            sc.nextLine();
            playagain = sc.nextLine();
        } while (playagain.equals("yes"));
        	if (playagain.equals("no")) 
        	System.out.println("\nGood game!");
        sc.close();
     }
}