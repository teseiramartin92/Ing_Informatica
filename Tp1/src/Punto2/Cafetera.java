package Punto2;

public class Cafetera {
	private int capacidadMax;
	private int cantActual;
	
	public Cafetera() {
		capacidadMax = 1000;
		cantActual = 0;
	}

	public int getCapacidadMax() {
		return capacidadMax;
	}
	
	public void setCapacidadMax(int capacidadMax) {
		this.capacidadMax = capacidadMax;
	}
	
	public int getCantActual() {
		return cantActual;
	}
	
	public void setCantActual(int cantActual) {
		this.cantActual = cantActual;
	}
	
}
