package carChampionship;

public class Workers {
	
	public static final int DANGEROUSNESS = 50000;
	public static final int SENIORITY = 10000;
	protected String firstName;
	protected String lastName;
	protected int age;
	protected int timeInTeam;
	protected int baseSalary;
	
	public String personalInfo(String firstName, String lastName, int age, int timeInTeam, int baseSalary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.timeInTeam = timeInTeam;
		this.baseSalary = baseSalary;
		
		return " ";
	}
	
	public String Drivers(int height, int weight, int salary) {
		salary = (SENIORITY * timeInTeam) + baseSalary + DANGEROUSNESS;
		
		return "The salary of the drivers is: "+ salary;
	}
	
	public String Mechanics(boolean advDegree, int salary) {
		
		return " ";
	}
}
