import java.util.Scanner;
public class Intercambio {
	public static void main(String[] args) {
		int edad, estudios, ingresos;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introducir edad: ");
		edad = sc.nextInt();
		System.out.print("Introducir estudios: ");
		estudios = sc.nextInt();
		System.out.print("Introducir ingresos: ");
		ingresos = sc.nextInt();
		
		boolean jasp = ((edad <= 28) && (estudios > 3) && (ingresos > 28000));
		System.out.println(jasp);
	}
}
