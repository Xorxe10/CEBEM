import java.util.Scanner;
public class boletin8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Introduce el numero: ");
		num = sc.nextInt();
		for(int i = 1; i < num; i++) {
			System.out.print(i+", ");
		}
		System.out.println(num+".");
		sc.close();
	}

}
