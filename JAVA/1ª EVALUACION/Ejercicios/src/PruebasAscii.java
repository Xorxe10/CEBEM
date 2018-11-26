import java.util.Scanner;
public class PruebasAscii {
	final static int TIPO_DE_IVA = 21;
	final static double PI = 3.1416d;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca Radio: ");
		double radio = sc.nextDouble();
		double longitud = 2 * PI * radio;
		double area = PI * radio * radio;
		
		System.out.println("La longitud es: " + longitud);
		System.out.println("El area es: " + area);
		
	}
}