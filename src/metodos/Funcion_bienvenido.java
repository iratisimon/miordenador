package metodos;
import java.util.Scanner;
public class Funcion_bienvenido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String nombre;
		int edad;
		double altura;
		
		System.out.println("Introduce tu nombre: ");
		nombre=sc.next();
		System.out.println("Introduce tu edad");
		edad=sc.nextInt();
		System.out.println("Introduce tu altura");
		altura=sc.nextDouble();
		
		if (return==false) {
			System.out.println("No tienes acceso al sistema");
		}else {
			System.out.println("Tienes acceso al sistema");
		}

	}
	public static boolean bienvenida(String nombre, int edad, double altura) {
		System.out.println("Hola "+nombre);
		if (edad<18) {
			return false;
		} else {
			if (altura < 160) {
				return false;
			}else {
				return true;
			}
		}
		
	}
}
