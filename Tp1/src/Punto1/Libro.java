package Punto1;

public class Libro {
	private String titulo;
	private String autor;
	private String editorial;
	private String a�oPublicacion;
	private double precio;
	private int cantidadHojas;
	private int codigo;
	
	public Libro() {
		
	}

	public Libro(String titulo, String autor, String editorial, String a�oPublicacion, double precio, int cantidadHojas,
			int codigo) {
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.a�oPublicacion = a�oPublicacion;
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

	public String getA�oPublicacion() {
		return a�oPublicacion;
	}

	public void setA�oPublicacion(String a�oPublicacion) {
		this.a�oPublicacion = a�oPublicacion;
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
	    return " { titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial + ", a�oPublicacion=" + a�oPublicacion +
	           ", precio=" + precio + ", cantidadHojas=" + cantidadHojas + ", codigo=" + codigo + "}";
	}	
	
}
