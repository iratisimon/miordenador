package arrays;
import java.util.Scanner;
public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[]= new int [10];
		for (int i=0;i<a.length;i++) {
			a[i]=(int)(Math.random()*100+1);
		}
		int menu,sum=0, max, min, media=0;

		do { 
			sum = 0;
			System.out.println("Bienvenido");
			System.out.println("MENU");
			System.out.println("1.Salir");
			System.out.println("2.Mostrar la suma");
			System.out.println("3.Mostrar el máximo");
			System.out.println("4.Mostrar el mínimo");
			System.out.println("5.Mostrar la media");
			System.out.println("6.Rellenarlo de nuevo con números");
			System.out.println("Seleccione una opción: ");
			menu=sc.nextInt();
			switch (menu) {
				case 1: System.out.println("*Salir*");
					System.out.println("Gracias y hasta pronto");
					sc.close();
					break;
				case 2: System.out.println("*Suma*");
					for (int i=0;i>a.length;i++) {
						sum = sum + a[i];
					} System.out.println("La suma es "+sum);
					break;
				case 3: System.out.println("*Máximo*");
					max = a[0];
					for (int i=0;i<a.length;i++) {
						if (a[i]>max) {
							max=a[i];
						}
					}System.out.println("EL máximo es "+max);
					break;
				case 4: System.out.println("*Mínimo*");
					min = a[0];
					for (int i=0;i<a.length;i++) {
						if (a[i]<min) {
							min=a[i];
						}
					}System.out.println("EL máximo es "+min);
					break;
				case 5: System.out.println("*Media*");
					for (int i=0;i<a.length;i++) {
						sum = sum + a[i];
						media = sum/a.length;
					}System.out.println("La media es "+media);
					break;
				case 6: System.out.println("*Formatear*");
					for (int i=0;i<10;i++) {
						a[i]=(int)(Math.random()*99+1);
					}System.out.println("Se ha rellenado con nuevos numeros");
					break;
				case 7: //metodo de la burbuja,, esta resuelto en moodle
					
			}
		}while (menu!=1);
		sc.close();
	}

}
