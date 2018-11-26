import java.util.Scanner;
public class boletin21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean antonio = false;
		for(int i = 0; i < 10 ; i++) {
			System.out.println("Introduce número: ");
			int num = sc.nextInt();
			if(num < 0) {
				antonio = true;
			}
		}
		if(antonio == true) {
			System.out.println("Se ha introducido un numero negativo.");
		} else {
			System.out.println("No se ha introducido ningún número negativo");
		}
		sc.close();
	}

}
