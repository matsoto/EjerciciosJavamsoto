
package vectorescargar;
import java.util.Scanner;

public class VectoresCargar {

    public static void main(String[] args) {
   
        // creo los vectores
        String []nombre = new String[5];
        String []sexo = new String[5];
        int []edad = new int[5];
        int inicio = 0;
        
        System.out.println("Vector con datos de cinco personas\n");
        Scanner leer = new Scanner(System.in);
       
        do {
            System.out.println("Ingresar nombre del usuario:");
            nombre[inicio] = leer.nextLine();
            System.out.println(" Ingresar el sexo:");
            sexo[inicio] = leer.nextLine();
            System.out.println("Ingresar edad:");
            edad[inicio] = leer.nextInt();
            leer.nextLine();
            inicio++;
        } while (inicio != 5);
        System.out.println("");
        System.out.println("DATOS INGRESADOS");
        for (int i = 0; i < nombre.length; i++) {
            System.out.println("------");
            System.out.println("User n°: " + i);
            System.out.println("Nombre:  " + nombre[i]);
            System.out.println("Sexo:    " + sexo[i]);
            System.out.println("Edad:    " + edad[i]);         
        }
    }
    
}
