
package com.tallerjava.taller4;


class punto3 {
    int num, contador, indice;

    public static void punto3() {
        //declaro e inicializo un avariable para almacenar el valor maximo
        int max = 1000;
        
        //atraves de un ciclo for cuento los numeros del 1 al 1000 y clasifico los numeros primos
        for(int num = 1;num < max;num++){
            int contador = 0;
            for(int i=1;i<=num;i++){
                
                if(num%i==0){
                    contador++;
                }
            }
            if(contador == 2){
                System.out.println("El numero "+ num+ " es primo");
            }
            
        }
        
    }
    
}
