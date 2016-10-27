package br.com.dsasoft.test.buscape;

public class SubmarineController {

	final Submarine submarine;

	public SubmarineController(final Submarine submarine) {
		this.submarine = submarine;
	}

	public void processCommand(String command) {
		char[] cmds = command.toCharArray();

		for (char c : cmds) {
			switch (c) {
			case Command.RIGHT:
				if (submarine.getLocation().getOrientation().getIndex() == Orientation.NORTH.getIndex())
					submarine.getLocation().setOrientation(Orientation.EAST);
				else if (submarine.getLocation().getOrientation().getIndex() == Orientation.EAST.getIndex())
					submarine.getLocation().setOrientation(Orientation.SOUTH);
				else if (submarine.getLocation().getOrientation().getIndex() == Orientation.SOUTH.getIndex())
					submarine.getLocation().setOrientation(Orientation.WEST);
				else if (submarine.getLocation().getOrientation().getIndex() == Orientation.WEST.getIndex())
					submarine.getLocation().setOrientation(Orientation.NORTH);
				break;
			case Command.LEFT:
				if (submarine.getLocation().getOrientation().getIndex() == Orientation.NORTH.getIndex())
					submarine.getLocation().setOrientation(Orientation.WEST);
				else if (submarine.getLocation().getOrientation().getIndex() == Orientation.WEST.getIndex())
					submarine.getLocation().setOrientation(Orientation.SOUTH);
				else if (submarine.getLocation().getOrientation().getIndex() == Orientation.SOUTH.getIndex())
					submarine.getLocation().setOrientation(Orientation.EAST);
				else if (submarine.getLocation().getOrientation().getIndex() == Orientation.EAST.getIndex())
					submarine.getLocation().setOrientation(Orientation.NORTH);
				break;
			case Command.UP:
				submarine.getLocation().getPosition().setZ(submarine.getLocation().getPosition().getZ() + 1);
				break;

			case Command.DOWN:
				submarine.getLocation().getPosition().setZ(submarine.getLocation().getPosition().getZ() - 1);
				break;

			case Command.MOVE:
				if (submarine.getLocation().getOrientation() == Orientation.NORTH)
					submarine.getLocation().getPosition().setY(submarine.getLocation().getPosition().getY() + 1);
				else if (submarine.getLocation().getOrientation() == Orientation.SOUTH)
					submarine.getLocation().getPosition().setY(submarine.getLocation().getPosition().getY() - 1);
				else if (submarine.getLocation().getOrientation() == Orientation.EAST)
					submarine.getLocation().getPosition().setX(submarine.getLocation().getPosition().getX() + 1);
				else if (submarine.getLocation().getOrientation() == Orientation.WEST)
					submarine.getLocation().getPosition().setX(submarine.getLocation().getPosition().getX() - 1);
				break;

			default:
				break;
			}
		}
	}

	public Submarine getSubmarine() {
		return submarine;
	}
}
