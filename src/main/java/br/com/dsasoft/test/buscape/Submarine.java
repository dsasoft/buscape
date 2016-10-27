package br.com.dsasoft.test.buscape;

public class Submarine {

	private final Location location;

	public Submarine() {
		location = new Location(Orientation.NORTH, new Position(0));
	}

	public Location getLocation() {
		return location;
	}

	public String currentLocationAsString() {
		return "(" + location.getPosition() + ", " + location.getOrientation().getPtBRName() + " )";
	}
}
