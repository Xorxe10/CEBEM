import java.util.Scanner;
public class ConversorTiempos {
	public static void main(String[] args) {
		//FORMA 1
		/*int horas = 0, minutos = 0, segundos = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca los segundos: ");
		segundos = sc.nextInt();
		
		while(segundos >= 60) {
			segundos -= 60;
			minutos += 1;
		}
		while (minutos >= 60) {
			minutos -= 60;
			horas += 1;
		}
		
		System.out.println(horas + " horas, " + minutos + " minutos y " + segundos + " segundos."); */
		//FORMA 2
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca los segundos: ");
		int segundos = sc.nextInt();
		
		System.out.println("Horas = " + (segundos / 60) / 60);
		System.out.println("Minutos = " + (segundos / 60) % 60);
		System.out.println("Segundos = " + segundos % 60);
		
		
	}
}