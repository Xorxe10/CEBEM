import java.util.Scanner;
public class boletin1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		while(numero >= 0) {
			System.out.println("Introduce un número: ");
			numero = sc.nextInt();
			if(numero >= 0) {
				System.out.println(Math.pow(numero, 2));
			}
			
		}
		sc.close();
		System.out.println("Fin");
	}
}
