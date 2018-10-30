package propuestos3;
import java.util.Scanner;
public class Ejercicio5 {
	final static double PI = 3.1416;
	public static double calcLongitud(double a) {
		return 2 * PI * a;
	}
	public static double calcArea(double a) {
		return PI * Math.pow(a, 2);
	}
	public static void main(String[] args) {
		double radio;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introducir radio de la circunferencia: ");
		radio = sc.nextDouble();
		sc.close();		
		System.out.println("La longitud es: " + calcLongitud(radio));
		System.out.println("El area es: " + calcArea(radio));
		
	}
}
