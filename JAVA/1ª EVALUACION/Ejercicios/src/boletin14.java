import java.util.Scanner;
public class boletin14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int suma = 0, contador = 0, aux = 0;
		for(int i = 0; i < 10; i++) {
			System.out.println("Introduce numero: ");
			aux = sc.nextInt();
			if(aux > 1000) {
				contador++;
			}
			suma = suma + aux;
		}
		System.out.println("Hay "+contador+" sueldos mayores de 1000€. Suma de los sueldos: "+suma);
		sc.close();
	}

}
