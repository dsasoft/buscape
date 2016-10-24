package br.com.dsasoft.test.buscape;

import org.junit.Assert;
import org.junit.Test;

public class SubmarineControllerTest {

	private final String mockProcessedOutput = "( 2, 3, -2 , SUL )";

	private final String mockCommand = "RMMLMMMDDLL";
	
	private Submarine mockSubmarine = new Submarine();
	
	private SubmarineController controller;
	
	private void givenSubmarineAndController(){
		mockSubmarine = new Submarine();
		controller = new SubmarineController(mockSubmarine);
	}

	@Test
	public void assertProcessCommand() {
		givenSubmarineAndController();
		controller.processCommand(mockCommand);
		Assert.assertEquals(mockSubmarine.currentLocation(), mockProcessedOutput);
	}
}
