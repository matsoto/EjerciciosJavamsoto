
package ej5clasescanner;
import java.util.Scanner;
public class Ej5ClaseScanner {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
        System.out.print("Ingrese Nombre: ");
        String nombre = leer.nextLine();
        System.out.print("Ingrese Apellido: ");
        String apellido = leer.nextLine();
        System.out.print("Ingrese DNI: ");
        int dni = leer.nextInt();
        leer.nextLine();
        System.out.print("Ingrese año de nacimiento: ");
        int año = leer.nextInt();
        leer.nextLine();
        
        //Calculamos la edad
        int calculoEdad = 2021 - año;
        
        System.out.println("Datos Ingresados:");
        System.out.println("Nombre: " +nombre);
        System.out.println("Apellido: " +apellido);
        System.out.println("DNI: " +dni);
        System.out.println("Edad actual: "+calculoEdad);
     
    }  
}
