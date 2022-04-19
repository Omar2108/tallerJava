
package com.tallerjava.taller3;

import java.io.IOException;
import java.util.Scanner;


class punto5 {
    private boolean control ;
    private int opcion;
    
    

    public static void punto5() throws IOException {
        boolean control = true;
        do{
            //se muestra el menu
            menu();
            //se captura la opcion elegida por el usuario
            int opcion = capturarOpcion();
            
            //evaluo y ejecuto la opcion seleccionada
            
            control = evaluarOpcion(opcion);
        }while(control == true);
        
    }
    
    private static void menu(){
        System.out.println("Menu del usuario");
        System.out.println("1.Capturar nombre");
        System.out.println("2.Saludar persona");
        System.out.println("3.Salir del sistema");
    }
    
    private static int capturarOpcion(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    
    private static void mensaje(){
        System.out.println("Por favor ingrese su nombre");
    }
    
     private static String capturarNombre() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    
    
    private static boolean evaluarOpcion(int opcion) throws IOException{
        switch(opcion){
            case 1 -> {
                //solicito el nombre del usuario
                mensaje();
                //capturo el nombre 
                capturarNombre();
                return true;
            }
            case 2 -> {
                System.out.println("¡Hola como estas, bienvenido!");
                return true;
            }
            case 3 -> {
                boolean control;
                control = false;
            }
            default -> {
                System.out.println("Opción incorrecta");
                System.in.read(); 
                return true;
            }
        }
        return false;
    }
    
    
    
    
   
    
}
