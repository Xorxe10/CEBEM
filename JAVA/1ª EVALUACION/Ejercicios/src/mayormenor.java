public class mayormenor {
	public static void main(String[] args) {
		int a = 3, b = 6, c = 8;
		
		if (a > b && a > c) {
			System.out.println("a es el mayor.");
		} else if ( b > c) {
			System.out.println("b es el mayor.");
		} else {
			System.out.println("c es el mayor.");
		}
		
		if (a < b && a < c) {
			System.out.println("a es el menor.");
		} else if ( b < c) {
			System.out.println("b es el menor.");
		} else {
			System.out.println("c es el menor");
		}
	}
}