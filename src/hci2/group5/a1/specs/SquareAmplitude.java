package hci2.group5.a1.specs;

public enum SquareAmplitude {

	SHORT(300),
	MIDIUM(500),
	LONG(700);
	
	/**
	 * In pixels
	 */
	public final int value;

	/**
	 * 
	 * @param value In pixels
	 */
	SquareAmplitude(int value) {
		this.value = value;
	}
	
	public char toAbbr() {
		return name().charAt(0);
	}
}
