
package com.tallerjava.taller3;

import java.io.IOException;
import java.util.Scanner;


class punto8 {
    private boolean control;
    private int opcion;
    private String estudiante,estudiante1,estudiante2,estudiante3;
    private int documento,documento1,documento2,documento3;
    private int telefono,telefono1,telefono2,telefono3;
    private String resultado,resultado1,resultado2,resultado3;
    private String fechaIngreso,fechaIngreso1,fechaIngreso2,fechaIngreso3;

    public static void punto8() throws IOException {
        boolean control = true;
        
        do{
            //se muestra el menu de opciones al usuario
            menu();
        
            //se captura la opcion elegida por el usuario
            int opcion = capturarOpcion();
        
            //se evalua y se ejecuta la accion elegida por el usuario 
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
        }while(control ==true);
        
    }
    
    //creacion de un metodo para mostrar el menu de opciones del usuario
    private static void menu(){
        System.out.println("Eligia de la siguintes opciones,el numero deacuerdo con la accion que desea realizar");
        System.out.println("1.Ingresar al curso");
        System.out.println("2.Consultar estudiantes");
        System.out.println("3.Consultar resultados por estudiante");
    }
    
    //metodo para capturar la opcion elegida por el usuario
    private static int capturarOpcion(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    
    //metodo para mostrar mensaje de salida del sistema
    private static void mensaje(){
        System.out.println("Desea salir del aplicativo ingrese 0");
    }
    
    //metodo para capturar datos de tipo string
    private static String capturarString(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    
    //metodo para evlaur la opcion elegida por el usuario
    private static void evaluarOpcion(int opcion) throws IOException{
        
        String estudiante1 = "Juan cardenas Madera";
	String estudiante2 = "Maria Beltran Ruiz";
	String estudiante3 = "Carlos Rodriguez Beltran";
	
	int documento1 = 1234;
	int documento2 = 7890;
	int documento3 = 9870;
	
	int telefono1 = 1234;
	int telefono2 = 2314;
	int telefono3 = 9870;
	
	String fechaIngreso1 = "12/02/2022 hora: 1:20 pm";
	String fechaIngreso2 = "13/02/2022 hora: 2:40 pm";
	String fechaIngreso3 = "14/02/2022 hora: 4:10 pm";
	
	String resultado1 = "aprobado";
	String resultado2 = "no-aprobado";
	String resultado3 = "En aprobacion";
        
        switch(opcion){
            case 1 -> {
                //se capturan los datos de ingreso del vehiculo
                System.out.println("Ingrese el nombre completo del estudiante");
                String estudiante = capturarString();
                System.out.println("Ingrese le numero de documento.");
                int documento = capturarOpcion();
                System.out.println("Ingrese le numero del contacto.");
                int telefono = capturarOpcion();
                System.out.println("Ingrese la fecha de resgistro al curso.");
                String fechaIngreso = capturarString();
                
                
                //se imprime en pantalla los datos de ingreso
                System.out.println("¡Ha sido registrado exitsamente en el curso de conduccion!");
                System.out.println("Datos de ingreso al curso de conduccion");
                System.out.println("Nombre completo del estudiante: "+estudiante);
                System.out.println("Numero de documento del estudiante: "+documento);
                System.out.println("Numero de telefono de contacto: "+telefono);
                System.out.println("Fecha de ingreso al curso: "+fechaIngreso);
                             
                
            }
            case 2 -> {
                //se imprime los datos de los estudiantes registrados en el sistema
                System.out.println("Listado de Contactos Existente");
                System.out.println();
                System.out.println("Nombre completo del estudiante: "+estudiante1);
                System.out.println("Numero de documento: "+documento1);
                System.out.println("Numero de telefono del contacto: "+telefono1);
                System.out.println("Fecha de ingreso: "+fechaIngreso1);
                System.out.println();
                
                System.out.println("Nombre completo del estudiante: "+estudiante2);
                System.out.println("Numero de documento: "+documento2);
                System.out.println("Numero de telefono del contacto: "+telefono2);
                System.out.println("Fecha de ingreso: "+fechaIngreso2);
                System.out.println();
                
                System.out.println("Nombre completo del estudiante: "+estudiante3);
                System.out.println("Numero de documento: "+documento3);
                System.out.println("Numero de telefono del contacto: "+telefono3);
                System.out.println("Fecha de ingreso: "+fechaIngreso3);
                
            }
            case 3 -> {
                //se solicita y captura el numero de documento por el cual se ejecuta la consulta en el sistema
                System.out.println("Ingrese el numero de documento del estudiante");
                int documento = capturarOpcion();
                
                //se verifica en el sistema si el numero de documento existe en el sistema y se muestra su informacion
                if(documento == documento1){
                    System.out.println("Datos del estudiante");
                    System.out.println("Nombre completo del estudiante: "+estudiante1);
                    System.out.println("Numero de documento: "+documento1);
                    System.out.println("Numero de telefono del contacto: "+telefono1);
                    System.out.println("Fecha de ingreso: "+fechaIngreso1);
                    System.out.println("Estado del curso: "+ resultado1);
                    
                }else if(documento ==documento2){
                    System.out.println("Datos del estudiante");
                    System.out.println("Nombre completo del estudiante: "+estudiante2);
                    System.out.println("Numero de documento: "+documento2);
                    System.out.println("Numero de telefono del contacto: "+telefono2);
                    System.out.println("Fecha de ingreso: "+fechaIngreso2);
                    System.out.println("Estado del curso: "+ resultado2);
                }else if(documento == documento3){
                    System.out.println("Datos del estudiante");
                    System.out.println("Nombre completo del estudiante: "+estudiante3);
                    System.out.println("Numero de documento: "+documento3);
                    System.out.println("Numero de telefono del contacto: "+telefono3);
                    System.out.println("Fecha de ingreso: "+fechaIngreso3);
                    System.out.println("Estado del curso: "+ resultado3);
                } else {
                    System.out.println("La persona con el numero de documento ingresado no se encuentra registrado en el sistema");
                }
                
            }
            default -> {
                System.out.println("Opción incorrecta");
                System.in.read();            
            }
        }    
    }
    
    
    
}
