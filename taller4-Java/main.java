
package com.tallerjava.taller4;

import java.io.IOException;
import java.util.Scanner;


public class main {
     private static boolean control = true;
    private static int opcion;
    
    public static void main(String[] args) throws IOException{
         //se emplea el ciclo do while para ejecutar la aplicacion
        do{
            //se limpia de pantalla
            limpiarPantalla();
            
            //se muestra el menu al usuario
            menu();
            
            //se captura la opcion elegida por el usuario
            opcion = capturar();
            
            //se evalua y se ejecuta la opcion elegida por el usuario
            control = evaluarOpcion(opcion);
        }while(control==true);   
        
    }
    //se un metodo para el menu de opciones del usuario
    private static void menu(){
        System.out.println("Escoja un punto del taller 4 que desee que se ejecute");
        System.out.println("1. Punto #1");
        System.out.println("2. Punto #2");
        System.out.println("3. Punto #3");
        System.out.println("4. Punto #4");
        System.out.println("5. Punto #5");
        System.out.println("0. Salir del taller");
    }
    
    //metodo para capturar la opcion elegida por el usuario
    private static int capturar(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    
    //metodo para evaluar la opcion elegida por el usuario 
    private static boolean evaluarOpcion(int opcion) throws IOException{
        
        switch(opcion){
            case 1 -> {
                punto1 p1;
                p1 = new punto1();
                punto1.punto1();
                return true;
            }
            case 2 -> {
                punto2 p2;
                p2 = new punto2();
                punto2.punto2();
                return true;
            }  
  
            case 3 -> {
                punto3 p3;
                p3 = new punto3();
                punto3.punto3();
                return true;
            }  
            case 4 -> {
                punto4 p4; 
                p4 = new punto4();
                punto4.punto4();
                return true;
            }  
            case 5 -> {
                punto5 p5;
                p5 = new punto5();
                punto5.punto5();
                return true;
            }
            
            case 0 ->{
                boolean control;
                control = false;
            }
            default -> {
                System.out.println("Opción incorrecta");
                System.in.read();            
            }
        }
        return false;
       
        
    }
    
    //metodo para limpiar la pantalla
   private static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }   
 
}//fin de la clase
