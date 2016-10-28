package br.com.dsasoft.test.buscape;

public class SubmarineController {

	final Submarine submarine;

	public SubmarineController(final Submarine submarine) {
		this.submarine = submarine;
	}

	/**
	 * Change the Submarine Location, based on X, Y, Z Position 
	 * and ( NORTH, SOUTH, EAST, WEST ) Orientation.
	 * <BR/> 
	 * @param command : String with following commands. e.g. RMMLMMMDDLL
	 * <br/> //--- Orientation
	 * <br/> R : Right
	 * <br/> L : Left
	 * <br/> //--- Position
	 * <br/> U : Up
	 * <br/> D : Down
	 * <br/> M : Move
	 * */
	public void processCommand(String command) {
		char[] cmds = command.toCharArray();

		for (char c : cmds) {
			switch (c) {
			case Command.RIGHT:
				turnRight();
				break;
			case Command.LEFT:
				turnLeft();
				break;
			case Command.UP:
				moveUp();
				break;
			case Command.DOWN:
				moveDown();
				break;
			case Command.MOVE:
				move();
				break;
			default:
				break;
			}
		}
	}

	private void turnRight() {
		if (submarine.getLocation().getOrientation().getIndex() == Orientation.NORTH.getIndex())
			submarine.getLocation().setOrientation(Orientation.EAST);
		else if (submarine.getLocation().getOrientation().getIndex() == Orientation.EAST.getIndex())
			submarine.getLocation().setOrientation(Orientation.SOUTH);
		else if (submarine.getLocation().getOrientation().getIndex() == Orientation.SOUTH.getIndex())
			submarine.getLocation().setOrientation(Orientation.WEST);
		else if (submarine.getLocation().getOrientation().getIndex() == Orientation.WEST.getIndex())
			submarine.getLocation().setOrientation(Orientation.NORTH);
	}

	private void turnLeft() {
		if (submarine.getLocation().getOrientation().getIndex() == Orientation.NORTH.getIndex())
			submarine.getLocation().setOrientation(Orientation.WEST);
		else if (submarine.getLocation().getOrientation().getIndex() == Orientation.WEST.getIndex())
			submarine.getLocation().setOrientation(Orientation.SOUTH);
		else if (submarine.getLocation().getOrientation().getIndex() == Orientation.SOUTH.getIndex())
			submarine.getLocation().setOrientation(Orientation.EAST);
		else if (submarine.getLocation().getOrientation().getIndex() == Orientation.EAST.getIndex())
			submarine.getLocation().setOrientation(Orientation.NORTH);
	}

	private void moveUp() {
		submarine.getLocation().getPosition().setZ(submarine.getLocation().getPosition().getZ() + 1);
	}

	private void moveDown() {
		submarine.getLocation().getPosition().setZ(submarine.getLocation().getPosition().getZ() - 1);
	}

	private void move() {
		if (submarine.getLocation().getOrientation() == Orientation.NORTH)
			submarine.getLocation().getPosition().setY(submarine.getLocation().getPosition().getY() + 1);
		else if (submarine.getLocation().getOrientation() == Orientation.SOUTH)
			submarine.getLocation().getPosition().setY(submarine.getLocation().getPosition().getY() - 1);
		else if (submarine.getLocation().getOrientation() == Orientation.EAST)
			submarine.getLocation().getPosition().setX(submarine.getLocation().getPosition().getX() + 1);
		else if (submarine.getLocation().getOrientation() == Orientation.WEST)
			submarine.getLocation().getPosition().setX(submarine.getLocation().getPosition().getX() - 1);
	}

	public Submarine getSubmarine() {
		return submarine;
	}
}
