import java.util.Scanner;
public class pseudo5 {
	public static void main(String[] args) {
		int altura, base;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce base: ");
		base = sc.nextInt();
		System.out.println("Introduce altura: ");
		altura = sc.nextInt();
		sc.close();
		int result = (base * altura) / 2;
		System.out.println("El area del triangulo es: " + result);
	}
}
