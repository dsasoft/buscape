package br.com.dsasoft.test.buscape;

public class Submarine {

	private Orientation orientation;
	private Position position;

	public Submarine() {
		this.orientation = Orientation.NORTH;
		this.position = new Position(0);
	}

	public Orientation getOrientation() {
		return orientation;
	}

	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public String currentLocation() {
		return "(" + position.toString() + ", " + orientation.getPtBRName() + " )";
	}
}
