
public class Circulo {
	float radio = 0;
	String color;
	int grosor;
	
	public Circulo() {
		super();
		radio = 7;
	    color = "rojo";
	}

	float getDiam() {
		return radio * radio;
	}
	
	float getPerim() {
		return 2 * 3.1416f * radio;
	}
}
