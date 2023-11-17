package metodos;
import java.util.Scanner;
public class Buscar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num,respuesta;
		int a[] = {1,2,3,4,5,6,7,8,9,10};
	
		System.out.println("Introduce un número del 1 al 10");
		num = sc.nextInt();
		
		respuesta=buscar(a,num);
		if (respuesta==-1) {
			System.out.println("El número no está");
		} else {
			System.out.println("El nuúmero está en la posición "+respuesta);
		}
		
		sc.close();
	}
	public static int buscar(int a[], int num) {
		int i=0;
		boolean encontrado=false;
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
