/**
 * 
 * This file is part of the CarParkSimulator Project, written as 
 * part of the assessment for INB370, semester 1, 2014. 
 *
 * CarParkSimulator
 * asgn2Vehicles 
 * 20/04/2014
 * 
 */
package asgn2Vehicles;

import asgn2Exceptions.VehicleException;

/**
 * The Car class is a specialisation of the Vehicle class to cater for production cars
 * This version of the class does not cater for model types, but records whether or not the 
 * vehicle can use a small parking space. 
 * 
 * @author Shannon Levick (n8591431)
 *
 */
public class Car extends Vehicle {
	
	//Declared variables for use throughout the class.
	private boolean small; 
	public String vehID;
	public int arrivalTime;

	/**
	 * The Car Constructor - small set at creation, not mutable. 
	 * @param vehID - identification number or plate of the vehicle
	 * @param arrivalTime - time (minutes) at which the vehicle arrives and is 
	 *        either queued or given entry to the carpark 
	 * @param small - indicator whether car is regarded as small or not
	 * @throws VehicleException if arrivalTime is <= 0  
	 */
	
	//Constructor for the class.
	public Car(String vehID, int arrivalTime, boolean small) throws VehicleException {
		super(vehID, arrivalTime);
		if (arrivalTime <= 0){
			throw new VehicleException("Error: Car arrivalTime must be greater than 0.");
		}
		this.vehID = vehID;
		this.arrivalTime = arrivalTime;
		this.small = small;
	}

	/**
	 * Boolean status indicating whether car is small enough for small 
	 * car parking spaces  
	 * @return true if small parking space, false otherwise
	 */
	
	//Boolean to indicate whether a car is considered small or not.
	public boolean isSmall() {
		if (small){
			return true;
		} else {
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see asgn2Vehicles.Vehicle#toString()
	 */
	@Override
	public String toString() {
		return "Car toString()";
	}
}
