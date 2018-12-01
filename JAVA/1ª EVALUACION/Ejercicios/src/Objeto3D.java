public class Objeto3D {
 
    // atributos
    private double X = 0d;
    private double Y = 0d;
    private double Z = 0d;
    private String TipoMedida = "centimetro";
 
    // set triple
    public void Dimensiones3D(double Ancho, double Alto, double Profundo) {
        X = Ancho;
        Y = Alto;
        Z = Profundo;
    }
 
    // set medida
    public void TipoMedida(String Medida) {
        TipoMedida = Medida;
    }
 
    // getters
    public double DimeAncho() {
        return X;
    }
 
    public double DimeAlto() {
        return Y;
    }
 
    public double DimeProfundo() {
        return Z;
    }
 
    public String DimeMedida() {
        return TipoMedida;
    }
    
    @Override
	public String toString() {
		return "Objeto3D [X=" + X + ", Y=" + Y + ", Z=" + Z + ", TipoMedida=" + TipoMedida + "]";
	}

	// metodo sobrecargado
    public void Dimensiones(double Ancho, double Alto, double Profundo, String Medida) {
        Dimensiones3D(Ancho, Alto, Profundo);
        TipoMedida(Medida);
    }
 
    public void Dimensiones(String Medida, double Ancho, double Alto, double Profundo) {
        Dimensiones(Ancho, Alto, Profundo, Medida);
    }
 
    public void Dimensiones(double Ancho, String Medida, double Alto, double Profundo) {
        Dimensiones(Ancho, Alto, Profundo, Medida);
    }
 
    public void Dimensiones(double Ancho, double Alto, String Medida, double Profundo) {
        Dimensiones(Ancho, Alto, Profundo, Medida);
    }
 
    public void Dimensiones(String Medida) {
        TipoMedida(Medida);
    }
 
    public void Dimensiones(double Ancho, double Alto, double Profundo) {
        Dimensiones3D(Ancho, Alto, Profundo);
    }
 
}