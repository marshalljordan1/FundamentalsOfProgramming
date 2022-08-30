package herencia;

public class Cinema extends Building {
	
	private int capacity;
	
	public Cinema(String name, int numFloors, int surfaceArea, int capacity) {
		super(name, numFloors, surfaceArea);
		this.capacity = capacity;
	}
	
		public int getCapacity() {
		return capacity;
	}


	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	/* The projectarSessio () function will be created in the cinema, which will display the message “xxx euros have been raised”, 
	 * taking into account that, in order to calculate the collection, the price of a ticket must be multiplied by the number of 
	 * attendees. the session, which may not exceed the maximum capacity. Therefore, the projectSession () function must receive 
	 * as parameters the number of attendees and the price of the ticket for that session. The number of people attending the 
	 * session cannot be greater than the total capacity of the room.
	 */
	
		public String projectorSession(int ticketCost, int attendees) {
			
			int collection = 0;
			
			if (attendees > capacity) {
				System.out.println("The number of attendees is over the capacity.");
				collection = ticketCost * capacity;
			} else {
				collection = ticketCost * attendees;
			}
			return collection + "€ has been raised";
	}
		@Override
		public String CalculatingCostSurveillance() {
			double guards = Math.ceil((double)this.getSurfaceArea() / 3000);
			double costGuards = (guards * 1300);
			return "The monthly cost of the guards is " + costGuards +"€. Number of guards: "+ guards;
		}
		
		public String toString() {
			return "The "+ super.getName() +" Cinema is "+ super.getSurfaceArea() +"m2 and has "+ super.getNumFloors() +" floors";
		 }
}
