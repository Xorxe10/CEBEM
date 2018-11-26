import java.util.Scanner;
public class boletin10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int resultado= 0;
		for(int i = 0; i < 15; i++) {
			System.out.println("Introduce numero: ");
			resultado += sc.nextInt();
		}
		System.out.println("Suma: "+resultado);
		sc.close();
	}

}
