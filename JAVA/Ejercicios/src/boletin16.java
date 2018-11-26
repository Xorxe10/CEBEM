import java.util.Scanner;
public class boletin16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el numero para saber su tabla de multiplicar");
		int numero = sc.nextInt();
		for(int i = 1; i <= 10; i++) {
			System.out.println(numero+" x "+i+" = "+numero*i);
		}
		sc.close();
	}

}
