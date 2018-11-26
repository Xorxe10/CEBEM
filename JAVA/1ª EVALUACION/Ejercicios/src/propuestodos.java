import java.util.Scanner;
public class propuestodos {
	public static void main(String[] args) {
		int largo, aux;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el largo: ");
		largo = sc.nextInt();
		sc.close();
		for(int i = 0; i < largo; i++) {
			aux = i + 1;
			while(aux > 0) {
				System.out.print("*");
				aux--;
			}
			System.out.println(" ");
		}
	}
}
