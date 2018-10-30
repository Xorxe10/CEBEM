package Cochiño;

public class Coche {
	private int velocidad;
	
	public void setVelocidad(int v) {
		this.velocidad = v;
	}
	public int getVelocidad() {
		return velocidad;
	}
	
	public void acelerar(int v) {
		if(v > 0) {
			velocidad += v;
		} else {
			System.out.println("Que haces burro?");
		}
	}
	
	public void frenar(int v) {
		if(v > 0 && v <= velocidad) {
			velocidad -= v;
		} else {
			System.out.println("No puedes frenar mas de la velocidad, o frenar con numero negativo");
		}
	}
	
	//Constructor
	Coche(){
		velocidad = 0;
	}
}
