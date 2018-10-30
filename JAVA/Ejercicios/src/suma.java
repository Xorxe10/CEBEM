import java.util.Scanner;
class suma {
	public static void main(String[] args) {
		char letra = (char) (Math.random() * (97-123) + 123);
		if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ) {
			System.out.println("La letra "+letra+" es vocal");
		} else {
			System.out.println("La letra "+letra+" no es vocal");
		}
	}
}