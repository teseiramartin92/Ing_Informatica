
public class Estudiante {
	private int dni;
	private String nombre;
	private String correo;
	
	private int lu = 1234;
	
	public Estudiante() {
		
	}
	
	public Estudiante(int dni, String nombre, String correo, int lu) {
		this.dni = dni;
		this.nombre = nombre;
		this.correo = correo;
		this.lu = lu;
	}
	
	public Estudiante(int dni) {
		this.dni = dni;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getLu() {
		return lu;
	}

	public void setLu(int lu) {
		this.lu = lu;
	}

	public void solicitarAnalitico() {
		System.out.println("Analitico terminado");
	}

	@Override
	public String toString() {
		return "Estudiante [dni=" + dni + ", nombre=" + nombre + ", correo=" + correo + ", lu=" + lu + "]";
	}	
	
}
