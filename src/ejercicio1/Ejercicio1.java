/*
 El area de un triangulo
 */
package ejercicio1;
import java.util.Scanner;
/**
 *
 * @author bhernandezsouto
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        float altura,base;
        Scanner ab = new Scanner(System.in);
        System.out.println ("Introduzca la base");
        base = ab.nextFloat();
        System.out.println ("Introduzca la altura");
        altura = ab.nextFloat();
        System.out.println("El area del triangulo es: " + ((base * altura)/2) );
    }
    
}
