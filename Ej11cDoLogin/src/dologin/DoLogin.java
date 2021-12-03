/*
 c)Utilizar do while y realizar un programa de login . La contraseña y usuario deben estar guardados en el mismo programa.
 */

package dologin;

import java.util.Scanner;

public class DoLogin {

    public static void main(String[] args) {
      Scanner ingreso = new Scanner (System.in);
      
      String user = "Matias";
      String password = "123456";
      
      String usuario;
      String clave;
      
      do{
        System.out.print("Ingrese su usuario:");
        usuario = ingreso.nextLine();
        System.out.println("");
        
        System.out.print("Ingrese su contraseña:");
        clave = ingreso.nextLine();
        
      }while(!usuario.equals(user) || !clave.equals(password));
        
      System.out.println("Ingreso Correctamente");
    
    }   
}
