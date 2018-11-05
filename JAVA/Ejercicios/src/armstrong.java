import java.util.Scanner;
public class armstrong{
    /* 153 -> n digitos = 3, 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 */

    public boolean numArmstrong(int c, int d, int u, int numero) {
        if (Math.pow(c,3) + Math.pow(d, 3) + Math.pow(u, 3) == numero) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        armstrong a = new armstrong();
        int c,d,u, numero;
        boolean result;
        System.out.println("Introduce numero de 3 cifras");
        numero = sc.nextInt();

        if(numero > 99 && numero < 1000) {
            c = numero / 100;
            d = (numero % 100) /10;
            u = (numero % 10);
            System.out.println(c+" "+d+" "+u);
            result = a.numArmstrong(c, d, u, numero);
            if (result == true) {
                System.out.println("Es un numero armstrong");
            } else {
                System.out.println("No es un numero armstrong");
            }
        } else {
            System.out.println("El numero no es de 3 cifras");
        }
    }
}