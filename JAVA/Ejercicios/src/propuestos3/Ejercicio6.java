package propuestos3;

import java.util.Scanner;

public class Ejercicio6 {
	
	public static double aMetrosSegundo(int a) {
		return a / 3.6;
	}
	public static double aKMH(int a) {
		return a * 3.6;
	}
	
	public static void main(String[] args) {
		int kmh, ms, opcion = 10;
		Scanner sc = new Scanner(System.in);
		while(opcion != 0) {
			System.out.println("1.Conversor KM a MS | 2.Conversor MS a KM | 3.Salir");
			opcion = sc.nextInt();
			if(opcion == 1) {
				System.out.println("Introducir KM/H: ");
				kmh = sc.nextInt();
				System.out.println(kmh + " KM/H son "+aMetrosSegundo(kmh)+ " m/s");
			} else if(opcion == 2) {
				System.out.println("Introducir M/S: ");
				ms = sc.nextInt();
				System.out.println(ms + " M/S son "+aKMH(ms)+ " m/s");
			} else if(opcion == 3){
				System.out.println("Saliendo del programa...");
				opcion = 0;
			} else {
				System.out.println("Error.");
				opcion = 0;
			}
		}
	}
}
