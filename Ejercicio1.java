package examen;
/**
 * Calcular sumatorio de dos numeros que n sea mayor que m
 * @author d18sisaj
 *
 */

import java.util.Scanner;

public class Ejercicio1 {

  public static void main(String[] args) {
    
    int numero1=0, numero2=0,n1menosn2, fac1=0, fac2=0,fac1menos2=0;
    Scanner s = new Scanner(System.in); 
   
    while(numero1<=numero2) {
    System.out.println("Introduce un numero:");
    numero1=s.nextInt();
    System.out.println("Introduce otro numero menor que el anterior:");
    numero2=s.nextInt();
    
    if(numero1<=numero2) {
      System.out.println("ERROR: el primer numero debe de ser mayor que el segundo");
    }
    }
    n1menosn2=numero1-numero2;
    for(int i=0; i<numero1; i++ ) {
      if(fac1==0) {
        fac1=numero1*(numero1-1);
            
      }else if((numero1-1-i)!=0) {
        fac1=fac1*(numero1-1-i);
      }
      
    }
    
    for(int i=0; i<numero2; i++ ) {
      if(fac2==0) {
        fac2=numero2*(numero2-1);
            
      }else if((numero2-1-i)!=0) {
        fac2=fac2*(numero2-1-i);
      }
      
    }
    
    for(int i=0; i<n1menosn2; i++ ) {
      if(fac1menos2==0) {
        fac1menos2=n1menosn2*(n1menosn2-1);
            
      }else if((n1menosn2-1-i)!=0) {
        fac1menos2=fac1menos2*(n1menosn2-1-i);
      }
      
    }
    
    float combinatiorio=(fac1/(fac2*fac1menos2));
    
    System.out.println("El combinatorio es: "+combinatiorio);
    
  }

}
