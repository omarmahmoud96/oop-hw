package parking;

public class Vehicle {
	
	public enum genre {
		compact ,
		regular
	}
	genre type ;

	public Vehicle(genre t) {
		// TODO Auto-generated constructor stub
		type = t ;
	}

}
