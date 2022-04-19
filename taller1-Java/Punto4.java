
import java.util.Scanner;


class Punto4 {
    private String nombreCiudad;
    private String NombrePais;

    public static void Punto4() {
        solicitarNombrePais();
        String nombrePais;
        nombrePais = capturarPais();
        
        solicitarNombreCiudad ();
        String nombreCiudad;
        nombreCiudad = capturarCiudad();
        
        System.out.println("La ciudad de "+nombreCiudad+", es la capital del pais "+nombrePais);
        
    }
    
    private static  void solicitarNombreCiudad (){
       System.out.println("Ingrese el nombre de la capital del pais ingresado");
   }
   
   private static  void solicitarNombrePais (){
       System.out.println("Ingrese el nombre de un pais");
   }
    
    private static String capturarCiudad() {
       Scanner input = new Scanner(System.in);
       return input.nextLine();
    }

    private static String capturarPais() {
        Scanner input = new Scanner(System.in);
       return input.nextLine();
    }

  
    
}
