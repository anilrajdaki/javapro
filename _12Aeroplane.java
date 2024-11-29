package assignment4;
import java.time.LocalTime;

public class _12Aeroplane {
	
		String flightNumber;
	    String destination;
	     LocalTime departureTime;
	     boolean isDelayed;
	     _12Aeroplane(String flightNumber,String destination,LocalTime departureTime){
	    	 this.departureTime=departureTime;
	    	 this.destination=destination;
	    	 this.flightNumber=flightNumber;
	    	 this.isDelayed=false;
	     }
	     public String checkFlightStatus() {
	         if (isDelayed) {
	             return "Flight " + flightNumber + " to " + destination + " is delayed.";
	         } else {
	             return "Flight " + flightNumber + " to " + destination + " is on time.";
	         }
	     }
	     public void delayFlight(int minutes) {
	         isDelayed = true;
	         departureTime = departureTime.plusMinutes(minutes); 
	     }
	     public String checkIfFlightIsOnTime(LocalTime currentTime) {
	         if (currentTime.isBefore(departureTime)) {
	             return "Flight " + flightNumber + " is on time. Departure is at " + departureTime;
	         } else if (currentTime.equals(departureTime)) {
	             return "Flight " + flightNumber + " is departing now.";
	         } else {
	             return "Flight " + flightNumber + " has already departed.";
	         }
	     }
	     public static void main(String [] args){
	    	 _12Aeroplane airplane = new _12Aeroplane("ranjith", "bali", LocalTime.of(7, 30));
	         System.out.println(airplane.checkFlightStatus());
	         airplane.delayFlight(30);
	         System.out.println(airplane.checkFlightStatus());
	         System.out.println(airplane.checkIfFlightIsOnTime(LocalTime.of(7, 30))); 
	         System.out.println(airplane.checkIfFlightIsOnTime(LocalTime.of(9, 0))); 
	     }
	}
