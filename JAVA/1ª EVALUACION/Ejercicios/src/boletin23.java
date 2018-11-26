import java.util.Scanner;
public class boletin23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean antonio = false;
		for(int i = 0; i < 5 ; i++) {
			System.out.println("Introduce número: ");
			int num = sc.nextInt();
			if(num % 3 == 0) {
				antonio = true;
			}
		}
		if(antonio == true) {
			System.out.println("Uno de los números es múltiplo de 3");
		} else {
			System.out.println("Ninguno de los números es múltiplo de 3");
		}
		sc.close();
	}

}
