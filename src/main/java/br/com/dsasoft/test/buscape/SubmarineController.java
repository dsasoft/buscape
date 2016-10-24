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
				if (submarine.getOrientation().getIndex() == Orientation.NORTH.getIndex())
					submarine.setOrientation(Orientation.EAST);
				else if (submarine.getOrientation().getIndex() == Orientation.EAST.getIndex())
					submarine.setOrientation(Orientation.SOUTH);
				else if (submarine.getOrientation().getIndex() == Orientation.SOUTH.getIndex())
					submarine.setOrientation(Orientation.WEST);
				else if (submarine.getOrientation().getIndex() == Orientation.WEST.getIndex())
					submarine.setOrientation(Orientation.WEST);
				break;
			case Command.LEFT:
				if (submarine.getOrientation().getIndex() == Orientation.NORTH.getIndex())
					submarine.setOrientation(Orientation.WEST);
				else if (submarine.getOrientation().getIndex() == Orientation.WEST.getIndex())
					submarine.setOrientation(Orientation.SOUTH);
				else if (submarine.getOrientation().getIndex() == Orientation.SOUTH.getIndex())
					submarine.setOrientation(Orientation.EAST);
				else if (submarine.getOrientation().getIndex() == Orientation.EAST.getIndex())
					submarine.setOrientation(Orientation.NORTH);
				break;
			case Command.UP:
				submarine.getPosition().setZ(submarine.getPosition().getZ() + 1);
				break;

			case Command.DOWN:
				submarine.getPosition().setZ(submarine.getPosition().getZ() - 1);
				break;

			case Command.MOVE:
				if (submarine.getOrientation() == Orientation.NORTH)
					submarine.getPosition().setY(submarine.getPosition().getY() + 1);
				else if (submarine.getOrientation() == Orientation.SOUTH)
					submarine.getPosition().setY(submarine.getPosition().getY() - 1);
				else if (submarine.getOrientation() == Orientation.EAST)
					submarine.getPosition().setX(submarine.getPosition().getX() + 1);
				else if (submarine.getOrientation() == Orientation.WEST)
					submarine.getPosition().setX(submarine.getPosition().getX() - 1);
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
