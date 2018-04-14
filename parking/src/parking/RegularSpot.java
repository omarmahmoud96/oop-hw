package parking;

public class RegularSpot extends ParkingSpot {
	int spotNumber;

	public RegularSpot(int spotNumber) {
		this.spotNumber = spotNumber;
		this.type = Genre.regular;
	}

}
