
package com.tallerjava.taller3;

import java.io.IOException;
import java.util.Scanner;


class punto7 {
    
    private String placa, placa1, placa2, placa3;
    private String marcaAuto, marcaAuto1, marcaAuto2, marcaAuto3;
    private String nombrecompleto, nombreCompleto1, nombreCompleto2, nombreCompleto3;
    private int telefono, telefono1, telefono2, telefono3;
    private int opcion;
    private String fechaIngreso,fechaIngreso1,fechaIngreso2,fechaIngreso3;
    private boolean control;

    public static void punto7() throws IOException {
        boolean control = true;
        while(control == true){
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
            
        }
        
        
    }
    
    //creacion de un metodo para mostrar el menu de opciones del usuario
    private static void menu(){
        System.out.println("Eligia de la siguintes opciones,el numero deacuerdo con la accion que desea realizar");
        System.out.println("1.Ingresar vehiculo al parqueadero");
        System.out.println("2.Consultar vehiculo en parqueadero");
        System.out.println("3.Retirar vehiculo del parqueadero");
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
        
        String nombreCompleto1 = "Juan cardenas Madera";
	String nombreCompleto2 = "Maria Beltran Ruiz";
	String nombreCompleto3 = "Carlos Rodriguez Beltran";
	
	String placa1 = "12gt2";
	String placa2 = "34s1y";
	String placa3 = "21u7b";
	
	String marcaAuto1 = "mazda";
	String marcaAuto2 = "ferrari";
	String marcaAuto3 = "toyota";
	
	int telefono1 = 1234;
	int telefono2 = 2314;
	int telefono3 = 7890;
	
	String fechaIngreso1 = "12/02/2022 hora: 1:20 pm";
	String fechaIngreso2 = "13/02/2022 hora: 2:40 pm";
	String fechaIngreso3 = "14/02/2022 hora: 4:10 pm";
        switch(opcion){
            case 1 -> {
                //se capturan los datos de ingreso del vehiculo
                System.out.println("Ingrese el numero de la placa del vehiculo.");
                String placa = capturarString();
                System.out.println("Ingrese el nombre completo del propietario o quien registrar el vehiculo");
                String nombreCompleto = capturarString();
                System.out.println("Ingrese el numero del contacto.");
                int telefono = capturarOpcion();
                System.out.println("Ingrese la marca del vehiculo ingresado.");
                String marcaAuto = capturarString();
                System.out.println("Ingrese la fecha y hora ingreso del vehiculo.");
                String fechaIngreso = capturarString();
                
                //se imprime en pantalla los datos de ingreso
                System.out.println("¡Vehiculo ingresado exitsamente!");
                System.out.println("Datos del ingreso al parqueadero");
                System.out.println("Nombre completo del dueño del vehiculo: "+nombreCompleto);
                System.out.println("Numero de telefono de contacto: "+telefono);
                System.out.println("Numero de placa del vehiculo: "+placa);
                System.out.println("Marca del vehiculo: "+marcaAuto);
                System.out.println("Fecha de ingreso al parqueadero: "+fechaIngreso);
                
            }
            case 2 -> {
                //se solicita datos al usuario para ejecutar la consulta
                System.out.println("Ingrese el numero de la placa del vehiculo a buscar");
                String placa = capturarString();
                
                //se ejecuta la consulta
                if(placa==placa1){
                    System.out.println("el vehiculo se encuentra ingresado al parqueadero");
                    System.out.println("Nombre completo del dueño del vehiculo: "+nombreCompleto1);
                    System.out.println("Numero de telefono de contacto: "+telefono1);
                    System.out.println("Numero de placa del vehiculo: "+placa1);
                    System.out.println("Marca del vehiculo: "+marcaAuto1);
                    System.out.println("Fecha de ingreso al parqueadero: "+fechaIngreso1);
                    
                }else if(placa == placa2){
                    System.out.println("el vehiculo se encuentra ingresado al parqueadero");
                    System.out.println("Nombre completo del dueño del vehiculo: "+nombreCompleto2);
                    System.out.println("Numero de telefono de contacto: "+telefono2);
                    System.out.println("Numero de placa del vehiculo: "+placa2);
                    System.out.println("Marca del vehiculo: "+marcaAuto2);
                    System.out.println("Fecha de ingreso al parqueadero: "+fechaIngreso2);
                }else if(placa == placa3){
                    System.out.println("el vehiculo se encuentra ingresado al parqueadero");
                    System.out.println("Nombre completo del dueño del vehiculo: "+nombreCompleto3);
                    System.out.println("Numero de telefono de contacto: "+telefono3);
                    System.out.println("Numero de placa del vehiculo: "+placa3);
                    System.out.println("Marca del vehiculo: "+marcaAuto3);
                    System.out.println("Fecha de ingreso al parqueadero: "+fechaIngreso3);
                }else{
                    System.out.println("La placa del vehiculo ingresada, no se encuentra registrada en el sistema");
                }
            }
            case 3 -> {
                //se solicita y se captura los datos para consultar si el vehiculo de encuentra en el parqueadero
                System.out.println("Ingrese el numero de la placa del vehiculo a buscar");
                String placa = capturarString();
                
                //se realiza un comprobacion de la placa ingresado 
                if(placa == placa1 || placa ==placa2 || placa ==placa3){
                    System.out.println("Ingrese la fecha y hora de retiro del vehiculo del parqueadero");
                    String fechaRetiro = capturarString();
                    
                    System.out.println("El vehiculo de placa :"+ placa);
                    System.out.println("Fue retirado con exito del parqueadero en la fecha de: "+ fechaRetiro);
                    System.out.println("¡FELIZ VIAJE!");
                }else{
                    System.out.println("El numero de placa del vehiculo no se encuntra ingresado al parqueadero.");
                }
                
            }
            default -> {
                System.out.println("Opción incorrecta");
                System.in.read();            
            }
        }
    }
    
    
    
}
