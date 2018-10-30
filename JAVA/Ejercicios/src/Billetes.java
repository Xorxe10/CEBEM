import java.util.Scanner;
public class Billetes {
	public static void main(String[] args) {
		int quin = 0, dosc = 0, cien = 0, cincu = 0, veinte = 0, diez = 0, cinco = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su saldo para partirlo en billetes: ");
		int saldo = sc.nextInt();
		while(saldo >= 500) {
			quin++;
			saldo -= 500;
		}
		while(saldo >= 200) {
			dosc++;
			saldo -= 200;
		}
		while(saldo >= 100) {
			cien++;
			saldo -= 100;
		}
		while(saldo >= 50) {
			cincu++;
			saldo -= 50;
		}
		while(saldo >= 20) {
			veinte++;
			saldo -= 20;
		}
		while(saldo >= 10) {
			diez++;
			saldo -= 10;
		}
		while(saldo >= 5) {
			cinco++;
			saldo -= 5;
		}	
		if(quin > 0 && quin >= 2 && dosc == 0 && cien == 0 && cincu == 0 && veinte == 0 && diez == 0 && cinco == 0 && saldo == 0) {System.out.print(quin + " billetes de 500. ");}
		else if(quin > 0 && quin >= 2) {System.out.print(quin + " billetes de 500, ");}
		else if(quin > 0 && quin == 1 && dosc == 0 && cien == 0 && cincu == 0 && veinte == 0 && diez == 0 && cinco == 0 && saldo == 0) {System.out.print(quin + " billete de 500. ");}
		else if(quin > 0 && quin == 1) {System.out.print(quin + " billete de 500, ");}
		
		if(dosc > 0 && dosc >= 2 && cien == 0 && cincu == 0 && veinte == 0 && diez == 0 && cinco == 0 && saldo == 0) {System.out.print("y " + dosc + " billetes de 200. ");}
		else if(dosc > 0 && dosc >= 2) {System.out.print(dosc + " billetes de 200, ");}
		else if(dosc > 0 && dosc == 1 && cien == 0 && cincu == 0 && veinte == 0 && diez == 0 && cinco == 0 && saldo == 0) {System.out.print("y " + dosc + " billete de 200. ");}
		else if(dosc > 0 && dosc == 1) {System.out.print(dosc + " billete de 200, ");}
		
		if(cien > 0 && cien >= 2 && cincu == 0 && veinte == 0 && diez == 0 && cinco == 0 && saldo == 0) {System.out.print("y " + cien + " billetes de 100. ");}
		else if(cien > 0 && cien >= 2) {System.out.print(cien + " billetes de 100, ");}
		else if(cien > 0 && cien == 1 && cincu == 0 && veinte == 0 && diez == 0 && cinco == 0 && saldo == 0) {System.out.print("y " + cien + " billete de 100. ");}
		else if(cien > 0 && cien == 1) {System.out.print(cien + " billete de 100, ");}
		
		if(cincu > 0 && cincu >= 2 && veinte == 0 && diez == 0 && cinco == 0 && saldo == 0) {System.out.print("y " + cincu + " billetes de 50. ");}
		else if(cincu > 0 && cincu >= 2) {System.out.print(cincu + " billetes de 50, ");}
		else if(cincu > 0 && cincu == 1 && cincu == 0 && veinte == 0 && diez == 0 && cinco == 0 && saldo == 0) {System.out.print("y " + cincu + " billete de 50. ");}
		else if(cincu > 0 && cincu == 1) {System.out.print(cincu + " billete de 50, ");}
		
		if(veinte > 0 && veinte >= 2 && diez == 0 && cinco == 0 && saldo == 0) {System.out.print("y " + veinte + " billetes de 20. ");}
		else if(veinte > 0 && veinte >= 2) {System.out.print(veinte + " billetes de 20, ");}
		else if(veinte > 0 && veinte == 1 && diez == 0 && cinco == 0 && saldo == 0) {System.out.print("y " + veinte + " billete de 20. ");}
		else if(veinte > 0 && veinte == 1) {System.out.print(veinte + " billete de 20, ");}
		
		if(diez > 0 && diez >= 2 && cinco == 0 && saldo == 0) {System.out.print("y " + diez + " billetes de 10. ");}
		else if(diez > 0 && diez >= 2) {System.out.print(diez + " billetes de 10, ");}
		else if(diez > 0 && diez == 1 && cinco == 0 && saldo == 0) {System.out.print("y " + diez + " billete de 10. ");}
		else if(diez > 0 && diez == 1) {System.out.print(diez + " billete de 10, ");}
		
		if(cinco > 0 && cinco >= 2 && saldo == 0) {System.out.print("y " + cinco + " billetes de 5. ");}
		else if(cinco > 0 && cinco >= 2) {System.out.print(cinco + " billetes de 5, ");}
		else if(cinco > 0 && cinco == 1 && saldo == 0) {System.out.print("y " + cinco + " billete de 5. ");}
		else if(cinco > 0 && cinco == 1) {System.out.print(cinco + " billete de 5, ");}
		
		if(saldo > 0) {System.out.print("y " + saldo + "€ restante.");}
	}
}
	