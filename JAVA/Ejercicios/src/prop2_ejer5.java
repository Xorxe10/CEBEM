import java.util.Scanner;
public class prop2_ejer5 {
	public static void main(String[] args) {
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
		
		int num1 = 0,num2 = 0,num3 = 0,num4 = 0;
		num1 = suma / 1000;
		num2 = (suma%1000) / 100;
		num3 = ((suma%1000)%100) / 10;
		num4 = ((suma%1000)%10);
		
		int numsuerte = num1 + num2 + num3 + num4;
		System.out.println("El numero de la suerte es "+numsuerte);
	}
}
