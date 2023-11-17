package metodos;
import  java.util.Scanner;
public class Buscar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int respuesta,num;
		int a[] = {1,2,3,4,5,6,7,8,9};
		
		respuesta=buscar(a,sc);
		if (respuesta==-1) {
			System.out.println("El número no está");
		} else {
			System.out.println("El número está en la posición "+respuesta);
		}
	}
	public static int buscar(int a[], Scanner sc) {
		int i=0, num;
		boolean encontrado=false;
		System.out.println("Introduce un número del 1 al 10");
		num =sc.nextInt();
		while (!encontrado&&i<a.length) {
			if (num==a[i]) {
				encontrado=true;
			} else {
			 i++;
			}
		}
			if (!encontrado) {
				return -1;
			} else {
				return i;
			}
	}
}
