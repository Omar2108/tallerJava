
package com.tallerjava.taller4;

import java.util.Scanner;


class punto5 {

    public static void punto5() {
        
        //declaro la matriz y le defino las dimensiones
        String matriz [][] = new String[10][10];
        
        //lleno la matriz con datos
        matriz[0][0]="1x1";
        matriz[0][1]="2x1";
        matriz[0][2]="3x1";
        matriz[0][3]="4x1";
        matriz[0][4]="5x1";
        matriz[0][5]="6x1";
        matriz[0][6]="7x1";
        matriz[0][7]="8x1";
        matriz[0][8]="9x1";
        matriz[0][9]="10x1";
        
        matriz[1][0]="1x2";
        matriz[1][1]="2x2";
        matriz[1][2]="3x2";
        matriz[1][3]="4x2";
        matriz[1][4]="5x2";
        matriz[1][5]="6x2";
        matriz[1][6]="7x2";
        matriz[1][7]="8x2";
        matriz[1][8]="9x2";
        matriz[1][9]="10x2";
        
        matriz[2][0]="1x3";
        matriz[2][1]="2x3";
        matriz[2][2]="3x3";
        matriz[2][3]="4x3";
        matriz[2][4]="5x3";
        matriz[2][5]="6x3";
        matriz[2][6]="7x3";
        matriz[2][7]="8x3";
        matriz[2][8]="9x3";
        matriz[2][9]="10x3";
        
        matriz[3][0]="1x4";
        matriz[3][1]="2x4";
        matriz[3][2]="3x4";
        matriz[3][3]="4x4";
        matriz[3][4]="5x4";
        matriz[3][5]="6x4";
        matriz[3][6]="7x4";
        matriz[3][7]="8x4";
        matriz[3][8]="9x4";
        matriz[3][9]="10x4";
        
        matriz[4][0]="1x5";
        matriz[4][1]="2x5";
        matriz[4][2]="3x5";
        matriz[4][3]="4x5";
        matriz[4][4]="5x5";
        matriz[4][5]="6x5";
        matriz[4][6]="7x5";
        matriz[4][7]="8x5";
        matriz[4][8]="9x5";
        matriz[4][9]="10x5";
        
        matriz[5][0]="1x6";
        matriz[5][1]="2x6";
        matriz[5][2]="3x6";
        matriz[5][3]="4x6";
        matriz[5][4]="5x6";
        matriz[5][5]="6x6";
        matriz[5][6]="7x6";
        matriz[5][7]="8x6";
        matriz[5][8]="9x6";
        matriz[5][9]="10x6";
        
        matriz[6][0]="1x7";
        matriz[6][1]="2x7";
        matriz[6][2]="3x7";
        matriz[6][3]="4x7";
        matriz[6][4]="5x7";
        matriz[6][5]="6x7";
        matriz[6][6]="7x7";
        matriz[6][7]="8x7";
        matriz[6][8]="9x7";
        matriz[6][9]="10x7";
        
        matriz[7][0]="1x8";
        matriz[7][1]="2x8";
        matriz[7][2]="3x8";
        matriz[7][3]="4x8";
        matriz[7][4]="5x8";
        matriz[7][5]="6x8";
        matriz[7][6]="7x8";
        matriz[7][7]="8x8";
        matriz[7][8]="9x8";
        matriz[7][9]="10x8";
        
        matriz[8][0]="1x9";
        matriz[8][1]="2x9";
        matriz[8][2]="3x9";
        matriz[8][3]="4x9";
        matriz[8][4]="5x9";
        matriz[8][5]="6x9";
        matriz[8][6]="7x9";
        matriz[8][7]="8x9";
        matriz[8][8]="9x9";
        matriz[8][9]="10x9";
        
        matriz[9][0]="1x10";
        matriz[9][1]="2x10";
        matriz[9][2]="3x10";
        matriz[9][3]="4x10";
        matriz[9][4]="5x10";
        matriz[9][5]="6x10";
        matriz[9][6]="7x10";
        matriz[9][7]="8x10";
        matriz[9][8]="9x10";
        matriz[9][9]="10x10";
        
        //imprimo la matriz para mostrarla al usuario y asi pueda elegir el resultado que desea ver
        
        for(int i= 0; i < matriz.length; i++){
            for(int n = 0;n <matriz[i].length; n++){
                System.out.print(matriz[i][n]+" ");
            }
            System.out.println();
        }
        
        //asigno lo valores a la matriz con los resultados de las operaciones mostradas en la matriz anterior
         matriz[0][0]="1";
        matriz[0][1]="2";
        matriz[0][2]="3";
        matriz[0][3]="4";
        matriz[0][4]="5";
        matriz[0][5]="6";
        matriz[0][6]="7";
        matriz[0][7]="8";
        matriz[0][8]="9";
        matriz[0][9]="10";
        
        matriz[1][0]="2";
        matriz[1][1]="4";
        matriz[1][2]="6";
        matriz[1][3]="8";
        matriz[1][4]="10";
        matriz[1][5]="12";
        matriz[1][6]="14";
        matriz[1][7]="16";
        matriz[1][8]="18";
        matriz[1][9]="20";
        
        matriz[2][0]="3";
        matriz[2][1]="6";
        matriz[2][2]="9";
        matriz[2][3]="12";
        matriz[2][4]="15";
        matriz[2][5]="18";
        matriz[2][6]="21";
        matriz[2][7]="24";
        matriz[2][8]="27";
        matriz[2][9]="30";
        
        matriz[3][0]="4";
        matriz[3][1]="8";
        matriz[3][2]="12";
        matriz[3][3]="16";
        matriz[3][4]="20";
        matriz[3][5]="24";
        matriz[3][6]="28";
        matriz[3][7]="32";
        matriz[3][8]="36";
        matriz[3][9]="40";
        
        matriz[4][0]="5";
        matriz[4][1]="20";
        matriz[4][2]="15";
        matriz[4][3]="20";
        matriz[4][4]="25";
        matriz[4][5]="30";
        matriz[4][6]="35";
        matriz[4][7]="40";
        matriz[4][8]="45";
        matriz[4][9]="50";
        
        matriz[5][0]="6";
        matriz[5][1]="12";
        matriz[5][2]="18";
        matriz[5][3]="24";
        matriz[5][4]="30";
        matriz[5][5]="36";
        matriz[5][6]="42";
        matriz[5][7]="48";
        matriz[5][8]="44";
        matriz[5][9]="60";
        
        matriz[6][0]="7";
        matriz[6][1]="14";
        matriz[6][2]="21";
        matriz[6][3]="28";
        matriz[6][4]="35";
        matriz[6][5]="42";
        matriz[6][6]="49";
        matriz[6][7]="56";
        matriz[6][8]="63";
        matriz[6][9]="70";
        
        matriz[7][0]="8";
        matriz[7][1]="16";
        matriz[7][2]="24";
        matriz[7][3]="32";
        matriz[7][4]="40";
        matriz[7][5]="48";
        matriz[7][6]="56";
        matriz[7][7]="64";
        matriz[7][8]="72";
        matriz[7][9]="80";
        
        matriz[8][0]="9";
        matriz[8][1]="18";
        matriz[8][2]="27";
        matriz[8][3]="36";
        matriz[8][4]="45";
        matriz[8][5]="54";
        matriz[8][6]="63";
        matriz[8][7]="72";
        matriz[8][8]="81";
        matriz[8][9]="90";
        
        matriz[9][0]="10";
        matriz[9][1]="20";
        matriz[9][2]="30";
        matriz[9][3]="40";
        matriz[9][4]="50";
        matriz[9][5]="60";
        matriz[9][6]="70";
        matriz[9][7]="80";
        matriz[9][8]="90";
        matriz[9][9]="100";
        
        //se le solicitan el numero de la fila y la columnas del resultado de la operacion que desea ver
        System.out.println("Si desea conocer el resultado de la operacion que contiene una celda de la tabla, solo debera ingresar el numero de la fila y la columna que desea ver el resultado");
        
        System.out.println("Ingrese el numero de la fila, de ser un numero entre 0 y 9.");
        int fila = capturar();
        
        System.out.println("Ingrese el numero de la columna, de ser un numero entre 0 y 9.");
        int columna = capturar();
        
        //imprimo en pantalla el resultado de acuerdo al numero de fila y columna ingresado por el usuario
        System.out.println("El resultado de la operacion elegida es: "+matriz[fila][columna]);
        
        
        
    }
    
    private static int capturar(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    
}
