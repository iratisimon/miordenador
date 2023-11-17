package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Una empresa paga a sus N emplead@s en base a las horas trabajadas en la
		 * semana.
		 * Para esto por cada empleado se pide, el nº de días que ha trabajado en la
		 * semana
		 * y las horas que ha trabajado cada día @. Realiza un programa para determinar
		 * el sueldo semanal de cada trabajador@ y además, calcule cuánto pagó la
		 * empresa por los N emplead@s.
		 * Tendrás que tener en cuenta que:
		 * 
		 * El precio de la hora de trabajo, es la misma para tod@s l@s empleados 45,56€.
		 * Si las horas trabajadas por un trabajador son superiores a 8 en el día, serán
		 * consideradas como extras,
		 * por lo que cobrara por cada hora extra un 3% más, siempre y cuando su sueldo
		 * total semanal no sea superior
		 * en un 30%, al que le corresponde sin horas extras.
		 */

		// Activamos el lector
		Scanner lector = new Scanner(System.in);

		// Declaramos variables
		int num_dias, horas_trabajadas = 0, num_empleados, cont = 1, extras_dia;
		double calculo_salario_trabajadores = 0, sueldo_semanal = 0, sueldo_dia = 0, precio_extra_totales;
		String opc;

		// Declaramos constantes
		final double HORA_TRABAJO_NORMAL = 45.56; // Precio de la hora ordinaria
		final double HORA_TRABAJO_EXTRA = 46.92; // Precio de la hora extra
		final int HORAS_DIA_NORMAL = 8; // Jornada ordinaria
		final double MAX_SUELDO = 2369.12; // Maximo sueldo con extras que puedes tener
		final double SUELDO_SEMANAL_REFERENCIA = 1822.4; // Salario de 40 horas sin extras | 5 dias laborales

		// Valores por defecto para pruebas sin intervencion de usuario.
		// num_empleados = 5;
		// num_dias = 5;
		// horas_trabajadas = 12;

		// Obtenemos los datos del usuario
		System.out.println("¿Cuantos empleados hay en la empresa?");
		num_empleados = lector.nextInt();
		do {
			// hacer que no pregunte de nuevo por si ha trabajado toda la semana
			System.out.printf("Empleado Nº: %d\n", cont);
			System.out.println("-----------------------");
			System.out.println("Ha trabajado toda la semana/horas ordinarias, ¿sin extras?: s/n");
			opc = lector.next();
			if (opc.equalsIgnoreCase("s")) {
				calculo_salario_trabajadores += SUELDO_SEMANAL_REFERENCIA;
				// System.out.println(SUELDO_SEMANAL_REFERENCIA);
				cont++;
			} else if (opc.equalsIgnoreCase("n")) {
				do {
					System.out.printf("Numero de dias trabajados: ");
					num_dias = lector.nextInt();
					// De esta manera no sale el mensaje el mensaje cuando es correcto
					if (num_dias <= 0) {
						System.out.println("Introduce valores correctos, la jornada laboral debe ser de min. 1 dia");
					}
				} while (num_dias <= 0 || (num_dias>7));
				for (int i = 1; i <= num_dias; i++) {
					// Horas trabajadas siempre >0 porque no tenemos en cuenta los dias que no se
					// trabaja.
					System.out.printf("Horas del dia %d trabajadas: ", i);
					horas_trabajadas = lector.nextInt();
					if ((horas_trabajadas <= 0)||(horas_trabajadas>20)) {
						System.out.println("Introduce valores correctos la jornada laboral debe ser de min. 1 hr");
						i--;
					} else if (horas_trabajadas > HORAS_DIA_NORMAL) {
						sueldo_dia = HORAS_DIA_NORMAL * HORA_TRABAJO_NORMAL;
						extras_dia = horas_trabajadas - HORAS_DIA_NORMAL;
						precio_extra_totales = (double) extras_dia * HORA_TRABAJO_EXTRA;
						sueldo_dia += precio_extra_totales;
						sueldo_semanal += sueldo_dia;
						 

					} else { // cuando se trabajan menos de 8 horas
						sueldo_dia = horas_trabajadas * HORA_TRABAJO_NORMAL;
						sueldo_semanal += sueldo_dia;
						
					}
				}
				// Extra es superior al 30% del sueldo
				if (sueldo_semanal > MAX_SUELDO) {
					System.out.println("Sus horas extras han sobrepasado el 30% del sueldo semanal");
					sueldo_semanal = MAX_SUELDO;
					calculo_salario_trabajadores += sueldo_semanal;
				}	
				calculo_salario_trabajadores += sueldo_semanal;
				
				cont++;
				sueldo_semanal = 0;

			} else 
				System.out.println("No ha introducido ningun valor requerido");
		} while (cont <= num_empleados);

		// Salida de los valores finales
		System.out.printf("Los trabajadores son %d y tienen un coste en salario de %.2f euros", num_empleados,
				calculo_salario_trabajadores);

		// Cerramos el lector de teclado
		lector.close();
	}

}
