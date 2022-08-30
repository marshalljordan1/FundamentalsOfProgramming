package m8_2;

public class Hotel {
	
	private String hotelName;
	private int numRooms;
	private int numFloors;
	private int areaHotel;

	public Hotel(String hotelName, int numRooms, int numFloors, int areaHotel) {
		super();
		this.hotelName = hotelName;
		this.numRooms = numRooms;
		this.numFloors = numFloors;
		this.areaHotel = areaHotel;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getNumRooms() {
		return numRooms;
	}

	public void setNumRooms(int numRooms) {
		this.numRooms = numRooms;
	}

	public int getNumFloors() {
		return numFloors;
	}

	public void setNumFloors(int numFloors) {
		this.numFloors = numFloors;
	}

	public int getAreaHotel() {
		return areaHotel;
	}

	public void setAreaHotel(int areaHotel) {
		this.areaHotel = areaHotel;
	}
	public void calculateMaintenance( ) {
		int people, cost;
		final int salary = 1500, roomsPerPerson = 20;
		
		people = getNumRooms() / roomsPerPerson;
			
			if (getNumRooms() % roomsPerPerson != 0) {
				people += 1;
			}
			
			cost = people * salary;
			
			System.out.println("The maintenance of the hotel requires "+ people +" people, and the monthly cost is"+ cost +"€.");
		}
	
	@Override
	public String toString() {
		return "Hotel "+ hotelName +": number of rooms = "+ numRooms +". number of floors = "+ numFloors +", area of hotel = "+ areaHotel +"m2.";
	}
}

