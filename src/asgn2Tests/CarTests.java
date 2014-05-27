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
<<<<<<< HEAD
 * @author hogan
=======
 * @author Shannon Levick (n8591431)
>>>>>>> FETCH_HEAD
 *
 */
public class CarTests {
	
	private String VehID;
	private int arrivalTime;
	private boolean small;
	Car theCar;

	/**
	 * Test method for the constructor of Car is correct
	 * @throws VehicleException 
	 * if the arrival time is 0 or less than 0
	 * @Author Yujin Oh
	 */
<<<<<<< HEAD
	@Test
	public void testCarConstructorIsCorrect() throws VehicleException {
		new Car("730MYD", 10, true);
	}
	
	@Test
	public void testCarConstructorIsCorrectArrivalTimeIsZeo() throws VehicleException {
		new Car("730MYD", 0, true);
=======
	@Before
	public void setUp() throws Exception {
		this.theCar = new Car(VehID, arrivalTime, small);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		theCar = null;
>>>>>>> FETCH_HEAD
	}
	
	@Test
<<<<<<< HEAD
	public void testCarConstructorIsCorrectArrivalTimeIsLessThanZeo() throws VehicleException {
		new Car("730MYD", -7, true);
=======
	public void testToString(String small) throws VehicleException {
>>>>>>> FETCH_HEAD
	}
	
	
	/**
	 * Test isSmall method, ensuring that when a small car is
	 * created, the isSmall function return to correct boolean
	 * @Author Yujin Oh
	 */
<<<<<<< HEAD
	@Test()
	public void testCarIsSmallIsTrue() throws VehicleException {
		Car testCar = new Car("730MYD", 1, true);
		assertEquals(true, testCar.isSmall());
=======
	@Test
	public void testCar() {
>>>>>>> FETCH_HEAD
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
<<<<<<< HEAD
	@Test()
	public void testCarEnterQueuedStateValid() throws VehicleException {
		Car testCar = new Car("730MYD", 1, false);
		testCar.enterQueuedState();
		assertEquals(true, testCar.isQueued());
=======
	@Test
	public void testIsSmall() {
		assertTrue(theCar.isSmall());
>>>>>>> FETCH_HEAD
	}

}
