package Punto6;

public class Alumno extends Persona{
	private int lu;
	private String carrera;
	
	public Alumno() {
		
	}
	public Alumno(String nombre, int dni, int lu, String carrera) {
		super(nombre, dni);
		this.lu=lu;
		this.carrera=carrera;
	}
	public int getLu() {
		return lu;
	}
	public void setLu(int lu) {
		this.lu = lu;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	@Override
	public String toString() {
		return "Alumno [lu=" + lu + ", carrera=" + carrera + ", "+ super.toString() + "]";
	}
	
	
}
