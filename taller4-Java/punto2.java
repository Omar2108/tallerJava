
package com.tallerjava.taller4;


import java.util.Random;


class punto2 {

    public static void punto2() {
        int arr []= new int[20];
        int min = 1;
        int max = 100;
        int valor;
        
        //atrave de un ciclo for lleno el arraglo con numeros aleatorias
        for(int i = 0; i < arr.length; i++){
           Random random = new Random();
           valor = random.nextInt(min + max);
           arr[i] = valor;
        }
        
        //clasifico e imprimo los numeros del arreglo en pares e impares
        
        //numeros pares
        System.out.print("Numeros pares: ");
        for(int i = 0; i < arr.length; i++){
            //se comprueba si es numero par 
            if((arr[i] % 2) == 0){
                if(arr[i]==arr.length){
                   System.out.println(arr[i]);
                }
                System.out.print(arr[i]+", ");  
                             
            }
            
        }
        System.out.println();
        
        //numeros impares
        System.out.print("Numeros impares: ");
        for(int i = 0; i < arr.length; i++){
            //se comprueba si es numero impar
            if((arr[i] % 2) > 0){
                if(arr[i]==arr.length){
                    System.out.println(arr[i]);
                }
                System.out.print(arr[i]+", ");                
            }
            
        }
        System.out.println();
        
        
        
    }
    
}
