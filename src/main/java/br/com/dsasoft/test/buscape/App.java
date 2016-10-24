package br.com.dsasoft.test.buscape;

public class App {
	public static void main(String[] args) {
		Submarine sub1 = new Submarine();// Current Location: ( 0, 0, 0 , NORTE )

		System.out.println("Current Location: " + sub1.currentLocation());

		SubmarineController controller = new SubmarineController(sub1);

		controller.processCommand("RMMLMMMDDLL");// Current Location: ( 2, 3, -2 , SUL )

		System.out.println("Current Location: " + controller.getSubmarine().currentLocation());

		controller.processCommand("UUMMMRMM");// Current Location: ( 0, 0, 0 , OESTE )

		System.out.println("Current Location: " + controller.getSubmarine().currentLocation());
	}
}
