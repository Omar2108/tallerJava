
package com.tallerjava.taller4;

import java.util.Scanner;


class punto1 {
    private int dato,dato2,dato3,dato4,dato5;
    private int indice;
    

    public static void punto1() {
        //creo el arreglo y su longitud
        int miArreglo []= new int[5];
        
        //muestro en pantalla un mensaje al usuario para llenar mi arreglo con los datos ingresados
        mensaje();
        
        //capturo el valor ingresado
        int dato = capturarDato();
        
        mensaje();
        int dato2 = capturarDato();
        
        mensaje();
        int dato3 = capturarDato();
        
        mensaje();
        int dato4 = capturarDato();
        
        mensaje();
        int dato5 = capturarDato();
        
        //se asigna a cada posicion el valor capturado
        miArreglo[0] = dato;
        miArreglo[1] = dato2;
        miArreglo[2] = dato3;
        miArreglo[3] = dato4;
        miArreglo[4] = dato5;
        
        //imprimo el arreglo
        for(int i=0;i < miArreglo.length;i++){
            System.out.println("["+i+"] = "+miArreglo[i]);
        }
        
        
        
    }
    
    //metodo para capturar los datos ingresados por el usuario
    private static int capturarDato(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    
    //metodo para mostrar un mensaje en pantalla al usuario
    private static void mensaje(){
        System.out.println("Ingrese un numero al arreglo");
    }
    
}
