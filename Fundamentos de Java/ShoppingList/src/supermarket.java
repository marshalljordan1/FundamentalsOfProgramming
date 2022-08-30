import java.util.ArrayList;

/* 
 * 
 * They give us two arraylist. In one there are products available and in the other products we want to buy.
   Available products: "shampoo", "soap", "potatoes", "chard", "lettuce", "lemons", "kiwis", "avocados", 
   "noodles", "rice", "coffee", "chocolate"
   Products we want to buy: "shampoo", "chocolate", "avocados", "chards", "lemons", "lemonade"
   Create a third arraylist with the products that are in the two arraylists. These will be the purchased products.*/


public class supermarket {

	public static void main(String[] args) {
		
		ArrayList<String> availableProducts = new ArrayList<String>();
		availableProducts.add("shampoo");
		availableProducts.add("soap");
		availableProducts.add("potatoes");
		availableProducts.add("chard");
		availableProducts.add("lettuce");
		availableProducts.add("lemons");
		availableProducts.add("kiwis");
		availableProducts.add("avocados");
		availableProducts.add("noodles");
		availableProducts.add("rice");
		availableProducts.add("coffee");
		availableProducts.add("chocolate");
		
		System.out.println(availableProducts);
		
		ArrayList<String> shoppingList = new ArrayList<String>();
		shoppingList.add("shampoo");
		shoppingList.add("chocolate");
		shoppingList.add("avocados");
		shoppingList.add("chard");
		shoppingList.add("lemons");
		shoppingList.add("lemonade");
		
		System.out.println("\n"+shoppingList);
		
		ArrayList<String> toBuy = new ArrayList<String>();
		for (int i = 0; i < shoppingList.size(); i++) {
			for (int j = 0; j < availableProducts.size(); j++) {
				if (shoppingList.get(i).equalsIgnoreCase(availableProducts.get(j))) {
					toBuy.add(shoppingList.get(i));
			}
		}
	} System.out.println("\n"+toBuy);

}
}
