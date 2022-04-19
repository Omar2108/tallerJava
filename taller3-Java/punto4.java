
package com.tallerjava.taller3;

import java.util.Scanner;


class punto4 {
    private int i;
    private int num;

    public static void punto4() {
        
        //muestro mensaje en pantalla solicitando un numero
        mensaje();
        
        //se captura el numero ingresado por el usuario
        int num = capturarNum();
        
        //se ejecuta el ciclo, creando la tabla de multiplicar del numero ingresado
        tablaMultiplicar(num);
        
    }
    
    //Crea mensaje para solicitar datos
    
    private static void mensaje(){
        System.out.println("Por favor ingrese un numero");
    }
    
    //se creata metodo para capturar el numero
    
    private static int capturarNum(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    
    private static void tablaMultiplicar(int num){
             
        //se ejecuta el ciclo, creando la tabal de multiplicar del numero ingresado
        for(int i = 1; i <=10; i++){
            System.out.println(i+" x "+num+" = "+i*num);
        }
        
       
    }
    
}
