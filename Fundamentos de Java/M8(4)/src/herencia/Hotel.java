package herencia;

public class Hotel extends Building {
	public static final int PLUSDANGER = 500;
	private int numRooms;
	
	public Hotel(String name, int numFloors, int surfaceArea, int numRooms) {
		super(name, numFloors, surfaceArea);
		
		this.numRooms = numRooms;
		
	}
	
	/* Room service is available in the hotels every day. It is estimated that each service member 
	 * can accommodate 20 rooms. A method will be created that calculates, and displays on screen: 
	 * a) How many people are needed to attend the hotel room service. b) What is the total required 
	 * for the salaries of these people, taking into account that each person receives 1,000 euros 
	 * per month.
	 */
	
	public int getNumRooms() {
		return numRooms;
	}

	public void setNumRooms(int numRooms) {
		this.numRooms = numRooms;
	}

	public String roomService() {
		double numStaff = Math.ceil(this.numRooms / 20);
		int calcCost = (int)numStaff * 1000;
		return "The number of staff needed for room service: "+ (int)numStaff +". Total salaries: "+ calcCost +"€";
		
	}

	@Override
	public String CalculatingCostSurveillance() {
				double guards = Math.ceil((double)this.getSurfaceArea() / 1000);
				double costGuard = (guards * 1300) + Hotel.PLUSDANGER;
				return "The monthly cost of the guards is " + costGuard + "€. The number of guards is "+ (int)guards;
	}
	@Override
	public String toString() {
		return "The "+ super.getName() +" Hotel is "+ super.getSurfaceArea() +"m2 and has "+ super.getNumFloors() +" floors";
	}

}