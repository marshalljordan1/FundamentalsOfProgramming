package herencia;

public class Hospital extends Building {
	
	public static final int DAILYRATIONS = 3;
	private int patients;
	
	public Hospital(String name, int numFloors, int surfaceArea, int patients) {
		super(name, numFloors, surfaceArea);
		this.patients = patients;
	}

	/* At the hospital, lunch is given to the sick three times a day. There will be a method of distributing Lunch () in the 
	 * appropriate place that will display, when called, the message "xxx rations are being distributed". To achieve the number 
	 * of rations, the number of patients must be multiplied by 3. The number of patients admitted to the hospital may vary 
	 * over time, so access to the corresponding attribute must be allowed, both to read it and to modify it, even if it is 
	 * not done directly.
	 */
	
	public int getPatients() {
		return patients;
	}

	public void setPatients(int patients) {
		this.patients = patients;
	}

	public String Lunch() {
		return (this.patients * Hospital.DAILYRATIONS) +" rations are being distributed";
	}
	
	@Override
	public String CalculatingCostSurveillance() {
		double guards = Math.ceil((double)this.getSurfaceArea() / 1000);
		double costGuard = (guards * 1300);
		return "The monthly cost of the guards is " + costGuard + "€. The number of guards is "+ guards;
	}
	
	public String toString() {
		return "The "+ super.getName() +" Hospital is "+ super.getSurfaceArea() +"m2 and has "+ super.getNumFloors() +" floors";
	}
}