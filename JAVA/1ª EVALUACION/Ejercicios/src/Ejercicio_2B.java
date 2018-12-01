public class Ejercicio_2B {

	public static int sumaDivisores(int comprobador) {
		int suma=0;
		for(int i = 1; i<comprobador; i++) {
			if(comprobador%i==0) {
				suma+=i;
			}
		}
		return suma;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Dos números amigos son dos números enteros positivos a y b tales que a es la
		 * suma de los divisores de b, y b es la suma de los divisores de a. Dados dos
		 * números a y b calcular si son números amigos.
		 * 
		 * Un ejemplo es elpar de números (220, 284), ya que: los divisores de 220 son
		 * 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 y 110, que suman 284; los divisores
		 * propios de 284 son 1, 2, 4, 71 y 142, que suman 220.
		 * 
		 * Listar por pantalla todas las parejas de números amigos entre 0 y 100.000.
		 */
		
		for (int i =0; i<=100000; i++) {
			if(sumaDivisores(sumaDivisores(i))==i && sumaDivisores(i)!= i) {
				System.out.println(i + " " + sumaDivisores(i));
			}
		}
		
	}

}