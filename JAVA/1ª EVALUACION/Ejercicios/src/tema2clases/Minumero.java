package tema2clases;

import java.util.Scanner;

public class Minumero {
	double numerito;
	
	Minumero(double num) {
		this.numerito = num;
	}
	
	public double duplicar() {
		return numerito * 2;
	}
	
	public double triplicar() {
		return numerito * 3;
	}
	
	public double cuadriplicar() {
		return numerito * 4;
	}
	
	public void setNumerito(double a) {
		numerito = a;
	}
	
	public double getNumerito() {
		return numerito;
	}
	
	public double sumarNumerito(double a) {
		return numerito + a;
	}
	
	public double restarNumerito(double a) {
		return numerito - a;
	}
	
	public double multiplicarNumerito(double a) {
		return numerito * a;
	}
	
	public double dividirNumerito(double a) {
		return numerito / a;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introducir un numero: ");
		double num = sc.nextDouble();
		sc.close();
		Minumero m = new Minumero(num);
		System.out.println(m.duplicar()+" "+m.triplicar()+" "+m.cuadriplicar());
		m.setNumerito(10);
		System.out.println(m.duplicar()+" "+m.triplicar()+" "+m.cuadriplicar());
	}
}
