import java.util.Scanner;
public class IMC {
	
	public static double calcularIMC(double a, double b) {
		return (a / Math.pow(b, 2));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double peso, altura, resultado;
		System.out.println("Introduce tu peso(kg): ");
		peso = sc.nextDouble();
		System.out.println("Introduce tu altura(m)");
		altura = sc.nextDouble();
		resultado = calcularIMC(peso, altura);
		System.out.print(resultado+" -> ");
		if(resultado < 16) {
			System.out.println("Criterio de ingreso en el hospital");
		} else if (resultado >= 16 && resultado < 16.99) {
			System.out.println("Infrapeso");
		} else if (resultado >= 17 && resultado < 17.99) {
			System.out.println("Bajo peso");
		} else if (resultado >= 18 && resultado < 24.99) {
			System.out.println("Peso normal (saludable)");
		} else if (resultado >= 25 && resultado < 29.99) {
			System.out.println("Obesidad grado 1");
		} else if (resultado >= 30 && resultado < 34.99) {
			System.out.println("Obesidad grado 2");
		} else if (resultado >= 35 && resultado < 39.99) {
			System.out.println("Obesidad grado 3");
		} else if (resultado >= 40) {
			System.out.println("Obesidad grado 4");
		}
		sc.close();
	}
}
