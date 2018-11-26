import java.util.Scanner;
public class boletin7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int suma = 0, nums = 0, numero = 0;
		while(numero >= 0) {
			System.out.println("Introduce un numero: ");
			numero = sc.nextInt();
			if(numero>= 0) {
				nums++;
				suma += numero;
			} else {
				System.out.println("El numero es negativo. Cerrando programa.");
			}
		}
		sc.close();
		double media = (double) suma / nums;
		System.out.println("Media: "+ media);
	}

}
