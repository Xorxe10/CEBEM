import java.util.Scanner;
public class segundoGrado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, discriminante;
		double aux1, aux2;
		System.out.println("Introduce los 3 valores de la ecuacion: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		discriminante  =  b*b  -  4*a*c;
		
		if(discriminante > 0) {
			aux1 = (-b  + Math.sqrt(discriminante))/(2*a);
			aux2 = (-b  - Math.sqrt(discriminante))/(2*a);
			System.out.println("Soluciones: "+aux1+" y "+aux2);
		} else if (discriminante == 0) {
			System.out.println("Solucion: " + (-b)/(2*a));
		} else {
			System.out.println("Resultado negativo");
		}
		sc.close();
	}

}
