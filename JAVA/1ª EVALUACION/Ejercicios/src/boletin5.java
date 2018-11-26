import java.util.Scanner;
public class boletin5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 97, aux = 0; //Cambiar la variable n para que el numero a adivinar sea otro
		System.out.println("Programa para adivinar un número comprendido entre el 1 y el 100.");
		while(aux != n) {
			System.out.println("Introduce un número: ");
			aux = sc.nextInt();
			if(aux < n) {
				System.out.println("Prueba con un número más alto");
			} else if (aux > n) {
				System.out.println("Prueba con un número más bajo");
			} else if (aux == n) {
				System.out.println("¡¡Has acertado!!");
			}
		}
		sc.close();
	}

}
