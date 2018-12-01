public class TestSemaforo {
 
    public static void main(String[] args) {
 
        Semaforo gVia= new Semaforo();
        gVia.setEstadoSemaforo("Verde");
           
         if (gVia.getEstadoSemaforo().equals("Verde")) {
        	 System.out.println("Pasa");
         }
    }
 
}