
public class dosDados {
	public static void main(String[] args) {
		int dado1, moneda, resultado;
		moneda = (int) (1+(Math.random()*100));
		
		if(moneda == 1) {
			System.out.println("cara");
		} else {
			System.out.println("cruz");
		}
	}
}
