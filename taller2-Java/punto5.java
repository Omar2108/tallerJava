
package com.tallerjava.taller2;

import java.io.IOException;
import java.util.Scanner;


public class punto5 {
    private String producto;
    private String prducto1;
    private String prducto2;
    private String prducto3;
    private int opcion;
    private int opcion1;
    private int opcion2;
    private int opcion3;
    private int precioProducto1;
    private int precioProducto2;
    private int precioProducto3;
    private String devolverProducto;
    private String observaciones;
    private String motivo;
        
    
    public static void punto5 () throws IOException{
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
        System.out.println("1.Consultar precios de los productos");
        System.out.println("2.Comprar productos");
        System.out.println("3.Devolver productos");
        
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
    
    //creacion del metodo para evaluar opciones
    
    private static int evaluarOpciones(int opcion)throws IOException{
        String producto1;
        producto1 = "acetamenofen";
        String producto2;
        producto2 = "antigripal";
        String producto3;
        producto3 = "jarabe";
        
        int precioProducto1;
        precioProducto1 =1000;
        int precioProducto2;
        precioProducto2 = 3000;
        int precioProducto3;
        precioProducto3 =20000;
        
        switch(opcion){
            case 1 -> {
                System.out.println("Estas son el listado de los productos disponibles en el momento, con sus respectivos precios");
                System.out.println("La "+producto1+ " tiene un precio de "+ precioProducto1+ " pesos colombianos, la unidad.");
                System.out.println("El "+producto2+ " tiene un precio de "+ precioProducto2+" pesos colombianos, la unidad.");
                System.out.println("El "+producto3+ " tiene un precio de "+ precioProducto3+ " pesos colombianos, la unidad.");
            }
            case 2 -> {
                System.out.println("Escoga del el listado el productos que desea comprar");
                System.out.println(producto1);
                System.out.println(producto2);
                System.out.println(producto3);
                String producto;
                producto = capturarString();
                System.out.println("compra exitosa acaba de comprar el siguiente producto "+ producto+ " ¡muchas gracias por su compra!");
            }
            case 3 -> {
                System.out.println("Motivo por cual desea devolver el producto");
                String motivo;
                motivo = capturarString();
                System.out.println("Observaciones adicionales");
                String observaciones;
                observaciones = capturarString();
                System.out.println("Producto devuelto con exito, el producto se devuelve por el siguiente motivo: "+ motivo+ "; el cual es recibido en la siguientes condiciones: "+observaciones);
            }
            default -> {
                System.out.println("Opción incorrecta");
                System.in.read();            
            }
                
        }
        return 0;
    }
    
    
}
