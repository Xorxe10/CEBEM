import java.util.Scanner;
public class boletin4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contador = 0, numero = 0;
		while (numero >= 0) {
			System.out.println("Introduce numero: ");
			numero = sc.nextInt();
			if(numero >= 0) {
				contador++;
			} else {
				System.out.println("El numero es negativo. Fin del programa.");
			}
		}
		System.out.println("Contador: "+contador);
		sc.close();
	}

}
