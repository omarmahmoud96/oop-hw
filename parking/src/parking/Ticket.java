package parking;

import parking.Vehicle;
public class Ticket {

	String start_time;
	Vehicle vehicle ;

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
	}
}
