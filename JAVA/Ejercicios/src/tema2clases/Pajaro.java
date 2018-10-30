package tema2clases;

public class Pajaro {
	//atributos
	String nombre;
	String color_plumaje;
	int edad;
	boolean domestico;
	
	
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getColor_plumaje() {
		return color_plumaje;
	}


	public void setColor_plumaje(String color_plumaje) {
		this.color_plumaje = color_plumaje;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public boolean isDomestico() {
		return domestico;
	}


	public void setDomestico(boolean domestico) {
		this.domestico = domestico;
	}


	//metodo constructor por defecto
	Pajaro(){
		
	}
	
	
	//metodo constructor con parametros
	Pajaro(String n, int e, String color, boolean dom) {
		nombre = n;
		edad = e;
		color_plumaje = color;
		domestico = dom;
	}

	/*metodos
	volar();
	piar();
	comer();
	*/
	public static void main(String[] args) {
		
	}
}
