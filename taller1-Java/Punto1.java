
import java.util.Scanner;

class Punto1 {
    
   private String nombre;
   private String apellidos;
   
   public void Punto1 (){
       solicitarNombre();
       nombre = capturarDato();
       
       solicitarApellidos();
       apellidos = capturarDato();
       
   }
   
   private void solicitarNombre (){
       System.out.println("Ingrese su nombre");
   }
   
   private void solicitarApellidos (){
       System.out.println("Ingrese sus apellidos");
   }
   
   private String capturarDato (){
       Scanner input = new Scanner(System.in);
       return input.nextLine();
   }

    

    
    
}
