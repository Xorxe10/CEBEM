import java.util.Scanner;
public class prop1_ejer7 {
	public static void main(String[] args) {
		int C = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un número~$ ");
		C = sc.nextInt();
		sc.close();
		
		System.out.println((C >= 0)?"es positivo":"es negativo");
		System.out.println((C % 2 == 0)?"es par":"es impar");
		System.out.println((C % 5 == 0)?"es multiplo de 5":"no es multiplo de 5");
		System.out.println((C % 10 == 0)?"es multiplo de 10":"no es multiplo de 10");
		System.out.println((C > 100)?"es mayor que 100":"es menor o igual que 100");
		
		
	}
}
