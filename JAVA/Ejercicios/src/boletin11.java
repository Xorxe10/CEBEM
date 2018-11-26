
public class boletin11 {

	public static void main(String[] args) {
		double producto = 1;
		for(int i = 0; i < 100; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
				producto = producto * i;
			}
		}
		System.out.println("Producto: "+producto);
	}

}
