package arrays;
import java.util.Scanner;
public class Ej2_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String nombre[]= {"María","Markel","María","Lucía","Iker"};
		String nombre1;
		int menu, contador=0,i=0;
		boolean encontrado=false;
		do { 
			encontrado=false;
			System.out.println(" ");
			System.out.println("Bienvenido");
			System.out.println("MENU");
			System.out.println("1.Salir");
			System.out.println("2.Mostrar lista");
			System.out.println("3.Pedir un nombre y contar las veces que aparece");
			System.out.println("4.Pedir un nombre y decir si existe");
			System.out.println("5.Eliminar");
			System.out.println("Seleccione una opción: ");
			menu=sc.nextInt();
			switch (menu) {
				case 1: System.out.println("*Salir*");
					System.out.println("Gracias y hasta pronto");
					break;
				case 2: System.out.println("*Mostrar lista*");
					for ( i=0;i<nombre.length;i++) {
						if (nombre[i]!=null) {
							System.out.println(nombre[i]);
						}
					}break;
				case 3: 
					sc.reset();
					sc.nextLine();
					System.out.println("Introduce un nombre: ");
					nombre1 = sc.nextLine().toLowerCase();
					for ( i=0;i<nombre.length;i++) {
						if (nombre[i].equals(nombre1)){
							contador++;
						}
					} System.out.println("El nombre "+nombre1+" se repite "+contador+" veces.");
					break;
				case 4: //no me funcionaaaaaa!
					sc.reset();
					sc.nextLine();
					System.out.println("Introduce un nombre: ");
					nombre1 = sc.nextLine();
					while (i<nombre.length&&!encontrado) {
						if (nombre1.equals(nombre[i])) {
							encontrado=true;
						} else {
							i++;
						}
					}
					if (encontrado) {
						System.out.println("El nombre introducido sí exite");
					}else {
						System.out.println("El nombre no existe");
					}break;
				case 5: System.out.println("¿Cúal es el nomnre que quiere borrar?");
					nombre1= sc.next();
					while(i<nombre.length&&!encontrado) {
						if (nombre[i].equals(nombre1)) {
							nombre[i]=null;
							encontrado=true;
							System.out.println("El nombre ha sido eliminado.");
						}
					}break;
			}
		}while(menu!=1);
	}

}
