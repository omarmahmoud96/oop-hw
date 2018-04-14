package parking;

public class Parking {
	
	public static final int regularSpotsNumbers = 10;
	public static final int compactSpotsNumbers = 10;
	//RegularSpot[] regularSpots;
	//CompactSpot[] compactSpots;
	
	int regularSpotsCounter; 
	int compactSpotsCounter;
	
	
	public Parking() {
		//regularSpots = new RegularSpot[regularSpotsNumbers];
		//compactSpots = new CompactSpot[compactSpotsNumbers];
		regularSpotsCounter = 0;
		compactSpotsCounter = 0;
	}

	public boolean isFull() {
		return regularSpotsCounter == regularSpotsNumbers && compactSpotsCounter == compactSpotsNumbers;
	}
	
	public boolean isCompactFull() {
		return compactSpotsCounter == compactSpotsNumbers;
	}
	
	public boolean isRegularFull() {
		return regularSpotsCounter == regularSpotsNumbers;	
	}
	
	public Ticket parkVehicle(String startTime, Vehicle vehicle) {
		if(vehicle.type.equals(Genre.regular)) {
			if(!isRegularFull()){
				regularSpotsCounter += 1;
				return new Ticket(startTime,vehicle);
			}
			else {
				return null;
			}
		}
		else {
			if(!isCompactFull()){
				compactSpotsCounter += 1;
				return new Ticket(startTime,vehicle);
			}
			else {
				if(!isRegularFull()) {
					regularSpotsCounter += 1;
					return new Ticket(startTime,vehicle);
				}
				else {
					return null;	
				}
			}
		}
	}
	
	public void releaseSpotByTicket(Ticket t) {
		if(t.parkingSpot.getType().equals(Genre.regular)) {
			regularSpotsCounter -= 1;
			Ticket.setRegularSpotCounter(regularSpotsCounter);
		}
		else {
			compactSpotsCounter -= 1;
			Ticket.setCompactSpotCounter(compactSpotsCounter);	
		}
	}
}
