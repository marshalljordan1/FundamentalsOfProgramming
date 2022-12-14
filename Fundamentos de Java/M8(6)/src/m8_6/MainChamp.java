/* 
 * 	
 * 
 * The organizers of a car championship want to have a program 
 * 
 * to manage some of the information that they did not have 
 * 
 * computerized until now. They want to know about each team 
 * 
 * participating in the championship, the team name, the budget they 
 * 
 * have and the country of origin. Each team can have more than 
 * 
 * one car and they want to know the power, top speed, color and 
 * 
 * market price of each. Of the workers in the different teams, 
 * 
 * they want to know their first name, last name, age, length of 
 * 
 * time in the team and their salary. The base salary is €50,000. 
 * 
 * 
 * In addition, they want to know the driver's height and weight. 
 * 
 * The salary of the drivers is the base salary of the workers plus 
 * 
 * €10,000 for each year of seniority in the team, plus €50,000 of 
 * 
 * dangerousness. For the mechanics, they want to know if they have 
 * 
 * advanced degrees in mechanics or not. And their salary is 
 * 
 * calculated by adding 10,000 for each year of seniority at the
 * 
 *  team plus the base salary. It is requested  that the application 
 *  
 *  be able to register, deregister and see drivers and mechanics, 
 *  
 *  and to see teams and cars. Teams and cars can be entered directly 
 *  
 *  in the code.
 *  
 *  
 *  
 */

package m8_6;

import java.util.ArrayList;

import carChampionship.Cars;
import carChampionship.Drivers;
import carChampionship.Mechanics;
import carChampionship.Teams;

public abstract class MainChamp {

	public static void main(String[] args) {
		
ArrayList<Teams> listChamp = new ArrayList<Teams>();


		Cars ferrari = new Cars("Mercedes", 140000000, "United Kingdom", 1000, 328, "black", 4700000);
		Cars bmw = new Cars("RedBull Racing", 500000, "UK", 400, 180, "black", 500000);
		Drivers hamilton = new Drivers("Mercedes", 140000000, "United Kingdom", 1000, 328, "black", 4700000);
		Drivers raddison = new Drivers("RedBull Racing", 500000, "UK", 1000, 50, 0);
		Mechanics hilton = new Mechanics("RedBull Racing", 500000, "UK", true, 50000);
		Mechanics raddison = new Mechanics("RedBull Racing", 500000, "UK", true, 50000);
		Teams castleHill = new Teams("RedBull Racing", 500000, "UK");
		Teams hullRoyal = new Teams("RedBull Racing", 500000, "UK");
		
		listChamp.add(odeon);
		listChamp.add(vue);
		listChamp.add(hilton);
		listChamp.add(raddison);
		listChamp.add(castleHill);
		listChamp.add(hullRoyal);
		
		
		
		public abstract String CalculatingCostSurveillance();

		@Override
		public String toString() {
			return "Building "+ name +": number of floors = "+ numFloors +", surface area of building = "+ surfaceArea +"m2.";
	}

}
