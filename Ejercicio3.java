package examen;
/**
 * Escribe un programa que rellene un array de 20 elementos con números enteros aleatorios comprendidos entre 0 y 400 
 * (ambos incluidos). A continuación el programa mostrará el array y preguntará si el usuario quiere resaltar los múltiplos de 
 * 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el array escribiendo los números que se quieren resaltar entre corchetes.
 * @author d18sisaj
 *
 */
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    int mult=0;
    int [] numeros= new int[20];
    Random rand = new Random();
    Scanner s = new Scanner(System.in);
    
    for(int i=0; i<20; i++) {
      numeros[i]=rand.nextInt(401);
    }
    
    for(int i:numeros) {
      System.out.println(i+" ");
    }
  
    while(!(mult==7||mult==5)){
      System.out.println("Introduzca si quiere que se resalten los multiplos de 5 o de 7");
      mult=s.nextInt();
      if(!(mult==7||mult==5)) {
        System.out.println("ERROR: elija entre multipos de 5 o 7");
      }
    }
  
    for(int i:numeros) {
      if(i%mult==0) {
        System.out.println("["+i+"] ");
      }else {
        System.out.println(i+ " ");
      }
      
    }
  
  
  
  }
  
}
