package Punto1;

import java.util.Scanner;
import java.util.Random;

public class PrincipalPto1 {

    public static void main(String[] args) {
    	Libro[] biblioteca = new Libro[8];
        biblioteca[0] = new Libro("Libro 1", "Autor 1", "Editorial 1", "2023", 290.99, 300, 12345);
        biblioteca[1] = new Libro("Libro 2", "Autor 2", "Editorial 2", "2005", 350.50, 250, 67890);
        biblioteca[2] = new Libro("Libro 3", "Autor 3", "Editorial 3", "1990", 200, 400, 52648);
        biblioteca[3] = new Libro("Libro 4", "Autor 4", "Editorial 4", "2022", 300.80, 320, 85469);
        biblioteca[4] = new Libro("Libro 5", "Autor 5", "Editorial 5", "2010", 460.33, 150, 14325);
        biblioteca[5] = new Libro("Libro 6", "Autor 6", "Editorial 6", "2014", 200.55, 400, 97854);
        biblioteca[6] = new Libro("Libro 7", "Autor 7", "Editorial 7", "1998", 600, 385, 12345);
        biblioteca[7] = new Libro("Libro 8", "Autor 8", "Editorial 8", "1995", 540.12, 336, 14059);
        Libro[] libros = new Libro[3];
        Scanner input = new Scanner(System.in);
    	int opcion = 0;
    	while (opcion != 6) {
    		opcion = menu(input);
    		switch (opcion) {
			case 1:
		        libros[0] = crearLibro("CREAR 1° LIBRO");
		        libros[1] = crearLibro("CREAR 2° LIBRO");
		        libros[2] = crearLibro("CREAR 3° LIBRO");
		        mostrarLibros(libros[0], libros[1], libros[2]);
				break;
			case 2:
				libros = crearLibrosAlAzar(biblioteca);
		        mostrarLibros(libros[0], libros[1], libros[2]);
				break;
			case 3:
				if(librosCargados(libros)) { // verifico que primero se hayan cargado los libros.
					System.out.println("El libro mas caro es: " + libroMasCaro(libros[0], libros[1], libros[2]));
				} else {
					System.out.println("Primero debe cargar los libros!");
				}
				break;
			case 4:
				if(librosCargados(libros)) {
					System.out.println("El libro con menos hojas es: " + libroConMenosHojas(libros[0], libros[1], libros[2]));
				} else {
					System.out.println("Primero debe cargar los libros!");
				}
				break;
			case 5:
				if(librosCargados(libros)) {
					Libro libroEncontrado = buscarPorCodigo(libros[0], libros[1], libros[2]);
					if(libroEncontrado != null) {
						System.out.println("El Libro es: " + libroEncontrado.mostrarTituloAutorEditorial());
					}else {
						System.out.println("El libro no existe!");
					}
				} else {
					System.out.println("\nPrimero debe cargar los libros!\n");
				}
				break;
			case 6:
				System.out.println("Fin del Programa!");
				break;
			default:
				System.out.println("Opción Incorrecta!");
				break;
			}
		}
    }
    
    public static Libro[] crearLibrosAlAzar(Libro[] biblioteca) {
        Random rand = new Random();
        Libro[] librosSeleccionados = new Libro[3];

        // Seleccionar tres libros al azar
        for (int i = 0; i < 3; i++) {
            int indice = rand.nextInt(biblioteca.length);
            librosSeleccionados[i] = biblioteca[indice];
        }

        return librosSeleccionados;
    }
    
    public static int menu(Scanner input) {
		System.out.println("Menú de Opciones");
		System.out.println("------------------");
		System.out.println("1) Ingresar Libros Manualmente");
		System.out.println("2) Ingresar Libros Al Azar");
		System.out.println("3) Mostrar Libro más caro");
		System.out.println("4) Mostrar Libro con menos hojas");
		System.out.println("5) Buscar libro por código ISBN");
		System.out.println("6) Salir");
		return Helper.validarEntero(input, "Seleccione una opción: ");
    }
    
    public static Libro crearLibro(String mensaje) {
        Libro nuevoLibro = new Libro();
        Scanner input = new Scanner(System.in);
        System.out.println(mensaje);
        System.out.println("------------");
        System.out.println("Ingrese título del libro: ");
        nuevoLibro.setTitulo(input.nextLine());
        System.out.println("Ingrese autor del libro: ");
        nuevoLibro.setAutor(input.nextLine());
        System.out.println("Ingrese editorial: ");
        nuevoLibro.setEditorial(input.nextLine());
        System.out.println("Ingrese año de publicación: ");
        nuevoLibro.setAñoPublicacion(input.nextLine());
        nuevoLibro.setPrecio(Helper.validarDecimal(input, "Ingrese precio: "));
        nuevoLibro.setCantidadHojas(Helper.validarEntero(input, "Ingrese cantidad de hojas: "));
        nuevoLibro.setCodigo(Helper.validarEntero(input, "Ingrese código ISBN: "));

        return nuevoLibro;
    }
    
    public static void mostrarLibros(Libro libro1, Libro libro2, Libro libro3) {
        System.out.println("");
    	System.out.println("Libro 1: " + libro1);
        System.out.println("Libro 2: " + libro2);
        System.out.println("Libro 3: " + libro3);
    }
    
    public static boolean librosCargados(Libro[] libros) {
        for (Libro libro : libros) {
            if (libro != null) {
                return true;
            }
        }
        return false;
    }
    
    public static Libro libroMasCaro(Libro libro1, Libro libro2, Libro libro3) {
        Libro mayor = new Libro();
    	if(libro1.getPrecio() > libro2.getPrecio() & libro1.getPrecio() > libro3.getPrecio()) {
        	mayor = libro1;
        } else if (libro2.getPrecio() > libro1.getPrecio() & libro2.getPrecio() > libro3.getPrecio()){
        	mayor = libro2;
        } else if (libro3.getPrecio() > libro1.getPrecio() & libro3.getPrecio() > libro2.getPrecio()){
        	mayor = libro3;
        }
    	
        return mayor;
    }
    
    public static Libro libroConMenosHojas(Libro libro1, Libro libro2, Libro libro3) {
        Libro menor = new Libro();
    	if(libro1.getCantidadHojas() < libro2.getCantidadHojas() & libro1.getCantidadHojas() < libro3.getCantidadHojas()) {
    		menor = libro1;
        } else if (libro2.getCantidadHojas() < libro1.getCantidadHojas() & libro2.getCantidadHojas() < libro3.getCantidadHojas()){
        	menor = libro2;
        } else if (libro3.getCantidadHojas() < libro1.getCantidadHojas() & libro3.getCantidadHojas() < libro2.getCantidadHojas()){
        	menor = libro3;
        }
    	
        return menor;
    }
    
    public static Libro buscarPorCodigo(Libro libro1, Libro libro2, Libro libro3) {
    	Scanner input = new Scanner(System.in);
    	int codigo = Helper.validarEntero(input, "Ingrese el código ISBN: ");
    	if(libro1.getCodigo() == codigo) {
    		return libro1;
        } else if (libro2.getCodigo() == codigo){
        	return libro2;
        } else if (libro3.getCodigo() == codigo){
        	return libro3;
        }else {
        	return null;
        }
    }
}
