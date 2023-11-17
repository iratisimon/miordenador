package arrays;
import java.util.Scanner;
public class Numveces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		int num;
		
		System.out.println("Introduce un número: ");
		num = sc.nextInt();
			
		while (num>=0 && num<=9) {
			a[num] = a[num]+1;
			System.out.println("Introduce un número: ");
			num = sc.nextInt();
		}
		for (int i=0;i<a.length;i++) {
		System.out.println("El número" +i+ "se ha repetido "+a[i]+ "veces");
		}
		sc.close();
	}

}
