
package com.tallerjava.taller2;

import java.util.Scanner;


public class punto3 {
    
    private String nombres;
    private String apellidos;
    private int edad;
    
    
    public static void punto3 (){
        solicitarNombres();
      String nombres;
      nombres = capturarNombre();
      
      solicitarApellidos();
      String apellidos;
      apellidos = capturarApellidos();
      
      solicitarEdad();
      int edad;
      edad = capturarEdad();
      
      if(edad >= 18){
          System.out.println(nombres+" "+apellidos+" usted es mayor de edad, por lo tanto puede entrar a la fiesta.");
      }else{
          System.out.println(nombres+" "+apellidos+" usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa.");
      }
    
    }
    
    private static void solicitarNombres(){
        System.out.println("Ingrese su nombre");
    }
    private static void solicitarApellidos(){
        System.out.println("Ingrese sus apellidos");
    
    }
    
    private static void solicitarEdad(){
        System.out.println("Ingrese su edad");
    }
    
    private static String capturarNombre(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    
    private static String capturarApellidos(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    
    private static int capturarEdad(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    
}
