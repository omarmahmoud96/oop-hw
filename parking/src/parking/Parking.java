package parking;

public class Parking {
	
	public static final int regularSpotsNumbers = 10;
	public static final int compactSpotsNumbers = 10;
	RegularSpot[] regularSpots;
	CompactSpot[] compactSpots;
	
	int regularSpotsCounter; 
	int compactSpotsCounter;
	
	public Parking() {
		regularSpots = new RegularSpot[regularSpotsNumbers];
		compactSpots = new CompactSpot[compactSpotsNumbers];
		
		int regularSpotsCounter = 0;
		int compactSpotsCounter = 0;
	}

	public boolean isFull() {
		return regularSpotsCounter == regularSpotsNumbers && compactSpotsCounter == compactSpotsNumbers;
		
	}
	
	public boolean isComapctFull() {
		return compactSpotsCounter == compactSpotsNumbers;
		
	}
	
	public boolean isRegularFull() {
		return regularSpotsCounter == regularSpotsNumbers;
		
	}
}
