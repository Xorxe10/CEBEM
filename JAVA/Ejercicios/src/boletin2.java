import java.util.Scanner;
public class boletin2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 1; //Inicializo la variable con un valor aleatorio (distinto a 0)
		while(numero != 0) { //Mientras no se de un cero, comprobar numeros y dar el resultado por pantalla
			System.out.println("Introduce un numero: ");
			numero = sc.nextInt();
			if (numero > 0) {
				System.out.println("El numero es positivo");
			} else if (numero < 0) {
				System.out.println("El numero es negativo");
			} else {
				System.out.println("El numero es 0. Fin del programa.");
			}
		}
		sc.close();
	}

}
