
package ej12whiledowhile;

import java.util.Scanner;


public class Ej12WhileDoWhile {

   
    public static void main(String[] args) {
        Scanner ingreso = new Scanner (System.in);
      
      String user = "Matias";
      String password = "123456";
      
      String usuario;
      String clave;
      int cont =1;
  
        System.out.print("Ingrese su usuario:");
        usuario = ingreso.nextLine();
        System.out.print("Ingrese su contraseña:");
        clave = ingreso.nextLine();
        
        if(user.equals(usuario) && password.equals(clave)){
        
         System.out.println("Acceso Exitoso");
        }      
     while(password.equals(clave)== false && cont < 3 ){
            
            System.out.println("Error al ingresar, intente nuevamente");        
            System.out.print("Ingrese su usuario:");
            usuario = ingreso.nextLine();
            System.out.print("Ingrese su contraseña:");
            clave = ingreso.nextLine();
        cont++;
    }
           
      if(cont==3){
       System.out.println("Acceso denegado"); 
    }
    
  }   
}
