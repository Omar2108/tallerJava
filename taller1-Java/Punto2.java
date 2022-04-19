
import java.util.Scanner;


class Punto2 {
    private String nombre;
    private String apellidos;
    private int edad;
    private double estatura;
    

    public static void Punto2() {
      
   
        solicitarNombre();
        
       String nombre;
        nombre = capturarDatos();
       
       solicitarApellidos();
       String apellidos;
       apellidos = capturarDatos();

        solicitarEdad();
        int edad;
        edad = capturarDatosInt();

        solicitarEstatura();
        double estatura;
        estatura = capturarDatosDouble();
        
    }

    private static double capturarDatosDouble() {
       Scanner input = new Scanner(System.in);
       return input.nextDouble();
    }

    private static int capturarDatosInt() {
        Scanner input = new Scanner(System.in);
       return input.nextInt();
    }

    private static String capturarDatos() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    
    private static void solicitarNombre (){
       System.out.println("Ingrese su nombre");
   }
   
   private static void solicitarApellidos (){
       System.out.println("Ingrese sus apellidos");
   }
   
   private static  void solicitarEdad (){
       System.out.println("Ingrese su edad");
   }
   
   private static  void solicitarEstatura (){
       System.out.println("Ingrese su estatura");
   }
   

}
