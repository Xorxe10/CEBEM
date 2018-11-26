import java.util.Scanner;

public class propuestotres {
	
    public void formarPino(int lineas, int max) {
    	int aux1 = 1;
        for(int i = 0; i < lineas; i++) {
        	int aux3 = aux1;
            int aux2 = (max - aux1) / 2;
            while(aux2 > 0) {
            	System.out.print(" ");
            	aux2--;
            }
            while (aux3 > 0) {
            	System.out.print("*");
            	aux3--;
            }
            aux1 = aux1 + 2;
            System.out.println(" ");
        }
    }

    public int lineaMaxima(int a) {
        return 1 + 2 * (a-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineas, max;

        System.out.println("Escribir numero de lineas deseadas: ");
        lineas = sc.nextInt();
        pino p = new pino();
        max = p.lineaMaxima(lineas);

        p.formarPino(lineas, max);
        sc.close();
    }
}