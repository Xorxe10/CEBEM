import java.util.Scanner;
public class decimalromano {
	
	public String aRomano(int a) {
		String b = "";
		while(a > 0) {
			while(a >= 1000) { // unidades de millar, no se cambian por proximidad.
				b += "M";
				a -= 1000;
			}
			while(a >= 500) { // centenas
				b += "D";
				a -= 500;
			}
			while( a >= 100) {
				b += "C";
				a -= 100;
			}
			while( a >= 50) {
				b += "L";
				a -= 50;
			}
			while( a >= 10) {
				b += "X";
				a -= 10;
			}
			while( a >= 1) {
				b += "I";
				a -= 1;
			}
		}
		
		return b;
	}
	
	public static void main(String[] args) {
		/* 1 = I
		 * 5 = V
		 * 10 = X
		 * 50 = L
		 * 100 = C
		 * 500 = D
		 * 1000 = M
		 */
		Scanner sc = new Scanner(System.in);
		decimalromano dr = new decimalromano();
		int decimal;
		String romano = "";
		System.out.println("Introduce el numero decimal: ");
		decimal = sc.nextInt();
		sc.close();
		romano = dr.aRomano(decimal);
		System.out.println(romano);

	}
}
