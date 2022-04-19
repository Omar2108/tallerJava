
import java.io.IOException;
import java.util.Scanner;

public class main {
    
    private static boolean control = true;
    private static int opcion;
    
    public static void main(String[] args) throws IOException{
        do{
            limpiarPantalla();
            menu();
            opcion = capturar();
            control = evaluarOpcion(opcion);
        }while(control==true);      
    }   
    
    private static void menu(){
        System.out.println("Escoja un punto del taller 1 que desee que se ejecute");
        System.out.println("1. Punto #1");
        System.out.println("2. Punto #2");
        System.out.println("3. Punto #3");
        System.out.println("4. Punto #4");
        System.out.println("5. Punto #5");
        System.out.println("0. Salir del taller");
    }
    
    private static int capturar(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    
    private static boolean evaluarOpcion(int opcion1) throws IOException{
        
        switch(opcion){
            case 1 -> {
                Punto1 p1;
                p1 = new Punto1();
                p1.Punto1();
                return true;
            }
            case 2 -> {
                Punto2 p2;
                p2 = new Punto2();
                Punto2.Punto2();
                return true;
            }  
  
            case 3 -> {
                Punto3 p3;
                p3 = new Punto3();
                Punto3.Punto3();
                return true;
            }  
            case 4 -> {
                Punto4 p4; 
                p4 = new Punto4();
                Punto4.Punto4();
                return true;
            }  
            case 5 -> {
                Punto5 p5;
                p5 = new Punto5();
                Punto5.Punto5();
                return true;
            }
             case 0 ->{
                boolean control;
                control = false;
            }
            default -> {
                System.out.println("Opción incorrecta");
                System.in.read();            
            }
        }
        return false;
       
        
    }
   private static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }   
}
