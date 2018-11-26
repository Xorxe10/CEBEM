import java.util.Scanner;
public class boletin22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean antonio = false;
		for(int i = 0; i < 5 ; i++) {
			System.out.println("Introduce nota de alumno: ");
			int num = sc.nextInt();
			if(num < 5) {
				antonio = true;
			}
		}
		if(antonio == true) {
			System.out.println("Hay suspensos");
		} else {
			System.out.println("No hay suspensos");
		}
		sc.close();
	}

}
