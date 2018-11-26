package propuestos3;

import java.util.Scanner;

public class Ejercicio7 {
	
	public static double hipotenusa(double a, double b) {
		return Math.sqrt( Math.pow(a, 2) + Math.pow(b, 2) );
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introducir primer cateto: ");
		double cat1 = sc.nextDouble();
		System.out.println("Introducir segundo cateto: ");
		double cat2 = sc.nextDouble();
		sc.close();
		System.out.println("La hipotenusa es: " + hipotenusa(cat1, cat2));
	}
}