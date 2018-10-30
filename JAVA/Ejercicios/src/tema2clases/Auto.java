package tema2clases;

public class Auto {
	String marca, modelo;
	
	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", modelo=" + modelo + "]";
	}
	
	Auto(){
		this.marca = "Desconocido";
		this.modelo = "Desconocido";
	}
	Auto(String a, String b){
		this.marca = a;
		this.modelo = b;
	}
	
	public static void main(String[] args) {
		Auto a = new Auto();
		System.out.println(a.toString());
		
		Auto b = new Auto("Citroen", "C3");
		System.out.println(b.toString());
	}
}
