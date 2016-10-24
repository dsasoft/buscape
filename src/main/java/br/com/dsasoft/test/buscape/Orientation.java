package br.com.dsasoft.test.buscape;

public enum Orientation {

	NORTH("NORTE", 1), SOUTH("SUL", 2), EAST("LESTE", 3), WEST("OESTE", 4);

	private String ptBRName;
	private int index;

	private Orientation(String name, int index) {
		ptBRName = name;
		this.index = index;
	}

	public String getPtBRName() {
		return ptBRName;
	}

	public int getIndex() {
		return index;
	}

}
