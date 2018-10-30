package tema2clases;
public class Satelite {

	// atributos
	private double meridiano;
	private double paralelo;
	private double distancia_tierra;
	private double altura;
	private boolean enOrbita;

	// Constructor con todos los parametros
	Satelite(double m, double p, double d) {
		meridiano = m;
		paralelo = p;
		if (d >= 0) {
			distancia_tierra = d;
		} else {
			distancia_tierra = 0d;
		}

	}

	// constructor sin parametros (por defecto)
	Satelite() {
		meridiano = paralelo = distancia_tierra = 0;
	}

	public void setPosicion(double m, double p, double d) {
		meridiano = m;
		paralelo = p;
		if (d >= 0) {
			distancia_tierra = d;
		} else {
			distancia_tierra = 0d;
		}
	}

	public void printPosicion() {
		System.out.println("El sat�lite se encuentra en el paralelo " + paralelo + "\n Meridiano " + meridiano
				+ "\n a una distancia de la tierra de " + distancia_tierra + " Kil�metros");

	}

	public void variaAltura(double a) {
		altura += a;
	}
	
	public boolean enOrbita() {
		return enOrbita;
	}
	
	public void variaPosicion(double m, double p) {
		meridiano += m;
		paralelo += p;
	}
	
}
