
package com.tallerjava.taller2;

import java.util.Scanner;


public class punto1 {
    
    private int edad;
    
    public static void punto1(){
        
        solicitarEdad();
        int edad;
        edad = capturarEdad();
        
        if(edad>=18){
            System.out.println("Usted es mayor de edad");
        }else{
            System.out.println("Usted es menor de edad");
        }
        
        
    }
    
    private static int capturarEdad(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    
    private static void solicitarEdad(){
        System.out.println("Ingrese su edad");
    }
    
}
