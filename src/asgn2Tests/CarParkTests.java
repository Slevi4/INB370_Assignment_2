/**
 * 
 * This file is part of the CarParkSimulator Project, written as 
 * part of the assessment for INB370, semester 1, 2014. 
 *
 * CarParkSimulator
 * asgn2Tests 
 * 29/04/2014
 * 
 */
package asgn2Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import asgn2CarParks.CarPark;
<<<<<<< HEAD
import asgn2Exceptions.SimulationException;
import asgn2Exceptions.VehicleException;
import asgn2Simulators.Constants;
import asgn2Vehicles.Car;

/**
 * @author hogan
 * Yujin Oh (n8560170)
=======
import asgn2Vehicles.Car;

/**
 * @author Shannon Levick (n8591431)
>>>>>>> FETCH_HEAD
 *
 */

public class CarParkTests {

<<<<<<< HEAD
=======
	private int carParkSpaces = 100;
	private int smallCarParkSpaces = 20;
	private int motoSpaces = 10;
	private int queueSize = 10;
	private CarPark testCarPark;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		testCarPark = new CarPark(carParkSpaces, smallCarParkSpaces, motoSpaces, queueSize);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		testCarPark = null;
	}
>>>>>>> FETCH_HEAD

	/**
	 * Test method for {@link asgn2CarParks.CarPark#archiveDepartingVehicles(int, boolean)}.
	 * @throws VehicleException 
	 * @throws SimulationException 
	 */
	@Test
	public void testArchiveDepartingVehicles() throws SimulationException, VehicleException {
		Car TesterCar1 = new Car("730MYD", 1, false);
		CarPark carPark = new CarPark();
		carPark.parkVehicle(TesterCar1, 10, 30);
		carPark.unparkVehicle(TesterCar1, 60);
		
		carPark.archiveDepartingVehicles(60, false);
		assertEquals(true, TesterCar1.wasParked());
	}

	/**
	 * Test method for {@link asgn2CarParks.CarPark#archiveNewVehicle(asgn2Vehicles.Vehicle)}.
	 * @throws SimulationException 
	 * @throws VehicleException 
	 */
	@Test
	public void testArchiveNewVehicle() throws SimulationException, VehicleException {
		Car TesterCar1 = new Car("730MYD", 1, false);
		CarPark carPark = new CarPark();
		carPark.archiveNewVehicle(TesterCar1);
	}

	/**
	 * Test method for {@link asgn2CarParks.CarPark#archiveQueueFailures(int)}.
	 * @throws VehicleException 
	 * @throws SimulationException 
	 */
	@Test
	public void testArchiveQueueFailures() throws VehicleException, SimulationException {
		Car TesterCar1 = new Car("730MYD", 1, false);
		CarPark carPark = new CarPark();
		carPark.enterQueue(TesterCar1);
		assertEquals(true, TesterCar1.isQueued());
		carPark.archiveQueueFailures(1 + Constants.MAXIMUM_QUEUE_TIME);
	}

	/**
	 * Test method for {@link asgn2CarParks.CarPark#carParkEmpty()}.
	 */
	@Test
	public void testCarParkEmpty() {
		CarPark carPark = new CarPark();
		assertEquals(true, carPark.carParkEmpty());
	}

	/**
	 * Test method for {@link asgn2CarParks.CarPark#carParkFull()}.
	 * @throws VehicleException 
	 * @throws SimulationException 
	 */
	@Test
	public void testCarParkFull() throws VehicleException, SimulationException {
		CarPark carPark = new CarPark(2,0,0,4);
		Car TesterCar1 = new Car("730MYD", 1, false);
		Car TesterCar2 = new Car("740MYD", 2, false);
		
		carPark.parkVehicle(TesterCar1, 2, 30);
		carPark.parkVehicle(TesterCar2, 3, 30);
		
		assertEquals(true, carPark.carParkFull());
	}

	/**
	 * Test method for {@link asgn2CarParks.CarPark#enterQueue(asgn2Vehicles.Vehicle)}.
	 * @throws VehicleException 
	 * @throws SimulationException 
	 */
	@Test
	public void testEnterQueue() throws VehicleException, SimulationException {
		CarPark carPark = new CarPark(2,0,0,4);
		Car TesterCar1 = new Car("730MYD", 1, false);
		
		carPark.enterQueue(TesterCar1);
		
		assertEquals(true, TesterCar1.isQueued());
	}

	/**
	 * Test method for {@link asgn2CarParks.CarPark#exitQueue(asgn2Vehicles.Vehicle, int)}.
	 * @throws VehicleException 
	 * @throws SimulationException 
	 */
	@Test
	public void testExitQueue() throws VehicleException, SimulationException {
		CarPark carPark = new CarPark(2,0,0,4);
		Car TesterCar1 = new Car("730MYD", 1, false);
		
		carPark.enterQueue(TesterCar1);
		carPark.exitQueue(TesterCar1, 2);
		
		assertEquals(false, TesterCar1.isQueued());
		assertEquals(true, TesterCar1.wasQueued());
	}

	/**
	 * Test method for {@link asgn2CarParks.CarPark#finalState()}.
	 */
	@Test
	public void testFinalState() {
<<<<<<< HEAD
		assertTrue(true);
=======
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link asgn2CarParks.CarPark#getNumCars()}.
	 */
	@Test
	public void testGetNumCars() {
		for (int i = 0; i < 10; i++){
			Car testCar = new Car();
			
		}
	}

	/**
	 * Test method for {@link asgn2CarParks.CarPark#getNumMotorCycles()}.
	 */
	@Test
	public void testGetNumMotorCycles() {
		fail("Not yet implemented"); // TODO
>>>>>>> FETCH_HEAD
	}


	/**
	 * Test method for {@link asgn2CarParks.CarPark#getStatus(int)}.
	 */
	@Test
	public void testGetStatus() {
		assertTrue(true);
	}

	/**
	 * Test method for {@link asgn2CarParks.CarPark#initialState()}.
	 */
	@Test
	public void testInitialState() {
		assertTrue(true);
	}

	/**
	 * Test method for {@link asgn2CarParks.CarPark#numVehiclesInQueue()}.
	 */
	@Test
	public void testNumVehiclesInQueue() {
		
	}

	/**
	 * Test method for {@link asgn2CarParks.CarPark#parkVehicle(asgn2Vehicles.Vehicle, int, int)}.
	 * @throws VehicleException 
	 * @throws SimulationException 
	 */
	@Test
	public void testParkVehicle() throws VehicleException, SimulationException {
		CarPark carPark = new CarPark();
		Car TesterCar1 = new Car("730MYD", 1, false);
		carPark.parkVehicle(TesterCar1, 2, 60);
		
		assertEquals(true, TesterCar1.isParked());
		assertEquals(false, TesterCar1.isQueued());
	}



}
