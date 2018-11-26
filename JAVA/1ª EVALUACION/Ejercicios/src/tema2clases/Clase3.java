package tema2clases;

public class Clase3 {
    public static void main(String[] args){
        int valor;
        if (args.length == 0) {
            System.out.println("Por favor, introduce un argumento entero.");
        } else {
            valor = Integer.parseInt(args[0]);
            System.out.println("El cuadrado es " + valor*valor);
        }
    }
}
