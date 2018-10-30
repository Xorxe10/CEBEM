package Cochiño;

public class Test {
	public static void main(String[] args) {
		Coche perolo = new Coche();
		perolo.acelerar(2);
		perolo.acelerar(4);
		perolo.frenar(1);
		System.out.println(perolo.getVelocidad());
		
	}
}
