/**
 * 
 * This file is part of the CarParkSimulator Project, written as 
 * part of the assessment for INB370, semester 1, 2014. 
 *
 * CarParkSimulator
 * asgn2Tests 
 * 22/04/2014
 * 
 * Yujin Oh (n8560170)
 * 
 */
package asgn2Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import asgn2Exceptions.VehicleException;
import asgn2Vehicles.MotorCycle;

/**
 * @author hogan
 *
 */
public class MotorCycleTests {
	private static final String TEST_VEHICLE_ID = "780M10";
	private static final int TEST_ARRIVAL_TIME = 30;


	@Test
	public void constructorSetUp() throws Exception {
		new MotorCycle(TEST_VEHICLE_ID, TEST_ARRIVAL_TIME);
	}

	/**
	 * Test method for {@link asgn2Vehicles.MotorCycle#MotorCycle(java.lang.String, int)}.
	 * @throws VehicleException 
	 */
	@Test(expected = VehicleException.class)
	public void testArrivalTimeIsNegative() throws VehicleException {
		int arrivalTime = -1;
		new MotorCycle(TEST_VEHICLE_ID, arrivalTime);
	}
	
	@Test(expected = VehicleException.class)
	public void testArrivalTimeIsZero() throws VehicleException {
		int arrivalTime = 0;
		new MotorCycle(TEST_VEHICLE_ID, arrivalTime);
	}

	/**
	 * Test method for {@link asgn2Vehicles.Vehicle#getVehID()}.
	 * @throws VehicleException 
	 */
	@Test
	public void testGetVehID() throws VehicleException {
		String testID = "3gi4d2";
		MotorCycle testMotorCycle = new MotorCycle(testID, TEST_ARRIVAL_TIME);
		assertEquals(testID, testMotorCycle.getVehID());
	}

	/**
	 * Test method for {@link asgn2Vehicles.Vehicle#getArrivalTime()}.
	 * @throws VehicleException 
	 */
	@Test
	public void testGetArrivalTime() throws VehicleException {
		int testArrivalTime = 40;
		MotorCycle testMotorCycle = new MotorCycle(TEST_VEHICLE_ID, testArrivalTime);
		assertEquals(testArrivalTime, testMotorCycle.getArrivalTime());
	}

	/**
	 * Test method for {@link asgn2Vehicles.Vehicle#enterQueuedState()}.
	 * @throws VehicleException 
	 */
	@Test
	public void testEnterQueuedState() throws VehicleException {
		MotorCycle testMotorCycle = new MotorCycle(TEST_VEHICLE_ID, TEST_ARRIVAL_TIME);
		testMotorCycle.enterQueuedState();
		assertEquals(true, testMotorCycle.isQueued());
	}

	/**
	 * Test method for {@link asgn2Vehicles.Vehicle#exitQueuedState(int)}.
	 * @throws VehicleException 
	 */
	@Test
	public void testExitQueuedState() throws VehicleException {
		MotorCycle testMotorCycle = new MotorCycle(TEST_VEHICLE_ID, TEST_ARRIVAL_TIME);
		testMotorCycle.enterQueuedState();
		testMotorCycle.enterQueuedState();
	}

	/**
	 * Test method for {@link asgn2Vehicles.Vehicle#enterParkedState(int, int)}.
	 * @throws VehicleException 
	 */
	@Test
	public void testEnterParkedState() throws VehicleException {
		MotorCycle testMotorCycle = new MotorCycle(TEST_VEHICLE_ID, TEST_ARRIVAL_TIME);
		testMotorCycle.enterParkedState(50, 120);
		testMotorCycle.enterQueuedState();
	}

	/**
	 * Test method for {@link asgn2Vehicles.Vehicle#exitParkedState(int)}.
	 */
	@Test
	public void testExitParkedStateInt() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link asgn2Vehicles.Vehicle#exitParkedState()}.
	 * @throws VehicleException 
	 */
	@Test
	public void testExitParkedState() throws VehicleException {
		MotorCycle testMotorCycle = new MotorCycle(TEST_VEHICLE_ID, TEST_ARRIVAL_TIME);
		testMotorCycle.enterParkedState(31, 40);
		testMotorCycle.exitParkedState(51);
	}

	/**
	 * Test method for {@link asgn2Vehicles.Vehicle#isParked()}.
	 * @throws VehicleException 
	 */
	@Test
	public void testIsParked() throws VehicleException {
		MotorCycle testMotorCycle = new MotorCycle(TEST_VEHICLE_ID, TEST_ARRIVAL_TIME);
		assertEquals(false, testMotorCycle.isParked());
	}

	/**
	 * Test method for {@link asgn2Vehicles.Vehicle#isQueued()}.
	 * @throws VehicleException 
	 */
	@Test
	public void testIsQueued() throws VehicleException {
		MotorCycle testMotorCycle = new MotorCycle(TEST_VEHICLE_ID, TEST_ARRIVAL_TIME);
		testMotorCycle.enterQueuedState();
		assertEquals(true, testMotorCycle.isQueued());
	}

	/**
	 * Test method for {@link asgn2Vehicles.Vehicle#getParkingTime()}.
	 * @throws VehicleException 
	 */
	@Test
	public void testGetParkingTime() throws VehicleException {
		MotorCycle testMotorCycle = new MotorCycle(TEST_VEHICLE_ID, TEST_ARRIVAL_TIME);
		testMotorCycle.enterParkedState(40, 60);
		int expectedResult = 40;
		assertEquals(expectedResult, testMotorCycle.getParkingTime());
	}

	/**
	 * Test method for {@link asgn2Vehicles.Vehicle#getDepartureTime()}.
	 * @throws VehicleException 
	 */
	@Test
	public void testGetDepartureTime() throws VehicleException {
		MotorCycle testMotorCycle = new MotorCycle(TEST_VEHICLE_ID, TEST_ARRIVAL_TIME);
		testMotorCycle.enterParkedState(40, 70);
		testMotorCycle.exitParkedState(90);
		int expectedResult = 90;
		assertEquals(expectedResult, testMotorCycle.getDepartureTime());
	}

	/**
	 * Test method for {@link asgn2Vehicles.Vehicle#wasQueued()}.
	 * @throws VehicleException 
	 */
	@Test
	public void testWasQueued() throws VehicleException {
		MotorCycle testMotorCycle = new MotorCycle(TEST_VEHICLE_ID, TEST_ARRIVAL_TIME);
		testMotorCycle.enterQueuedState();
		testMotorCycle.exitQueuedState(39);
		testMotorCycle.enterParkedState(40, 70); 
		assertEquals(true, testMotorCycle.wasQueued());
	}

	/**
	 * Test method for {@link asgn2Vehicles.Vehicle#wasParked()}.
	 * @throws VehicleException 
	 */
	@Test
	public void testWasParked() throws VehicleException {
		MotorCycle testMotorCycle = new MotorCycle(TEST_VEHICLE_ID, TEST_ARRIVAL_TIME);
		testMotorCycle.enterParkedState(40, 70);
		testMotorCycle.exitParkedState(90);
		assertEquals(true, testMotorCycle.wasParked());
	}

	/**
	 * Test method for {@link asgn2Vehicles.Vehicle#isSatisfied()}.
	 * @throws VehicleException 
	 */
	@Test
	public void testIsSatisfied() throws VehicleException {
		MotorCycle testMotorCycle = new MotorCycle(TEST_VEHICLE_ID, TEST_ARRIVAL_TIME);
		testMotorCycle.enterQueuedState();
		testMotorCycle.exitQueuedState(40);
		assertEquals(true, testMotorCycle.isSatisfied());
	}

	/**
	 * Test method for {@link asgn2Vehicles.Vehicle#toString()}.
	 * @throws VehicleException 
	 */
	@Test
	public void testToString() throws VehicleException {
		
	}

}
