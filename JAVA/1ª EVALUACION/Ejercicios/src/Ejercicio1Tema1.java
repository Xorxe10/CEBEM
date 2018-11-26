
public class Ejercicio1Tema1 {
 public static int tirarDado() {
	 int dado = (int) (Math.random() * (1-7) + 7);
	 return dado;
 }
 public static void main(String[] args) {
		 System.out.print(tirarDado());
 }
}
