
package com.tallerjava.taller3;

import java.io.IOException;
import java.util.Scanner;


class punto6 {

    
    private int telefono, telefono1, telefono2, telefono3;
    private String nombres;
    private String organizacion, organizacion1,organizacion2,organizacion3;
    private boolean control;
    private String contacto,contacto1,contacto2,contacto3;
    private int opcion;

    public static void punto6() throws IOException {
        boolean control = true;
        do{
            //se muestra el menu de opciones en pantalla
            menu();
            
            //se captura la opcion elegida por el usuario
            int opcion = capturarOpcion();
            
            //se evalua y se ejecuta la opcion elegida por el usuario
            evaluarOpcion(opcion);
            
            //se muestra un mensaje en pantalla inidinadole al usuario si desea salir del sistema
            mensaje();
            
            //se captura y se evalua la opcion elegida por el usuario
            opcion = capturarOpcion();
            if(opcion==0){
                control =false;
            }else {
                menu();
            }
        }while(control==true);
        
    }
    //se crea un metodo para mostrar el menu de opciones del usuario
    private static void menu(){
        System.out.println("Eligia de la siguintes opciones,el numero deacuerdo con la accion que desea realizar");
        System.out.println("1.Agregar");
        System.out.println("2.Consultar");
        System.out.println("3.Eliminar");
    }
    
    //se crea un metodo para capturar la opcion elegida por el usuario
    private static int capturarOpcion(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    
    //se crea un metodo para mostrar un mensaje en pantalla
    private static void mensaje(){
        System.out.println("Desea salir del aplicativo ingrese 0");
    }
    
    //se crea un metodo para capturar strings
    private static String capturarString(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
 
    
    //se crea un metodo para evaluar la opcion ingresada por el usuario
    private static void evaluarOpcion(int opcion) throws IOException{
        int telefono1 = 1234;
	int telefono2 = 2347;
	int telefono3 = 7890;
	
	String contacto1 = "Federico Gonzalez Perez";
	String contacto2 = "Orlando Chamorro Ruiz";
	String contacto3 = "Maria Mendez Tovar";
	
	String organizacion1 = "Fundacion de la mujer";
	String organizacion2 = "Fundacion por un mejor vivir";
        String organizacion3 = "Fundacion por una ninez mejor";
        
        switch(opcion){
            
            case 1 -> {
                System.out.println("Ingrese su numero de telefono.");
                int telefono = capturarOpcion();
                if(telefono == telefono1){
                    System.out.println("El numero telefonico que esta intentado agregar, ya se encuentra registrado");
                }else if(telefono == telefono2){
                 System.out.println("El numero telefonico que esta intentado agregar, ya se encuentra registrado"); 
               }else if(telefono == telefono3){
                 System.out.println("El numero telefonico que esta intentado agregar, ya se encuentra registrado"); 
               } else{
                   System.out.println("Ingrese su numero de telefono.");
                   telefono = capturarOpcion();
                   System.out.println("Ingrese su nombre completo.");
                   String nombres = capturarString();
                   System.out.println("Nombre de la organizacion a la que pertenece.");
                   String organizacion = capturarString();
                   System.out.println("¡Contacto agregado exitsamente!");
                   System.out.println("Datos del contacto agregado");
                   System.out.println("Nombre completo: "+nombres);
                   System.out.println("Numero de telefono: "+telefono);
                   System.out.println("Nombre de la organizacion: "+organizacion);
               }
                
            }
            case 2 -> {
                System.out.println("Listado de Contactos Existente");
                System.out.println("Nombre completo del contacto: "+contacto1);
                System.out.println("Numero de teleno del contacto: "+telefono1);
                System.out.println("Organizacion a la que pertenece el contacto: "+organizacion1);
                System.out.println();
                
                System.out.println("Nombre completo del contacto: "+contacto2);
                System.out.println("Numero de teleno del contacto: "+telefono2);
                System.out.println("Organizacion a la que pertenece el contacto: "+organizacion2);
                System.out.println();
                
                System.out.println("Nombre completo del contacto: "+contacto3);
                System.out.println("Numero de teleno del contacto: "+telefono3);
                System.out.println("Organizacion a la que pertenece el contacto: "+organizacion3);
               
            }
            case 3 -> {
                System.out.println("Eliga el numero del contacto que desea eliminar");
                System.out.println("1."+telefono1);
                System.out.println("2."+telefono2);
                System.out.println("3."+telefono3);
                opcion = capturarOpcion();
                if(opcion !=0){
                    System.out.println("¡Esta seguro del eliminar el contacto!");
                    String contacto=capturarString();
                    if("si".equals(contacto)){
                        System.out.println("¡Contacto Eliminado con exito!");
                    }
                } else {
                    System.out.println("¡Error. El contacto no pudo ser eliminado intente nuevamente!");
                }
            }
            default -> {
                System.out.println("Opción incorrecta");
                System.in.read();            
            }
        }
        
    }
    
}
