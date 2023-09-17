package Punto1;

public class Libro {
	private String titulo;
	private String autor;
	private String editorial;
	private String añoPublicacion;
	private double precio;
	private int cantidadHojas;
	private int codigo;
	
	public Libro() {
		
	}

	public Libro(String titulo, String autor, String editorial, String añoPublicacion, double precio, int cantidadHojas,
			int codigo) {
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.añoPublicacion = añoPublicacion;
		this.precio = precio;
		this.cantidadHojas = cantidadHojas;
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getAñoPublicacion() {
		return añoPublicacion;
	}

	public void setAñoPublicacion(String añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidadHojas() {
		return cantidadHojas;
	}

	public void setCantidadHojas(int cantidadHojas) {
		this.cantidadHojas = cantidadHojas;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String mostrarTituloAutorEditorial() {
	    return "\nTitulo: " + titulo + "\nAutor: " + autor + "\nEditorial: " + editorial + "\n";
	}

	@Override
	public String toString() {
	    return " { titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial + ", añoPublicacion=" + añoPublicacion +
	           ", precio=" + precio + ", cantidadHojas=" + cantidadHojas + ", codigo=" + codigo + "}";
	}	
	
}
