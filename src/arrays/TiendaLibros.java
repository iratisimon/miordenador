package arrays;
import java.util.Scanner;
public class TiendaLibros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String libro[]= {"Nada","Tímidamente de la oscuridad a la luz","Pájaros a golpes","Caperucita Roja","12 cuentos clásicos", "Pepe y Mila","Enojaos","En casa vacía","123","Día Negro","El Hobbit","Calle Judía",null,null,null,null,null,null,null,null};
		int precio[]= {15,12,15,25,19,17,25,13,11,18,25,35,0,0,0,0,0,0,50,100};
		int menu,precio1,i=0;
		String respuesta=null,titulo,titulo1;
		boolean encontrado=false;
		
		do { //aprender como salir del bucle sin preguntar si quire continuar en cada case! = es con un if alfinal del bucle,,mirar la solucion de elbire
			encontrado=false; 
			i=0; 
			System.out.println("Bienvenido");
			System.out.println("MENU");
			System.out.println("1.Mostrar el título de todos los libros");
			System.out.println("2.Mostrar el título y el precio de todos los libros");
			System.out.println("3.Mostrar el precio de un libro");
			System.out.println("4.Introducir un nuevo libro");
			System.out.println("5.Eliminar un libro");
			System.out.println("6.Modificar el precio de un libro");
			System.out.println("7.Modificar el título de un libro");
			System.out.println("8.Salir del programa");
			System.out.println("Seleccione una opción: ");
			menu=sc.nextInt();
			switch (menu) {
				case 1: System.out.println("Estos son todos los libros de la tienda: ");
					for ( i=0;i<libro.length;i++) {
						if (libro[i]!=null) {
							System.out.println(libro[i]);
						}
					}System.out.println("¿Quieres continuar en el programa? si/no");
					respuesta=sc.next();
					break;
				case 2: System.out.println("Estos son todos los títulos y los precios de los libros:");
					for ( i=0;i<libro.length;i++) {
						if (libro[i]!=null) {
							System.out.println("Titulo "+libro[i]+" precio "+ precio[i]);
						}
					}System.out.println("¿Quieres continuar en el programa? si/no");
					respuesta=sc.next();
					break;
				case 3: 
					sc.reset();
					sc.nextLine();
					System.out.println("¿Cúal es el título del libro?");
					titulo=sc.nextLine();
					while(!encontrado){
						if (libro[i]==null)
								encontrado=true;
						else if (libro[i].equals(titulo)) { // mejor asi: else if (titulo.equals(libro[i)) 
						System.out.println("El precio del libro "+titulo+" es "+precio[i]+" euros.");
						encontrado=true;
						}
						else i++;
					}System.out.println("¿Quieres continuar en el programa? si/no");
					respuesta=sc.next();
					break;
				case 4: 
					sc.reset();
					sc.nextLine();
					System.out.println("¿Cúal es el título del libro?");
					titulo=sc.nextLine();
					System.out.println("¿Cúal es el precio del libro?");
					precio1=sc.nextInt(); 
					while(i<libro.length&&!encontrado) {
						if (libro[i]==null) {
							libro[i]=titulo;
							precio[i]=precio1;
							System.out.println("El libro ha sido guardado.");
							encontrado=true;
						}i++;
					}
					if (!encontrado) {
						System.out.println("Tienes muchos libros en la tienda, elimina un libro.");
					}
				
					System.out.println("¿Quieres continuar en el programa? si/no");
					respuesta=sc.next();
					break;
				case 5: //no me queda claro la correcion,,preguntar a alguien
					sc.reset();
					sc.nextLine();
					System.out.println("¿Cúal es el título del libro?");
					titulo=sc.nextLine();
					while(i<libro.length&&!encontrado) {
						if (libro[i].equals(titulo)) {
							libro[i]=null;
							encontrado=true;
							System.out.println("El libro ha sido eliminado.");
						} i++;
					}System.out.println("¿Quieres continuar en el programa? si/no");
					respuesta=sc.next();
					break;
				case 6:
					sc.reset();
					sc.nextLine();
					System.out.println("¿Cúal es el título del libro?");
					titulo=sc.nextLine();
					while (i<libro.length&&!encontrado) {
						if (libro[i].equalsIgnoreCase(titulo)) {
							System.out.println("El precio del libro "+titulo+" son "+precio[i]+" €");
							System.out.println("¿Cúal es el nuevo precio del libro?");
							precio1=sc.nextInt();
							precio[i]=precio1;
							System.out.println("El precio ha sido cambiado");
							System.out.println("El nuevo precio del libro "+titulo+" son "+precio[i]+" €");
							encontrado=true;
						} i++;
					}System.out.println("¿Quieres continuar en el programa? si/no");
					respuesta=sc.next();
					break;
				case 7:		
					sc.reset();
					sc.nextLine();
					System.out.println("¿Cúal es el título del libro?");
					titulo=sc.nextLine();
					while (i<libro.length&&!encontrado) {
						if (libro[i].equals(titulo)) {
							sc.reset();
							sc.nextLine();
							System.out.println("¿Cúal es el nuevo título del libro?");
							titulo1=sc.nextLine();
							libro[i]=titulo1;
							System.out.println("EL título ha sido modificado");
							System.out.println("El nuevo titulo del libro "+titulo+" es "+titulo1);
							encontrado=true;
						} i++;
					}System.out.println("¿Quieres continuar en el programa? si/no");
					respuesta=sc.next();
					break;
				case 8: 
					respuesta="no";
		}
	}while (respuesta.equalsIgnoreCase("si"));
			System.out.println("Gracias y hasta pronto");
		
			sc.close();
	}
}
