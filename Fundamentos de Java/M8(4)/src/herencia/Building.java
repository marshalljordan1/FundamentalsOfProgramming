/* 
 * The city of Barcelona, ​​like any other city, is made up of a very large number of buildings. There are many kinds of buildings: 
 * 
 * apartment buildings, hospitals, schools, apartment blocks, office blocks, hotels, cinemas, and so on.
 * 
 * 
 * The proposed exercise will be to create an application that will contain a Building class and several derived classes. 
 * 
 * No objects of the Building class will be instantiated, but objects of the classes derived from it will be instantiated. 
 * 
 * The derived classes are: Hotel, Hospital and Cinema. 
 * 
 * 
 * All the buildings will have certain common data (name, number of floors, surface (m²)) that will be given when creating the building 
 * 
 * and will not be modified, but it will be necessary to be able to access them to read them. 
 * 
 * 
 * 
 * A clean () method will be created in the appropriate class, which will display the time it took to clean the building, taking into account 
 * 
 * that it takes one minute to clean every 5 m². Also, if a building has more than one floor, it takes half a minute to move from one floor to 
 * 
 * another. Therefore, we will add half a minute for each additional plant. One euro per day will be paid for each minute of work. Also, since 
 * 
 * it is cleaned every day, to get the monthly cost, we will have to multiply by 30 (this monthly cost will also be displayed on screen). 
 * 
 * 
 * In addition, a method called Calculating Cost Surveillance () will be implemented that will show how much it costs per month to hire vigilantes 
 * 
 * in each building. It is estimated that each hotel or hospital guard can monitor 1000 m². Therefore, if a building has an area of ​​5500 m², we will 
 * 
 * need 6 guards. On the other hand, cinema watchers can watch 3000 m². Hiring each security guard costs the building owners 1,300 euros a month, 
 * 
 * but hotel security guards charge a dangerous bonus of 500 euros a month. 
 * 
 * 
 * At the hospital, lunch is given to the sick three times a day. There will be a method of distributing Lunch () 
 * 
 * in the appropriate place that will display, when called, the message "xxx rations are being distributed". To achieve the number of rations, 
 * 
 * the number of patients must be multiplied by 3. The number of patients admitted to the hospital may vary over time, so access to the corresponding 
 * 
 * attribute must be allowed, both to read it and to modify it, even if it is not done directly. 
 * 
 * 
 * The projectarSessio () function will be created in the cinema, which will display the message “xxx euros have been raised”, taking into 
 * 
 * account that, in order to calculate the collection, the price of a ticket must be multiplied by the number of attendees. the session, 
 * 
 * which may not exceed the maximum capacity. Therefore, the projectSession () function must receive as parameters the number of attendees 
 * 
 * and the price of the ticket for that session. The number of people attending the session cannot be greater than the total capacity of the room. 
 *  
 *  
 *  Room service is available in the hotels every day. It is estimated that each service member can accommodate 20 rooms. A method 
 *  
 *  will be created that calculates, and displays on screen: a) How many people are needed to attend the hotel room service. b) What is the total 
 *  
 *  required for the salaries of these people, taking into account that each person receives 1,000 euros per month. 
 *  
 *  
 *  Examples: The "Hospital de Vilafranca", 1,950 m2 and 2 floors. He currently has 26 patients. The "General Hospital of Catalonia", 
 *  
 *  25,350 m2 and 10 floors. It currently has 315 patients. The "Cinema Monte Carlo", 3180 m2 and 1 floor. The “Main Cinema”, of 12,450 m² and 2 floors. 
 *  
 *  The "Hilton Hotel", with 73,858 m2 and 22 floors. It has 583 rooms. The "Hotel Pepita", of 593 m2 and 3 floors. It has 12 rooms. 
 *  
 *  
 *  The application must be able to register, display and remove buildings. When calling the display method,  we will call all the methods of 
 *  
 *  the building in question to see all their data on screen.
 * 
 */
 
 
 package herencia;


public abstract class Building {
	protected String name; 
	protected int numFloors;
	protected int surfaceArea;
	
	public Building(String name, int numFloors, int surfaceArea) {
		this.name = name;
		this.numFloors = numFloors;
		this.surfaceArea = surfaceArea;
	
	}

	public String getName() {
		return name;
	}

	public int getNumFloors() {
		return numFloors;
	}

	public int getSurfaceArea() {
		return surfaceArea;
	}
	
	/* A clean () method will be created in the appropriate class, which will display the time it took to clean the building, 
	 * taking into account that it takes one minute to clean every 5 m². Also, if a building has more than one floor, it 
	 * takes half a minute to move from one floor to another. Therefore, we will add half a minute for each additional floor. 
	 * One euro per day will be paid for each minute of work. Also, since it is cleaned every day, to get the monthly cost, 
	 * we will have to multiply by 30 (this monthly cost will also be displayed on screen)
	 */
	
	public String clean() {
		double timeCleaning = Math.ceil((double)this.surfaceArea / 5);
		double timeFloors = Math.ceil((double)(this.numFloors - 1) * 0.5);
		double costWork = Math.ceil(timeFloors + timeCleaning) * 1;
		int costMonth = (int)costWork * 30;
		
		return "The time it took to clean the building was "+ (float)timeCleaning / 60 +" hours with a total cost of "+ costMonth +"€";
		}
	
	/* In addition, a method called Calculating Cost Surveillance () will be implemented that will show how much it costs per 
	 * month to hire vigilantes in each building. It is estimated that each hotel or hospital guard can monitor 1000 m². 
	 * Therefore, if a building has an area of ​​5500 m², we will need 6 guards. On the other hand, cinema watchers can watch 
	 * 3000 m². Hiring each security guard costs the building owners 1,300 euros a month, but hotel security guards charge a 
	 * danger bonus of 500 euros a month.
	 */
	
	public abstract String CalculatingCostSurveillance();
	
	@Override
	public String toString() {
		return "Building "+ name +": number of floors = "+ numFloors +", surface area of building = "+ surfaceArea +"m2.";
	}
}
