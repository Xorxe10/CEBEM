import java.util.Scanner;
public class boletin20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maximo = 0, aux;
		System.out.println("Introduce un Número N: ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.println("Introduce un sueldo: ");
			aux = sc.nextInt();
			if(aux > maximo) {
				maximo = aux;
			}
		}
		System.out.println("El sueldo máximo de los introducidos es: "+maximo);
		sc.close();
	}

}
