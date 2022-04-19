
package com.tallerjava.taller2;

import java.util.Scanner;

public class punto10 {
    private int cuenta1, cuenta2, cuenta3;
    private int cantidad;
    private String estado1, estado2;
    private String tipoCuenta1, tipoCuenta2;
    private String titular1, titular2, titular3;
    private int saldo, saldo1, saldo2, saldo3;
    private int documento1, documento2, documento3;
    private int monto;
    private int clave, clave1, clave2, clave3;
    private int opcion;
    
    public static void punto10(){
        //mostrar menu
        menu();
        
        //capturar opcion elegida por el usuario
        int opcion = capturarOpcion();
        
        //evaluar y ejecutar la accion elegida por el usuario
        evaluarOpcion(opcion);
        
    }
    
    private static void menu(){
        System.out.println("Ingrese el numero de acuerdo a la operacion que desea realizar");
        System.out.println("1.Consultar");
        System.out.println("2.Retirar");
        System.out.println("3.Consignar");
    }
    
    private static int capturarOpcion(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    
    private static void evaluarOpcion(int opcion){
      
        String titular1 = "Omar Rodriguez";
	String titular2 = "Maria mendez";
	String titular3 = "Ana Chamorro";
        
        int cantidad = 1;
	
	int documento1 = 1234;
	int documento2 = 2345;
	int documento3 = 7890;
	
	int cuenta1 = 1111111;
	int cuenta2 = 2222222;
	int cuenta3 = 3333333;
	
	int clave1 = 123;
	int clave2 = 234;
	int clave3 = 789;
	
	String estado1 = "activa";
	String estado2 = "inactiva";
	
	String tipoCuenta1 = "ahorro";
	String tipoCuenta2 = "corriente";
	
	int saldo1 = 10000;
	int saldo2 = 100000;
	int saldo3 = 20000000;
        
        if(opcion==1){
            System.out.println("Consulta detalla de sus productos");
            System.out.println("Ingrese su numero de documento");
            
            opcion = capturarOpcion();
            
            if(opcion==documento1){
                System.out.println("Datos del Clientes");
                System.out.println("Nombre del titula de la cuenta: "+titular1);
                System.out.println("Cantidad de productos del cliente: "+ cantidad);
                System.out.println("Tipo de cuenta: "+ tipoCuenta1);
                System.out.println("Estado de sus productos");
                System.out.println("Estado de la cuenta: "+ estado1);
                System.out.println("Saldo de la cuenta: "+ saldo1);
            }
            
             if(opcion==documento2){
                System.out.println("Datos del Clientes");
                System.out.println("Nombre del titula de la cuenta: "+titular2);
                System.out.println("Cantidad de productos del cliente: "+ cantidad);
                System.out.println("Tipo de cuenta: "+ tipoCuenta2);
                System.out.println("Estado de sus productos");
                System.out.println("Estado de la cuenta: "+ estado1);
                System.out.println("Saldo de la cuenta: "+ saldo2);
            }
             
              if(opcion==documento3){
                System.out.println("Datos del Clientes");
                System.out.println("Nombre del titula de la cuenta: "+titular3);
                System.out.println("Cantidad de productos del cliente: "+ cantidad);
                System.out.println("Tipo de cuenta: "+ tipoCuenta2);
                System.out.println("Estado de sus productos");
                System.out.println("Estado de la cuenta: "+ estado1);
                System.out.println("Saldo de la cuenta: "+ saldo3);
            }
        }
        
        if(opcion==2){
            System.out.println("Ingrese su numero de documento");
            int documento;
            documento = capturarOpcion();
            System.out.println("Ingrese su numero de documento");
            int clave = capturarOpcion();
            
            if(documento == documento1 && clave==clave1){
               System.out.println("Ingrese el monto a retirar");
               int monto = capturarOpcion(); 
               if(monto < saldo1){
                   System.out.println("Transaccion exitosa, por favor retire su dinero");
                   int saldo = saldo1 - monto;
                   System.out.println("Su nuevo saldo es de: "+saldo+" Pesos");
               }else{
                  System.out.println("Saldo insuficiente"); 
               }  
            }
            
            if(documento == documento2 && clave==clave2){
               System.out.println("Ingrese el monto a retirar");
               int monto = capturarOpcion(); 
               if(monto < saldo1){
                   System.out.println("Transaccion exitosa, por favor retire su dinero");
                   int saldo = saldo2 - monto;
                   System.out.println("Su nuevo saldo es de: "+saldo+" Pesos");
               }else{
                  System.out.println("Saldo insuficiente"); 
               } 
            }
            
            if(documento == documento3 && clave==clave3){
               System.out.println("Ingrese el monto a retirar");
               int monto = capturarOpcion(); 
               if(monto < saldo3){
                   System.out.println("Transaccion exitosa, por favor retire su dinero");
                   int saldo = saldo3 - monto;
                   System.out.println("Su nuevo saldo es de: "+saldo+" Pesos");
               }else{
                  System.out.println("Saldo insuficiente"); 
               }                
            }
             
        }
        
        if(opcion==3){
            System.out.println("Ingrese su numero de documento");
            int documento;
            documento = capturarOpcion();
            System.out.println("Ingrese su numero de documento");
            int clave = capturarOpcion();
            
            if(documento == documento1 && clave==clave1){
               System.out.println("Ingrese el monto a consignar");
               int monto = capturarOpcion(); 
               if(monto < 0){
                   System.out.println("No se puede consignar un valor inferior a 0, intentelo de nuevo, muchas gracias");  
               }else{
                   System.out.println("¡Transaccion exitosa!, su consignacion fue realizada con exito");
                  int saldo = saldo1 + monto;
                  System.out.println("Su nuevo saldo es de: "+saldo+" Pesos");
               }  
            }
            
            if(documento == documento2 && clave==clave2){
               System.out.println("Ingrese el monto a consignar");
               int monto = capturarOpcion(); 
               if(monto < 0){
                   System.out.println("No se puede consignar un valor inferior a 0, intentelo de nuevo, muchas gracias");  
               }else{
                   System.out.println("¡Transaccion exitosa!, su consignacion fue realizada con exito");
                  int saldo = saldo2 + monto;
                  System.out.println("Su nuevo saldo es de: "+saldo+" Pesos");
               }
            }
            
            if(documento == documento3 && clave==clave3){
               System.out.println("Ingrese el monto a consignar");
               int monto = capturarOpcion(); 
               if(monto < 0){
                   System.out.println("No se puede consignar un valor inferior a 0, intentelo de nuevo, muchas gracias");  
               }else{
                   System.out.println("¡Transaccion exitosa!, su consignacion fue realizada con exito");
                  int saldo = saldo3 + monto;
                  System.out.println("Su nuevo saldo es de: "+saldo+" Pesos");
               }                
            }
            
        }
    }
}
