package parking;

public class CompactSpot extends ParkingSpot{

	int spotNumber;
	public CompactSpot(int spotNumber) {
		this.spotNumber=spotNumber;
		this.type = Genre.compact;
	}

}
