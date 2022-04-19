
package com.tallerjava.taller2;

import java.io.IOException;
import java.util.Scanner;


public class punto6 {
    private String servicio;
    private int ingreso;
    private int salida;
    private int opcion;
    private String fechaSalida;
    private String fechaIngreso;
    private String observaciones;
    private String arregloRealizados;
    private String cliente;
    private String tipoMoto;
    private int cilindraje;
    private String marca;
    private int cantidad;
    
    public static void punto6() throws IOException{
        //Mostrar menu
        menu();
        //capturar la opcion del usuario
        int opcion = capturarOpcion();
        //evaluar y ejecutar la opcion del usuario
        evaluarOpciones(opcion); 
        
    }
    
    //creacion del menu
    private static void menu(){
        System.out.println("Ingrese un numero de acuerdo a la operacion que desea realizar");
        System.out.println("1.Ingreso al taller");
        System.out.println("2.Salida del taller");        
    }
    
     private static int capturarOpcion(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    //crear un metodo para capturar un String
    private static String capturarString(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    //crear un metodo para capturar un numeros enteros
    private static int capturarInt(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    
   
    
    private static void evaluarOpciones(int opcion) throws IOException{
        switch(opcion){
            case 1 -> {
                System.out.println("Fecha de ingreso al taller");
                String fechaIngreso;
                fechaIngreso = capturarString();
                System.out.println("Nombres del clientes");
                String cliente;
                cliente = capturarString();
                System.out.println("Cantidad de motos que ingresan");
                int cantidad;
                cantidad =capturarInt();
                System.out.println("Tipo de moto que ingresa");
                String tipoMoto;
                tipoMoto = capturarString();
                System.out.println("Marca de la moto que ingresa");
                String marca;
                marca = capturarString();
                System.out.println("Cilindraje de la moto que ingresa");
                int cilindraje;
                cilindraje = capturarInt();
                System.out.println("Motivo por el cual ingresa");
                String servicio;
                servicio = capturarString();
                System.out.println("Registro exitoso!,la moto que se recibio, tiene la siguientes caracteristicas:");
                System.out.println("Fecha de ingreso: "+ fechaIngreso);
                System.out.println("Motivo de ingreso: "+ servicio);
                System.out.println("Nombre del Clientes: "+ cliente);
                System.out.println("Espeficicaciones de la moto que ingresa: ");
                System.out.println("Tipo de moto: "+ tipoMoto);
                System.out.println();
                System.out.println("Marca de la moto: "+ marca);
                System.out.println("Cilindraje: "+cilindraje+" CC");
                System.out.println("Cantidad de moto(s) que ingresan: "+ cantidad);
                System.out.println("¡Muchas gracias por visitarnos!");
            }
            case 2 -> {
                System.out.println("Fecha de salida del taller");
                String fechaSalida;
                fechaSalida = capturarString();
                System.out.println("Nombres del clientes");
                String cliente;
                cliente = capturarString();
                System.out.println("Cantidad de motos que salen");
                int cantidad;
                cantidad =capturarInt();
                System.out.println("Tipo de moto que sale");
                String tipoMoto;
                tipoMoto = capturarString();
                System.out.println("Marca de la moto que sale");
                String marca;
                marca = capturarString();
                System.out.println("Cilindraje de la moto que sale");
                int cilindraje;
                cilindraje = capturarInt();
                System.out.println("Motivo de salida");
                String servicio;
                servicio = capturarString();
                System.out.println("Observaciones adcionales");
                String observaciones;
                observaciones = capturarString();
                System.out.println("Registro exitoso!,la moto que sale, tiene las siguientes caracteristicas:");
                System.out.println("Fecha de salida: "+ fechaSalida);
                System.out.println("Motivo de salida: "+ servicio);
                System.out.println("Nombre del Clientes: "+ cliente);
                System.out.println("Espeficicaciones de la moto que sale: ");
                System.out.println("Tipo de moto: "+ tipoMoto);
                System.out.println();
                System.out.println("Marca de la moto: "+ marca);
                System.out.println("Cilindraje: "+cilindraje+" CC");
                System.out.println("Cantidad de moto(s) que salen: "+ cantidad);
                System.out.println("¡Muchas gracias por visitarnos!");
            }
            default -> {
                System.out.println("Opción incorrecta");
                System.in.read();            
            }
        }
        
    }
    
}
