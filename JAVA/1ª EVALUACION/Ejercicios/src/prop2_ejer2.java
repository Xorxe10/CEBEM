import java.util.Scanner;
public class prop2_ejer2 {
	public static void main(String[] args) {
		double a = 0, b = 0, c = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca primer lado: ");
		a = sc.nextDouble();
		System.out.println("Introduzca segundo lado: ");
		b = sc.nextDouble();
		System.out.println("Introduzca tercer lado: ");
		c = sc.nextDouble();
		sc.close();
		
		double p = (a+b+c) / 2;
		if (p*(p-a)*(p-b)*(p-c) > 0) {
			double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
			System.out.println(area);
		} else {
			System.out.println("Ese triangulo no existe");
		}
	}
}