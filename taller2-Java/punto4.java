
package com.tallerjava.taller2;

import java.io.IOException;
import java.util.Scanner;


public class punto4 {
    private String pelicula;
    private String pelicula1;
    private String pelicula2;
    private  String pelicula3;
    private String fecha;
    private String devolverPelicula;
    private  int Opcion;
    private String Observaciones;
    
    public static void punto4() throws IOException{
        //Mostrar menu
        menu();
        //capturar la opcion del usuario
        int opcion = capturarOpcion();
        //evaluar y ejecutar la opcion del usuario
        evaluarOpcion(opcion);       
    }
    
    //crear un metodo para mostrar el menu de opciones 
    private static void menu(){
        System.out.println("Ingrese un numero de acuerdo a la operacion que desea realizar");
        System.out.println("1. consultar peliculas disponibles");
        System.out.println("2. alquilar peliculas");
        System.out.println("3. recibir peliculas");
        System.out.println("4. observaciones");
    }
    //crear un metodo para capturar la opcion elegida por el usuario
    private static int capturarOpcion(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    //crear un metodo para capturar un String
    private static String capturarString(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    //crear un metodo para evaluar la opcion ingresada por el usuario
    private static int evaluarOpcion(int opcion) throws IOException{
                
        String pelicula1 = "encanto";
        String pelicula2 = "mi probre angelito";
        String pelicula3 = "Rambo";
       
        switch(opcion){
            case 1 -> {
                System.out.println("Estas son el listado de peliculas disponibles");
                System.out.println(pelicula1);
                System.out.println(pelicula2);
                System.out.println(pelicula3);
                break;
            }
            case 2 -> {
                System.out.println("Eliga la pelicula que desea alquilar");
                System.out.println(pelicula1);
                System.out.println(pelicula2);
                System.out.println(pelicula3);
                String pelicula;
                pelicula = capturarString();
                System.out.println("Alquilo la siguiente pelicula, "+pelicula+" Muchas gracias por visitarnos");
                break;
          
            }
            case 3 -> {
                System.out.println("Fecha de entrega de la peliculas");
                String fecha;
                fecha = capturarString();
                String devolverPelicula;
                System.out.println("Fecha que se debe devolver la pelicula");
                devolverPelicula = capturarString();
                fecha = capturarString();
                String observaciones;
                System.out.println("Tiene observaciones con respeto a la entregue de la pelicula");
                observaciones = capturarString();
                System.out.println("Muchas gracias por visitarnos, la pelicula se entrega con la siguinetes condiciones: "+observaciones+"se entrego en la fecha de "+fecha);
                break;
            }
            case 4 -> {
                System.out.println("Tiene observaciones adcionales");
                String observaciones;
                observaciones = capturarString();
                System.out.println(observaciones);
                break;
            }
            default -> {
                System.out.println("Opción incorrecta");
                System.in.read();            
            }

                
        }
        return 0;
    }//FIN DEL METODO PRINCIPAL
}//FIN DE LA CLASE
