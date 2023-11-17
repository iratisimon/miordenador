package arrays;
import java.util.Scanner;
public class Mediatem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int temp[]=new int[10];
		int grados,i=0,total=0;
		double media = 0.0;
		
		System.out.println("Introduce la temperatura");
		grados=sc.nextInt();
		while (grados>-999 && temp.length>i) {
			temp[i]=grados;
			i++;
			media = media + temp[i];
			if (i < temp.length) {
			System.out.println("Introduce la temperatura");
			grados=sc.nextInt();
			}
		}
		media = media / i;
		System.out.println("La media es: "+media);
		for (i=0;i<temp.length;i++) {
			if (temp[i]>media) {
				total = i + total;
				System.out.println("Las temperaturas mayores a la media son: "+total);
			} else if (temp[i] == media) {
				total = i + total;
			System.out.println("Las temperaturas igual a la media son: "+total);
			}else {
				total = i + total;
				System.out.println("Las temperaturas menores a la media son: "+total);
			}
		}
		sc.close();
	}

}
