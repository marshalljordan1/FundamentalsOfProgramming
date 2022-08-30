import java.util.Scanner;

public class M7_3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* A group of friends have stayed to make a fideuà, 
 * 
 * the main ingredients will be: noodles, prawns and squid. 
 * They know that for every four people, they have to use half a kilo of noodles, 
 * 400 grams of squid and 200 grams of prawns. 
 * A program should be made that asks on the screen the price per kilo of each ingredient 
 * and the number of friends that will be for lunch. 
 * The program must calculate the necessary quantities of each ingredient, 
 * the price per person and the final price of the fideuà
 */
		
		Scanner data = new Scanner(System.in);
		System.out.println("How much is 1kg of noodles?:");
		float noodlesPrice = data.nextByte();
		System.out.println("How much is 1kg of squid?:");
		float squidPrice = data.nextByte();
		System.out.println("How much is 1kg of prawns?:");
		float prawnsPrice = data.nextByte();
		System.out.println("How guests are there?:");
		int guests = data.nextByte();
		
		float noodlesKg = 125 * guests;
		float squidKg = 100 * guests;
		float prawnsKg = 50 * guests;
		
		System.out.println("\nYou will need "+noodlesKg+"kg of noodles, "+squidKg+"kg of squid, XXkg of prawns. \n The price per person is: XX \n The total price is: XX");
	}
}
