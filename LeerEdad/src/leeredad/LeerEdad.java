
package leeredad;

import java.util.Scanner;
public class LeerEdad {

    public static void main(String[] args) {
        //crear  objeto para leer los datos
        Scanner leer = new Scanner (System.in);
        
        // Declaron variables
        int aDenac;
        String nombre;
        String apellido;
        int edad;
        
        // Solicito informacion
        System.out.print("Ingrese su Nombre : ");
        nombre = leer.nextLine();
        System.out.print("Ingrese su Apellido : ");
        apellido = leer.nextLine();
        System.out.print("Ingrese su Edad : ");
        edad = leer.nextInt();
        boolean votar = false;
        
        // Calcular el año de nacimiento
        aDenac = 2021 - edad;
        
        // Es mayor para votar?
        if (edad > 16){
            votar = true;
        } else{
        
        }
        // Es mayor para beber?
    
    }
    
}
