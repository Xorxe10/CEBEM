import java.util.Scanner;

public class armstrongv2 {


    public static void main(String[] args){
        armstrongv2 a = new armstrongv2();
        Scanner sc = new Scanner(System.in);
        int num, longitud = 0, aux;

        System.out.println("Introduce numero para comprobar: ");
        num = sc.nextInt();
        aux = num;
        /* Comprobar longitud del numero */
        while ( aux != 0) {
            longitud++;
            aux = aux / 10;
        }
        aux = num;
        /* Tomar número por número y sumar las potencias de cada uno */
        while (aux != 0) {
            
        }

    }
}