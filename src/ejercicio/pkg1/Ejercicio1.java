/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1;

/**
 *
 * @author Estudiante
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int x=3;
      
      while (x>0) {
          
      if (x==1) {
          System.out.print("d");
          x= x-1;
      }
      
      if (x==2) {
          System.out.print("b c");
      }
      
      if (x>2) {
          System.out.print("a");
      }
       x=x-1;
    System.out.print("-");
     }
    }
}
