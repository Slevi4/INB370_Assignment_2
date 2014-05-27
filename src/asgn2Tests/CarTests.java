/**
 * 
 * This file is part of the CarParkSimulator Project, written as 
 * part of the assessment for INB370, semester 1, 2014. 
 *
 * CarParkSimulator
 * asgn2Tests 
 * 22/04/2014
 * 
 */
package asgn2Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import asgn2Exceptions.VehicleException;
import asgn2Vehicles.Car;

/**
 * @author hogan
 *
 */
public class CarTests {

	/**
	 * Test method for the constructor of Car is correct
	 * @throws VehicleException 
	 * if the arrival time is 0 or less than 0
	 * @Author Yujin Oh
	 */
	@Test
	public void testCarConstructorIsCorrect() throws VehicleException {
		new Car("730MYD", 10, true);
	}
	
	@Test
	public void testCarConstructorIsCorrectArrivalTimeIsZeo() throws VehicleException {
		new Car("730MYD", 0, true);
	}
	
	@Test
	public void testCarConstructorIsCorrectArrivalTimeIsLessThanZeo() throws VehicleException {
		new Car("730MYD", -7, true);
	}
	
	
	/**
	 * Test isSmall method, ensuring that when a small car is
	 * created, the isSmall function return to correct boolean
	 * @Author Yujin Oh
	 */
	@Test()
	public void testCarIsSmallIsTrue() throws VehicleException {
		Car testCar = new Car("730MYD", 1, true);
		assertEquals(true, testCar.isSmall());
	}
	
	@Test()
	public void testCarIsSmallIsFalse() throws VehicleException {
		Car testCar = new Car("730MYD", 1, false);
		assertEquals(true, testCar.isSmall());
	}
	
	
	/**
	 * Vehicle entering a queue and the method that returns the
	 * boolean indicating this
	 * @Author Yujin Oh
	 */
	@Test()
	public void testCarEnterQueuedStateValid() throws VehicleException {
		Car testCar = new Car("730MYD", 1, false);
		testCar.enterQueuedState();
		assertEquals(true, testCar.isQueued());
	}

}
