package robot;

public class Tablero {
	private int columnasX;
	private int filasX;
	
	public Tablero(int tamaņoColumna, int tamaņoFila) {
		this.columnasX = tamaņoColumna;
		this.filasX = tamaņoFila;
	}
	
	public int getFilasX() {
		return filasX;
	}

	public int getColumnasX() {
		return columnasX;
	}
}
