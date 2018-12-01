
public class Dimensiones {
	public static void main(String[] args) {
		Objeto3D uno = new Objeto3D();
		Objeto3D dos = new Objeto3D();
		Objeto3D tres = new Objeto3D();
		Objeto3D cuatro = new Objeto3D();
		Objeto3D cinco = new Objeto3D();
		Objeto3D seis = new Objeto3D();
		
		uno.Dimensiones("cm", 8, 8, 8);
		dos.Dimensiones(5, 5, 5, "mm");
		tres.Dimensiones(7, "km", 7, 7);
		cuatro.Dimensiones(6, 6, "in", 6);
		cinco.Dimensiones("m");
		cinco.Dimensiones3D(4, 4, 4);
		seis.TipoMedida("legua");
		seis.Dimensiones3D(9, 9, 9);
		System.out.println(seis.toString());
	}
}
