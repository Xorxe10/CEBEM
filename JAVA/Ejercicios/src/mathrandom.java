public class mathrandom{
    public static void main(String[] args){
        int moneda;
        for(int i = 0; i < 100; i++){
        moneda = (int) (1+(Math.random()*10)); // del 1 al 10 incluidos, cambiar 10 por lo que sea
        System.out.println(moneda+" ");
        }
    }
}