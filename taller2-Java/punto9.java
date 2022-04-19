
package com.tallerjava.taller2;

import java.util.Scanner;


public class punto9 {
    private double longitud;
    private double base;
    private double base2;
    private double altura;
    private double area;
    private int triangulo;
    private int rectangulo;
    private int trapecio;
    private int opcion;
    
    public static void punto9(){
        
        //Mostrar menu
        menu();
        
        //Capturar opcion elegida por el usuario
        int opcion = capturarOpcion();
        
        //Evaluamos la opcion y se ejecuta la opcion elegida por el usuario
        evaluarOpciones(opcion);
    
    }
    
    private static void menu(){
        System.out.println("Ingrese un numero de acuerdo a la operacion que desea realizar");
        System.out.println("1.Calcular area de un rectangulo");
        System.out.println("2.Calcular area de un trinagulo");
        System.out.println("3.Calcular area de un trapecio");
    }
    
    private static void solicitarBase1(){
        System.out.println("Ingrese el valor de la base");
    }
    
    private static void solicitarBase2(){
        System.out.println("Ingrese el valor de la base 2");
    }
    
    private static void solictarAtura(){
        System.out.println("Ingrese el valor de la altura");
    }
    
    private static int capturarOpcion(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    
    private static double capturarBase(){
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }
    
    private static double capturarAltura(){
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
        
    }
    
    private static void calcularRectangulo(double base, double altura){
        double area;
        area = base * altura;
        System.out.println("El area del rectangulo es: "+area);
    }
    
    private static void calcularTriangulo(double base, double altura){
        double area;
        area = (base * altura)/2;
        System.out.println("El area del triangulo es: "+area);
    }
    
    private static void calcularTrapecio(double base,double base2, double altura){
        double area;
        area = altura*(base + base2)/2;
        System.out.println("El area del trapecio es: "+area);
    }
    
    private static void evaluarOpciones(int opcion){
        
        if(opcion==1){
            solicitarBase1();
            double base = capturarBase();
            
            solictarAtura();
            double altura = capturarAltura();
            
           calcularRectangulo(base, altura); 
        }
        
        if(opcion==2){
            solicitarBase1();
            double base = capturarBase();
            
            solictarAtura();
            double altura = capturarAltura();
            
           calcularTriangulo(base, altura); 
        }
        
        if(opcion==3){
            solicitarBase1();
            double base = capturarBase();
            
            solicitarBase2();
            double base2 = capturarBase();
            
            solictarAtura();
            double altura = capturarAltura();
            
           calcularTrapecio(base,base2, altura); 
        }
    }
    
    
}
