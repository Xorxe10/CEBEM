import java.util.Scanner;
public class aMayus {
	public static void main(String[] args) {
		String letra;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la letra: ");
		letra = sc.next(); 
		sc.close();
		System.out.println(letra.toUpperCase());
	}
}
