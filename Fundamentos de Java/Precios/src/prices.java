import java.util.ArrayList;

// A partir del següent arraylist de preus en euros: [15, 16, 8, 2, 4, 6, 2]
// Crea un altre array amb els preus en dollars. Per passar de euros a dollars has de multiplicar el preu per 1.2

public class prices {

	public static void main(String[] args) {
		
		ArrayList<Integer> euros = new ArrayList<Integer>();
	    euros.add(15);
	    euros.add(16);
	    euros.add(8);
	    euros.add(2);
	    euros.add(4);
	    euros.add(6);
	    euros.add(2);
	    System.out.print(euros + "\n");
	    
	    ArrayList<Double> dollars = new ArrayList<Double>();
	    for (int i = 0; i < euros.size(); i++) {
	    	dollars.add(euros.get(i) * 1.2);
	    }
	    System.out.print(dollars);
	}
	
}