package parking;

import parking.Vehicle;
public class Ticket {

	public static final int regularSpotNumber = 10;
	public static final int compactSpotNumber = 10;
	public static int regularSpotCounter = 0;
	public static int compactSpotCounter = 0;


	public static int getRegularSpotCounter() {
		return regularSpotCounter;
	}

	public static void setRegularSpotCounter(int regularSpotCounter) {
		Ticket.regularSpotCounter = regularSpotCounter;
	}

	public static int getCompactSpotCounter() {
		return compactSpotCounter;
	}

	public static void setCompactSpotCounter(int compactSpotCounter) {
		Ticket.compactSpotCounter = compactSpotCounter;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	String start_time;
	Vehicle vehicle ;
	ParkingSpot parkingSpot ;
	
	

	public String getStart_time() {
		return start_time;
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	public Ticket(String startTime,Vehicle vehicle) {
		// TODO Auto-generated constructor stub
		start_time = startTime ;
		this.vehicle = vehicle ;
		if(vehicle.getType().equals(Genre.regular)) {
			parkingSpot = new RegularSpot(regularSpotCounter+1) ;
		}
		else {
			parkingSpot = new CompactSpot(compactSpotCounter+1);
		}
		
		
	}
}
