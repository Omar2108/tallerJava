
import java.util.Scanner;


class Punto3 {
    private String nombre;
    private String apellidos;
    private String nombreMadre;
    private String nombrePadre;

    public static void Punto3() {
        solicitarNombre ();
        String nombre;
        nombre = capturarNombre();
       
        solicitarApellidos ();
        String apellidos;
        apellidos = capturarApellidos();
        
        solicitarNombreMadre ();
        String nombreMadre;
        nombreMadre = capturarDatoMadre();
       
        solicitarNombrePadre ();
        String nombrePadre; 
        nombrePadre = capturarDatoPadre();
        
        System.out.println("Yo "+ nombre+""+apellidos+ " soy hijo de "+ nombreMadre +" y "+nombrePadre);
        
    }
    
    private static String capturarDatoMadre() {
       Scanner input = new Scanner(System.in);
       return input.nextLine();
    }

    private static String capturarDatoPadre() {
        Scanner input = new Scanner(System.in);
       return input.nextLine();
    }

    private static String capturarNombre() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    
    private static String capturarApellidos() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    
    private static void solicitarNombre (){
       System.out.println("Ingrese su nombre");
   }
   
   private static void solicitarApellidos (){
       System.out.println("Ingrese sus apellidos");
   }
   
   private static  void solicitarNombreMadre (){
       System.out.println("Ingrese el nombre de su madre");
   }
   
   private static  void solicitarNombrePadre (){
       System.out.println("Ingrese el nombre de su padre");
   }
    
    
    
    
    
}
