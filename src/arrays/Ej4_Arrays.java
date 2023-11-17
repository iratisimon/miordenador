package arrays;
import java.util.Scanner;
public class Ej4_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String alumnos[]= {"Jon","Sara","Ander","Marta","Jone","Mikel"};
		int edad[]= {18,20,26,21,17,24};
		int min,menu,aux,pos;
		
		do { //para sacar dos minimos o dos maximos (tengo que cambiar los datos)
			aux=edad[0];
			pos=0;
			System.out.println("1.El alumno más joven:");
			System.out.println("2.El alumno más mayor:");
			System.out.println("Seleccione una opción");
			menu=sc.nextInt();
			
			switch (menu) {
			case 1:
				System.out.println("El alumno más joven:");
				min=edad[0];
				for (int i=1; i<alumnos.length;i++) {
					if (edad[pos]<edad[i]) {
						pos=i;
					}
				}
				
			}
			
				
				
		} while();
		
	}

}
