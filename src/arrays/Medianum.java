package arrays;
import java.util.Scanner;
public class Medianum {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
		int num, i=0;
		double media=0.0;
		int a[]= new int [10];
			
		System.out.println("Introduce un valor que no sea negativo: ");
		num = sc.nextInt();
		while (num>=0 && a.length>i) { //el array en el que se van guardando los numeros
			a[i]=num;
			i++;
			media = media + a[i];
			if (i<a.length) {
			System.out.println("Introduce un valor que no sea negativo: ");
			num = sc.nextInt();
			}
		}
		media = media / i;
		System.out.println("La media es "+media);//calculo de la media
		sc.close();
		}
	}

}
