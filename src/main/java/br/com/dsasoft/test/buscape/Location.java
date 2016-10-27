package br.com.dsasoft.test.buscape;

public class Location {
	private Orientation orientation;
	private Position position;

	public Location(final Orientation orientation, final Position position) {
		this.orientation = orientation;
		this.position = position;
	}

	public Orientation getOrientation() {
		return orientation;
	}

	public Position getPosition() {
		return position;
	}

	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

}
