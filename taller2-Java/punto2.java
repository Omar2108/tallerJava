
package com.tallerjava.taller2;

import java.util.Scanner;


public class punto2 {
    
    private int edad;
    
    public static void punto2 (){
            
      solicitarEdad();
      int edad;
      edad = capturarEdad();
      
      if(edad < 18){
          System.out.println("Usted aún es un niño(a).");
      }
        
        
    }
    
  
    
    private static void solicitarEdad(){
        System.out.println("Ingrese su edad");
    }
    
    
    private static int capturarEdad(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}
