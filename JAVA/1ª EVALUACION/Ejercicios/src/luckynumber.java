import java.util.Scanner;
public class luckynumber {
	
	public int primerPaso(int a, int b, int c) {
		return a+b+c;
	}
	
	public int luckyNumber(int a) {
		int auxa, auxb, auxc, auxd;
		auxa = a / 1000; //primer numero
		auxb = (a % 1000) / 100; //segundo numero
		auxc = (a % 100) / 10; // tercer numero
		auxd = (a % 100) % 10; //ultimo numero
		return auxa + auxb + auxc + auxd;
		
	}
	
	public int luckyNumberDos(int a) {
		int auxe, auxf;
		auxe = a / 10;
		auxf = a % 10;
		return auxe + auxf;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		luckynumber ln = new luckynumber();
		int dia, mes, año, primerpaso, luckynumber;
		System.out.println("Introduce tu dia de nacimiento: ");
		dia = sc.nextInt();
		System.out.println("Introduce tu mes de nacimiento: ");
		mes = sc.nextInt();
		System.out.println("Introduce tu año de nacimiento: ");
		año = sc.nextInt();
		sc.close();
		primerpaso = ln.primerPaso(dia, mes, año);
		luckynumber = ln.luckyNumber(primerpaso);
		if(luckynumber < 10) {
		System.out.println("Tu lucky number es: "+luckynumber);
		} else {
			System.out.println(ln.luckyNumberDos(luckynumber));
		}
	}
}
