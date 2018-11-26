import java.util.Scanner;
public class boletin6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sumatorio = 0, numero = 1;
		while(numero != 0) {
			System.out.println("Introduce un numero: ");
			numero = sc.nextInt();
			if(numero != 0) {
				sumatorio += numero;
			}else if(numero == 0) {
				System.out.println("El numero es 0. Fin del programa.");
			}
			
		}
		System.out.println("Suma total de números: "+sumatorio);
	}

}
