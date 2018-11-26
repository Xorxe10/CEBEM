import java.util.Scanner;
public class boletin19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nota = 0, contaprobados = 0, contcondicionados = 0, contsuspensos = 0;
		for(int i = 0; i < 6; i++) {
			System.out.println("Introduce una nota");
			nota = sc.nextInt();
			if(nota >= 5) {
				contaprobados++;
			} else if(nota == 4) {
				contcondicionados++;
			} else {
				contsuspensos++;
			}
		}
		sc.close();
		System.out.println("Alumnos aprobados: "+ contaprobados);
		System.out.println("Alumnos condicionados: "+ contcondicionados);
		System.out.println("Alumnos suspendos: "+ contsuspensos);
	}

}
