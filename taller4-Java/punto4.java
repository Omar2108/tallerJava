
package com.tallerjava.taller4;


class punto4 {

    public static void punto4() {
        //declaro la matriz y sus dimensiones
        String matriz [][] = new String[4][5];
        
        //se asignan los valores a cada celda
        matriz [0][0] = "01";
        matriz [0][1] = "02";
        matriz [0][2] = "03";
        matriz [0][3] = "04";
        matriz [0][4] = "05";
        matriz [1][0] = "06";
        matriz [1][1] = "07";
        matriz [1][2] = "08";
        matriz [1][3] = "09";
        matriz [1][4] = "10";
        matriz [2][0] = "11";
        matriz [2][1] = "12";
        matriz [2][2] = "13";
        matriz [2][3] = "14";
        matriz [2][4] = "15";
        matriz [3][0] = "16";
        matriz [3][1] = "17";
        matriz [3][2] = "18";
        matriz [3][3] = "19";
        matriz [3][4] = "20";
        
        //imprimo la matriz ordenado
        for(int filas=0;filas<matriz.length;filas++){
            for(int columnas=0;columnas<matriz[filas].length;columnas++){
                System.out.print(matriz[filas][columnas]+" ");
            }
            System.out.println();
            
        }
        System.out.println();
        
        //imprimo la matriz en culebrilla
        for(int filas = 0; filas < matriz.length;filas++){
            if(filas==1 || filas ==3){
                for(int columnas = matriz.length; columnas>=0;columnas--){
                    System.out.print(matriz[filas][columnas]+" ");
                }
                  
            }else{
                for(int columnas = 0;columnas<matriz[filas].length;columnas++){
                   System.out.print(matriz[filas][columnas]+" "); 
                }
            }
            
            
           System.out.println(); 
        }
        
    }
    
}
