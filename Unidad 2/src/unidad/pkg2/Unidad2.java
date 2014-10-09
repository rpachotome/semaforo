
package unidad.pkg2;

public class Unidad2 {


    public static void main(String[] args) {
        //Instancio objeto tipo Semaforo
        Semaforo sema1= new Semaforo();
        String valor=sema1.dameCor();
        System.out.println("Cor antes de darlle un valor "+ valor);
        sema1.ponCor("verde");
        valor=sema1.dameCor();
        System.out.println("Cor:"+ valor);
        //Otro modo
        System.out.println("cor: "+sema1.dameCor());
    }
    
}
