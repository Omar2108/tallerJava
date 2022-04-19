
package com.tallerjava.taller2;

import java.util.Scanner;


public class punto7 {
    private int peso;
    private double estatura;
    private double imc;
    
    public static void punto7(){
        //solicitar peso
        solicitarPeso();
        //capturar peso
        int peso;
        peso = capturarPeso();
        //solicitar estatura
        solicitarEstatura();
        double estatura;
        estatura = capturarEstatura();
        //calcular IMC
        double imc;
        imc = calcularIMC(peso,estatura);
        //evalua el resultado y se muestra el resultado en pantalla
        evaluarOpcion(imc);
        
    }
    
    //creacion metodo para solicitar peso
    private static void solicitarPeso(){
        System.out.println("Ingrese su peso en kilogramos");
    }
    
    //creacion metodo para solicitar estatura
    
    private static void solicitarEstatura(){
       System.out.println("Ingrese su estatura en metros"); 
    }
    
    private static int capturarPeso(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    
    private static double capturarEstatura(){
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }
    
    private static double calcularIMC(int peso,double altura ){
        double imc;
        imc = peso/Math.pow(altura, 2);
        return imc;
    }
    
    private static void evaluarOpcion(double imc){

        if (imc > 18.5) {
	    System.out.println("Usted se encuentra bajo de peso.");
	
        }
        
        if (imc > 18.6 && imc < 24.9) {
	    System.out.println("Usted se encuentra en peso normal");
	
        }

        if (imc > 25.0 && imc < 29.9) {
	    System.out.println("Usted se encuentra en sobrepeso");
	
        }

        if (imc > 30.0) {
	    System.out.println("Usted se encuentra en obesidad");
	
        }
    }
}
