
package com.tallerjava.taller2;

import java.io.IOException;
import java.util.Scanner;


public class punto8 {
    private int registrar;
    private int comprar;
    private int consultar;
    private int opcion;
    private String cliente;
    private int cantidad;
    private String tipoTorta;
    private int valorTorta;
    private String fechaRegistro;
    private String fechaEntrega;
    private int valorApagar;
    private int telefono;
    private String registrarPedido;
    private String torta1;
    private String torta2;
    private String torta3; 
    private int cantidadPorciones1;
    private int cantidadPorciones2;
    private int cantidadPorciones3;
    private String decoracionTorta1;
    private String decoracionTorta2;
    private String decoracionTorta3;
    private String venta;
    private int precio1;
    private int precio2;
    private int precio3;
    private String sabor1;
    private String sabor2;
    private String sabor3;
    
    public static void punto8() throws IOException{
        //mostrar menu
        menu();
        //capturar opcion elegida por el usuario
        int opcion = capturarInt();
        //evaluar la opcion y ejecurla 
        evaluarOpciones(opcion);
        
    }
    //creacion del menu
    private static void menu(){
        System.out.println("Bienvenidos al El pastelero Don Carlos ¡es el mejor pastelero de la ciudad!");
        System.out.println("Ingrese un numero de acuerdo a la operacion que desea realizar");
        System.out.println("1.Registrar pedido");
        System.out.println("2.Consultar torta disponibles");
        System.out.println("3.Comprar torta");
    }
    //creacion metodo para capturar datos String
    
    private static String capturarString(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    
    private static int capturarInt(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    
    private static void evaluarOpciones(int opcion) throws IOException{
        
        String torta1 ="1 libra";
        String torta2 ="2 libra";
        String torta3 ="3 libra";
        
        int cantidadPorciones1 = 7;
        int cantidadPorciones2 = 14;
        int cantidadPorciones3 = 21;
        
        String decoracionTorta1 = "aniversario";
        String decoracionTorta2 = "amor y amistad";
        String decoracionTorta3 = "deporte";
        
        String sabor1 = "chocolate";
        String sabor2 = "vainilla";
        String sabor3 = "yoguort";
        
        int precio1 = 30000;
        int precio2 = 60000;
        int precio3 = 90000;
        
        switch(opcion){
            case 1 ->{
                System.out.println("Nombre del cliente");
                String cliente = capturarString();
                System.out.println("Numero de telefono del cliente");
                int telefono = capturarInt();
                System.out.println("Tipo de torta que desea comprar");
                String tipoTorta = capturarString();
                System.out.println("Cantidad de tortas a comprar");
                int cantidad = capturarInt();
                System.out.println("Fecha de registro del pedido");
                String fechaRegistro = capturarString();
                System.out.println("Fecha de entrega de la torta");
                String fechaEntrega = capturarString();
                System.out.println("Valor a pagar");
                int valorApagar = capturarInt();
                System.out.println("¡Pedidio registrado con exito!");
                System.out.println("Datos del pedido.");
                System.out.println("Nombre del Cliente: "+cliente);
                System.out.println("Telefono del Cliente: "+telefono);
                System.out.println("Tipo de torta a comprar: "+ tipoTorta);
                System.out.println("Cantidad: "+cantidad);
                System.out.println("Fecha de entrega: "+fechaEntrega);
                System.out.println("Fecha de registro del pedido: "+fechaRegistro);
                System.out.println("Valor a pagar: "+valorApagar);
                System.out.println("¡Muchas gracias por visitarnos!");
            } 
            case 2 ->{
                System.out.println("Listado de tortas disponibles con sus respectivos precio.");
                System.out.println(torta1+ " de "+ cantidadPorciones1+ " porciones "+ ", con sabor a "+ sabor1+ ", con un motivo de decoracion de "+ decoracionTorta1+ "; la cual tiene un valor de "+ precio1+ " pesos.");
                System.out.println(torta2+ " de "+ cantidadPorciones2+ " porciones "+ ", con sabor a "+ sabor2+ ", con un motivo de decoracion de "+ decoracionTorta2+ "; la cual tiene un valor de "+ precio2+ " pesos.");
                System.out.println(torta3+ " de "+ cantidadPorciones3+ " porciones "+ ", con sabor a "+ sabor3+ ", con un motivo de decoracion de "+ decoracionTorta3+ "; la cual tiene un valor de "+ precio3+ " pesos.");
                
            }
            case 3 ->{
                System.out.println("Registro de la compra");
                System.out.println("Nombre del cliente");
                String cliente = capturarString();
                System.out.println("Numero de telefono del cliente");
                int telefono = capturarInt();
                System.out.println("Tipo de torta que compra");
                String tipoTorta = capturarString();
                System.out.println("Cantidad de tortas que compra");
                int cantidad = capturarInt();
                System.out.println("Fecha de registro de la compra");
                String fechaRegistro = capturarString();
                System.out.println("Valor a pagar");
                int valorApagar = capturarInt();
                System.out.println("¡Compra registrada con exito!");
                System.out.println("Datos de la compra.");
                System.out.println("Nombre del Cliente: "+cliente);
                System.out.println("Telefono del Cliente: "+telefono);
                System.out.println("Tipo de torta comprada: "+ tipoTorta);
                System.out.println("Cantidad: "+cantidad);
                System.out.println("Fecha de registro de la compra: "+fechaRegistro);
                System.out.println("Valor pagado: "+valorApagar);
                System.out.println("¡Muchas gracias por visitarnos!");
            }
            default -> {
                System.out.println("Opción incorrecta");
                System.in.read();            
            }
        }
        
    }
    
    
}
