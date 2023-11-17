package arrays;
import java.util.Scanner;
public class TiendaLibrosAlder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String libro[]=new String[20];
		int nuevoprecio, menu, contador=0;
		String nuevolibro, menulibro;
		String salir="";
		Scanner teclado = new Scanner(System.in);
		boolean lleno = false;
		
		libro[0]="Nada";
		libro[1]="Timidamente de la oscuridad a la luz";
		libro[2]="Pajaros a golpe";
		libro[3]="Caperucita roja";
		libro[4]="12 cuentos clásicos";
		libro[5]="Pepe y Mila";
		libro[6]="Enojaos";
		libro[7]="En casa vacia";
		libro[8]="123";
		libro[9]="Dia negro";
		libro[10]="El hobbit";
		libro[11]="Calle judia1";
		libro[12]="Calle judia2";
		libro[13]="Calle judia3";
		libro[14]="Calle judia4";
		libro[15]="Calle judia5";
		libro[16]="Calle judia6";
		libro[17]="Calle judia7";
		libro[18]="Calle judia8";
		libro[19]="Calle judia9";
		int precio [] = {12,14,17,13,15,20,21,16,18,17,21,11,0,0,0,0,0,0,40,1000};
			
			System.out.println("Bienvinido a nuestra libreria. ¿Qué desea hacer?");
		do {
			System.out.println("MENU");
			System.out.println("1.- Mostrar el título de todos los libros.");
			System.out.println("2.- Mostrar el título y el precio de todos los libros.");
			System.out.println("3.- Mostrar el precio de un libro.");
			System.out.println("4.- Introducir un nuevo libro.");
			System.out.println("5.- Eliminar un libro.");
			System.out.println("6.- Modificar el precio de un libro.");
			System.out.println("7.- Modificar el título de un libro.");
			System.out.println("8.- Salir del programa.");
			menu = teclado.nextInt();
			contador=0;
	
			switch(menu) {
			case 1: 
				while(contador<=libro.length-1 && libro[contador]!=null){
					System.out.println(libro[contador]);
					contador++;
				}
				break;
				
			case 2:
				while(contador<=libro.length-1 && libro[contador]!=null){
					System.out.println("El precio del libro "+libro[contador]+" es "+precio[contador]+"€");
					contador++;
				}	
				break;
				
			case 3:
				teclado.reset();
				teclado.nextLine();
				System.out.println("Inserte el libro cuyo precio quiere conocer");
				menulibro = teclado.nextLine();
				contador = 0;
				lleno = false;
				while (contador < libro.length && !menulibro.equalsIgnoreCase(libro[contador]) && lleno!=true) {
				    contador++;
				    if (contador == libro.length) {
				        System.out.println("El nombre del libro introducido no es correcto");
				        lleno = true;
				    }
				}
				if (!lleno) {
				    System.out.println("El precio del libro es de " + precio[contador] + "€");
				}
				break;
				
			case 4:
				teclado.reset();
				teclado.nextLine();
				contador=0;
				while(libro[contador]!=null && lleno != true) {
					if(contador==libro.length-1) {
						System.out.println("No puedes introducir mas libros, primero borre uno");
						lleno = true;
					}else {
						contador++;
						}
					}
				if(lleno != true) {
					System.out.println("Inserte un nuevo libro");
					nuevolibro=teclado.nextLine();	
					libro[contador]=nuevolibro;
					System.out.println("Inserte el precio");
					nuevoprecio=teclado.nextInt();
					precio[contador]=nuevoprecio;
					System.out.println("Libro guardado");
					}
				break;
				
			case 5://al borrar un item la lista se borra entera
				teclado.reset();
				teclado.nextLine();
				System.out.println("Inserte el libro que quiere eliminar");
				menulibro = teclado.nextLine();
				boolean encontrado = false;

				for (int i = 0; i < libro.length; i++) {
				    if (menulibro.equalsIgnoreCase(libro[i])) {
				        encontrado = true;

				        libro[i] = null;
				        precio[i] = 0;

				        for (int j = i; j < libro.length - 1; j++) {
				            libro[j] = libro[j + 1];
				            precio[j] = precio[j + 1];
				        }

				        libro[libro.length - 1] = null;
				        precio[libro.length - 1] = 0;
				        
				        System.out.println("Libro eliminado con éxito.");
				        break;
				    }
				}

				if (!encontrado) {
				    System.out.println("ERROR, el libro no se encontró en la lista.");
				}
				break;
				
			case 6:
				teclado.reset();
				teclado.nextLine();
				System.out.println("Inserte el libro cuyo precio quiere cambiar");
				menulibro=teclado.nextLine();
				contador=0;
				while(!menulibro.equalsIgnoreCase(libro[contador])&& lleno != true) {
					if(contador==libro.length) {
						System.out.println("El nombre del libro introducido no es correcto");
						lleno = true;
						}else {
							contador++;
						}
					}
				if(lleno != true){
					System.out.println("El precio del libro es de "+precio[contador]+"€");
					System.out.println("Inserte el nuevo precio");
					nuevoprecio=teclado.nextInt();
					precio[contador]=nuevoprecio;
				}
				break;
				
			case 7:
				teclado.reset();
				teclado.nextLine();
				System.out.println("Inserte el libro cuyo nombre quiere cambiar");
				menulibro=teclado.nextLine();
				contador=0;
				while(!menulibro.equalsIgnoreCase(libro[contador])&& lleno != true) {
					contador++;
					if(contador==libro.length) {
						System.out.println("El nombre del libro introducido no es correcto");
						lleno = true;
						}
					}
				if(lleno != true) {
					System.out.println("Inserte el nuevo nombre del libro");
					nuevolibro=teclado.next();
					libro[contador]=nuevolibro;
				}
				break;
				
			case 8:
				System.out.println("Gracias por hacer uso de esta libreria, vuelva pronto");
				break;
				
			default:
				System.out.println("Debes insertar un numero de los del menu");
				break;
			}
		if (menu==1 || menu==2 || menu==3 || menu==4 || menu==5 || menu==6 || menu==7) {
			System.out.println("Salir del programa (SI/NO)");
			salir=teclado.next();
			while(!salir.equalsIgnoreCase("si") && !salir.equalsIgnoreCase("no")) {
				System.out.println("Debes introducir si o no");
				System.out.println("Salir del programa (SI/NO)");
				salir=teclado.next();
			}
		}
			
		}while(menu!=8&&!salir.equalsIgnoreCase("si")); 
		teclado.close();
	}

}
