package tema2clases;

public class Restaurante {

	private double kgpapas, kgchocos, aux1, aux2, comensales;
	
	Restaurante(){
		kgpapas = 0;
		kgchocos = 0;
	}
	
	Restaurante(double a, double b){
		kgpapas = a;
		kgchocos = b;
	}
	
	public double getComensales() {
		aux1 = kgpapas;
		aux2 = kgchocos;
		comensales = 0;
		
		while(aux1 >= 1 && aux2 >= 0.5) {
			comensales += 3;
			aux1 -= 1;
			aux2 -= 0.5;
		}
		
		return comensales;
	}
	
	public void addPapas(double a) {
		kgpapas += a;
	}
	
	public void addChocos(double a) {
		kgchocos += a;
	}
	
	public double getChocos() {
		return kgchocos;
	}
	
	public double getPapas() {
		return kgpapas;
	}
	
	public static void main(String[] args) {
		Restaurante mex = new Restaurante();
		mex.addPapas(1);
		mex.addChocos(1);
		System.out.println(mex.getComensales());
	}
	
}
