package footballTeam;

public class Teams {
	
	protected String teamName;
	protected String city;
	protected String stadium;
	
	public Teams(String teamName, String city, String stadium) {
		this.teamName = teamName;
		this.city = city;
		this.stadium = stadium;
		
	}

	public String getTeamName() {
		return teamName;
	}

	public String getCity() {
		return city;
	}

	public String getStadium() {
		return stadium;
	}

}
