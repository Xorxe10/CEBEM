package tema2clases;

public class Consumo {

	private double kms, litros, vmed, pgas, aux;
	
	Consumo(double a, double b, double c, double d){
		this.kms = a;
		this.litros = b;
		this.vmed = c;
		this.pgas = d;
	}
	
	public double getTiempo() {
		return kms / vmed; // t = s / v. tiempo en horas.
	}
	
	public double consumoMedio() {
		return (litros / kms) * 100;
	}
	
	public double consumoEuros() {
		aux = consumoMedio();
		return aux * pgas;
	}
	
	public void setKms(double kms) {
		this.kms = kms;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}

	public void setVmed(double vmed) {
		this.vmed = vmed;
	}

	public void setPgas(double pgas) {
		this.pgas = pgas;
	}

	public static void main(String[] args) {
		Consumo c = new Consumo(500, 50, 120, 1.48); // kms recorridos, litros consumidos, velocidad media, precio gasolina
		System.out.println(c.getTiempo()+" horas de viaje");
		System.out.println(c.consumoMedio()+" litros/100km");
		System.out.println(c.consumoEuros()+" euros/100km");
	}
}
