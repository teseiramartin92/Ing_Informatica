package Punto1;
import java.util.Scanner;

public class Helper {
	
	public static int validarEntero(Scanner input, String mensaje) {
		int numero;
		String valorIngresado;
		while (true) {
			try {				
				System.out.println(mensaje);
				valorIngresado = input.nextLine();
				numero = Integer.parseInt(valorIngresado);
				break;
			} catch (Exception e) {
				System.out.println("Error!! Debe Ingresar un número");
			}
		}
		return numero;
	}
	
	public static double validarDecimal(Scanner input, String mensaje) {
		double numero;
		String valorIngresado;
		while (true) {
			try {				
				System.out.println(mensaje);
				valorIngresado = input.nextLine();
				numero = Double.parseDouble(valorIngresado);
				break;
			} catch (Exception e) {
				System.out.println("Error!! Debe Ingresar un número");
			}
		}
		return numero;
	}
	
}
