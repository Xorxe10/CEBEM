
public class Principal {
	public static void main(String[] args) {
		Circulo miCirculito = new Circulo();
		miCirculito.radio = 19;
	
		float peri = miCirculito.getPerim();
		System.out.println(peri);
		
		float diam = miCirculito.getDiam();
		System.out.println(diam);
	}
}
