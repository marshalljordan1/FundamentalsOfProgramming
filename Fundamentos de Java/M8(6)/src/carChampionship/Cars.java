package carChampionship;

public class Cars extends Teams {
	
	//Each team can have more than  one car and they want to know the power, top speed, color and market price of each.
	
	private int power;
	private int topSpeed;
	private String colour;
	private int mktPrice;
	
	public Cars(String teamName, int budget, String country, int power, int topSpeed, String colour, int mktPrice) {
		super(teamName, budget, country);
		this.power = power;
		this.topSpeed = topSpeed;
		this.colour = colour;
		this.mktPrice = mktPrice;
		
	}
	
	public int getPower() {
		return power;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public String getColour() {
		return colour;
	}

	public int getMktPrice() {
		return mktPrice;
	}

}
