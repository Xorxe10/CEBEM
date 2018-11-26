import java.util.Scanner;
public class prop2_ejer3 {
	public static void main(String[] args) {
		/*int a = 123;
		int uno = 0, dos = 0, tres = 0;
		uno = a / 100;
		dos = (a % 100) / 10;
		tres = (a % 100)%10;
		int suma = uno+dos+tres;
		System.out.println(suma);*/
		Scanner sc = new Scanner(System.in);
		int mes = 0, año = 0, dia = 0;
		System.out.println("Dia: ");
		dia = sc.nextInt();
		System.out.println("Mes: ");
		mes = sc.nextInt();
		System.out.println("Año: ");
		año = sc.nextInt();
		int suma = dia + mes + año;
		System.out.println("La suma es: "+suma);
	}
}