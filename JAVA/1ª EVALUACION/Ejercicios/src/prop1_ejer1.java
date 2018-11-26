public class prop1_ejer1 {
	public static void main(String[] args) {
		int a = 1, b = 2, c = 3, d = 4, temp;
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		System.out.println("C = " + c);
		System.out.println("D = " + d);
		// CAMBIOS
		temp = b;
		b = c;
		c = a;
		a = d;
		d = temp;
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		System.out.println("C = " + c);
		System.out.println("D = " + d);
	}
}