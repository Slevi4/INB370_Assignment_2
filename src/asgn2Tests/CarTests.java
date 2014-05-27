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

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import asgn2Exceptions.VehicleException;
import asgn2Vehicles.Car;

/**
 * @author Shannon Levick (n8591431)
 *
 */
public class CarTests {
	
	private String VehID;
	private int arrivalTime;
	private boolean small;
	Car theCar;

	/**
	 * @throws java.lang.Exception
	 */
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
	}

	/**
	 * Test method for {@link asgn2Vehicles.Car#toString()}.
	 * @param small 
	 * @throws VehicleException 
	 */
	@Test
	public void testToString(String small) throws VehicleException {
	}

	/**
	 * Test method for {@link asgn2Vehicles.Car#Car(java.lang.String, int, boolean)}.
	 */
	@Test
	public void testCar() {
	}

	/**
	 * Test method for {@link asgn2Vehicles.Car#isSmall()}.
	 */
	@Test
	public void testIsSmall() {
		assertTrue(theCar.isSmall());
	}

}
