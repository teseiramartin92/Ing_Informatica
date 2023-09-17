import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Estudiante estudiante1 = new Estudiante();
		
		System.out.println(estudiante1.getLu());
		estudiante1.setDni(36048679);
		System.out.println(estudiante1.getDni());
		
		Estudiante estudiante2 = new Estudiante(4536123);
		Estudiante estudiante3 = new Estudiante(36048679, "martin", "teseiramartin@gmail.com", 2720);
		
		System.out.println("DNI del estudiante 2: " + estudiante2.getDni());
		System.out.println(estudiante3);
	}

}
