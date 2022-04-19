
package com.tallerjava.taller3;

class punto1 {
    private int a,b,c;
   
    
   public static void punto1() {
       
        int a=1;
        int asterisco=1;
        int espacios= a-1;
           
        for (a=1; a < 10; a++) { 
            
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
        
    }
   
   
    
}
