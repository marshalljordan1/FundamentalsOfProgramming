package carChampionship;

public class Teams {

	 //the team name, the budget they have and the country of origin.
	
	protected String teamName;
	protected int budget;
	protected String country;
	
	public Teams(String teamName, int budget, String country) {
		this.teamName = teamName;
		this.budget = budget; 
		this.country = country;
	}
	
	// Of the workers in the different teams, they want to know their first name, last name, age, 
	// length of time in the team and their salary.
	
	public String getTeamName() {
		return teamName;
	}

	public int getBudget() {
		return budget;
	}

	public String getCountry() {
		return country;
	}

}
