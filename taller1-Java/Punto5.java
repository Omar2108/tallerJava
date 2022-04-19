
import java.util.Scanner;


class Punto5 {
    private String nombreMastoca;
    private int edadMascota;
    private String tipoMascota;
    private String nombreDueño;

    public static void Punto5() {
        solicitarNombreMascota();
        String nombreMascota;
        nombreMascota = capturarNombreMascota();
        
        solicitarEdadMascota ();
        int edadMascota;
        edadMascota = capturarEdadMascota();
        
        solicitarTipoMascota();
        String tipoMascota;
        tipoMascota = capturarTipoMascota();
        
        solicitarNombreDueño ();
        String nombreDueño;
        nombreDueño = capturarNombreDueño();
        
        System.out.println(nombreMascota+", es un(a) "+tipoMascota+", el cual, tiene "+edadMascota+" años de edad y "+nombreDueño+" es actualmente su dueño(a).");
        
    }
    
    private static String capturarNombreMascota() {
       Scanner input = new Scanner(System.in);
       return input.nextLine();
    }

    private static String capturarTipoMascota() {
        Scanner input = new Scanner(System.in);
       return input.nextLine();
    }

    private static String capturarNombreDueño() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    
    private static int capturarEdadMascota() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    
    private static void solicitarNombreMascota (){
       System.out.println("Ingrese el nombre de su mascota");
   }
   
   private static void solicitarTipoMascota (){
       System.out.println("Ingrese la raza o tipo de mascota");
   }
   
   private static  void solicitarEdadMascota (){
       System.out.println("Ingrese la edad de la mascota");
   }
   
   private static  void solicitarNombreDueño (){
       System.out.println("Ingrese el nombre del propietario");
   }
    
}
