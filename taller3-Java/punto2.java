
package com.tallerjava.taller3;

import java.util.Scanner;


class punto2 {
    
    private int a,b,c;
    private boolean control;

    public static void punto2() {
        boolean control = true;
        //mensaje 
       mensaje();
       //captura la anchura
       int ancho = capturarAncho();
        
        int asterisco=1;
        int espacios= ancho-1;
        while(control){
            for (int a=1; a < ancho; a++) { 
            
               //Espacios
                for(int b = 1; b<espacios;b++){
               
                    System.out.print(" "); 
                }
                //asteriscos
                for(int c = 1;c <=asterisco;c++){
                    System.out.print("*");
                }
           
                System.out.println(); 
                asterisco++;
                espacios--;
                        
            }
            control =false;
        }
        
    }
    
    private static int capturarAncho(){
       Scanner input = new Scanner(System.in);
        return input.nextInt();
   }
   
   private static void mensaje(){
       System.out.println("Por favor, ingrese el ancho que desea que tenga la figura");
   }
    
}
