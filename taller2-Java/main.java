
package com.tallerjava.taller2;

import java.io.IOException;
import java.util.Scanner;

public class main {
    private static boolean control = true;
    private static int opcion;
    
    public static void main (String[] args) throws IOException{
        do{
            limpiarPantalla();
            menu();
            opcion = capturar();
            control = evaluarOpcion(opcion);
        }while(control==true);      
    }
    
    private static void menu(){
        System.out.println("Escoja un punto del taller 2 que desee que se ejecute");
        System.out.println("1. Punto #1");
        System.out.println("2. Punto #2");
        System.out.println("3. Punto #3");
        System.out.println("4. Punto #4");
        System.out.println("5. Punto #5");
        System.out.println("6. Punto #6");
        System.out.println("7. Punto #7");
        System.out.println("8. Punto #8");
        System.out.println("9. Punto #9");
        System.out.println("10. Punto #10");
        System.out.println("0. Salir del taller");
    }
    
    private static int capturar(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    
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
            case 6 -> {
                punto6 p6;
                p6 = new punto6();
                punto6.punto6();
                return true;
            }
            case 7 -> {
                punto7 p7;
                p7 = new punto7();
                punto7.punto7();
                return true;
            }
            case 8 -> {
                punto8 p8;
                p8 = new punto8();
                punto8.punto8();
                return true;
            }
            case 9 -> {
                punto9 p9;
                p9 = new punto9();
                punto9.punto9();
                return true;
            }
            case 10 -> {
                punto10 p10;
                p10 = new punto10();
                punto10.punto10();
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
   private static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }   
    
    
    
}
