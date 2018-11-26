import java.util.Scanner;
public class boletin13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contpos = 0, sumpos = 0, contneg = 0, sumneg = 0, ceros = 0, aux = 0;
		for(int i = 0; i < 10; i++) {
			System.out.println("Introduce numero: ");
			aux = sc.nextInt();
			if(aux > 0) {
				contpos++;
				sumpos += aux;
			} else if (aux < 0) {
				contneg++;
				sumneg += aux;
			} else if (aux == 0) {
				ceros++;
			}
		}
		
		System.out.println("Numeros positivos: "+contpos+", numeros negativos: "+contneg+", ceros:"+ceros+".");
		System.out.println("Media positivos: " + (double) sumpos / contpos);
		System.out.println("Media positivos: " + (double) sumneg / contneg);

	}

}
