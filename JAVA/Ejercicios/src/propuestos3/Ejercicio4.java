package propuestos3;
import java.util.Scanner;
public class Ejercicio4 {
	
	public static int aFarenheit(int a) {
		return 32 + ( 9 * a / 5);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cent = 1,far;
		while(cent != 0) {
			System.out.println("Introduce ºC. 0 para salir: ");
			cent = sc.nextInt();
			far = aFarenheit(cent);
			System.out.println(cent+"ºC son "+far+"ºF");
		}
		sc.close();
	}
}
