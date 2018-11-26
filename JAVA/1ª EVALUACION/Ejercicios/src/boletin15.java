import java.util.Scanner;
public class boletin15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contmayores = 0, contaltos = 0, sumaedad = 0, sumaaltura = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("Introduce alturas: ");
			int aux = sc.nextInt();
			if(aux > 175) {
				contaltos++;
			}
			sumaaltura += aux;
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("Introduce edades: ");
			int aux = sc.nextInt();
			if(aux >= 18) {
				contmayores++;
			}
			sumaedad += aux;
		}
		sc.close();
		System.out.println("Hay "+contmayores+" alumnos mayores de edad y "+contaltos+" alumnos mas altos de 1.75.");
		System.out.println("La media de edad es: " + (double) sumaedad / 5);
		System.out.println("La media de altura es: "+ (double) sumaaltura / 5);
	}

}
