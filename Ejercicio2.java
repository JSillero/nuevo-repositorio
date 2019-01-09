package examen;
/**
 * Haz un programa en Java y Python que calcule el elemento N (se pide al usuario) de la serie de Fibonacci
 * @author d18sisaj
 *
 */
import java.util.Scanner;
public class Ejercicio2 {

  public static void main(String[] args) {
    int fib=1, fibant=0, aux=0, posicion;
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca la posicion que del numero que desea saber en la serie de Fibonacci: ");
    posicion=s.nextInt();
    
    for(int i=0;i<posicion-1; i++) {
      aux=fib;
      fib=fib+fibant;
      fibant=aux;
      
    }
    System.out.println("El numero en la posición "+posicion+" de la serie de Fibonnaci es: "+fib );
    
  }

}
