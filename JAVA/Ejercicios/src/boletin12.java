import java.util.Scanner;
public class boletin12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int resultado = 1;
		System.out.println("Introduce un numero para hallar su factorial: ");
		int numero = sc.nextInt();
		if(numero > 0) {
			for(int i = 1; i <= numero; i++ ) {
				resultado = resultado * i;
			}
			sc.close();
			System.out.println("Factorial: "+resultado);
		} else {
			System.out.println("Error, no puedes calcular el factorial de un numero negativo");
		}

	}

}
