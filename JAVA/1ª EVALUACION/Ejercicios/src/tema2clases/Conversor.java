package tema2clases;

public class Conversor {
	
	double tasa;
	
	Conversor() {
		tasa = 1.36;

	}
	
	Conversor(double a) {
		tasa = a;
	}
	
	public double eurosADolares(double a) {
		return a * tasa;
	}
	
	public double dolaresAEuros(double a) {
		return a / tasa;
	}
}