
package ticketautomotor;

import java.util.Scanner;

public class TicketAutomotor {

    public static void main(String[] args) {
       Scanner ingreso = new Scanner (System.in);
        
       String servicio =""; String servicio1 =""; String servicio2=""; String servicio3=""; String servicio4="";
       int seleccion = 0;
       
       
       
        System.out.print("Ingrese su nombre de cliente: ");
        String usuario = ingreso.nextLine();
        
        System.out.print("Ingrese su DNI: ");
        int dni = ingreso.nextInt();
        ingreso.nextLine();
        System.out.print("Ingrese el dominio del vehiculo: ");
        String dominio = ingreso.nextLine();
        System.out.print("Ingrese la marca de su vehiculo: ");
        String vehiculo = ingreso.nextLine();
        
        
        
        do{
        System.out.println("A continuacion seleccione una opcion que desea realizar \n1 - Cambio de neumaticos \n2 - Cambio de aceite \n3 - Pastillas de freno \n4 - Alineacion \n5 - Balanceo \n6 Salir ");
        seleccion = ingreso.nextInt();
        switch(seleccion){
                    
            case 1: servicio = "CAMBIO DE NEUMATICOS";
            break;
            case 2: servicio1 = "CAMBIO DE ACEITE";
            break; 
            case 3: servicio2 = "PASTILLAS DE FRENO";
            break;
            case 4: servicio3 = "ALINEACION";
            break;           
            case 5: servicio4 = "BALANCEO";
            break;  
            default: System.out.println("Seleccion una opcion incorrecta, vuelva a elegir");
                     System.out.println(""); 
            
        }
        }while(seleccion != 6);
                 
        //ticket
        System.out.println("==================================");
        System.out.println("======== Bienvenido ==============");
        System.out.println("Centro Servicios  CFP N°36");
        System.out.println("Zavaleta 204, C1437EYF, CABA");
        System.out.println("==================================");
        System.out.println("Nombre del Cliente: "   + usuario);
        System.out.println("DNI del cliente:  "     + dni);
        System.out.println("Marca del Vehiculo: " + vehiculo );
        System.out.println("Dominio del Vehiculo: " + dominio);
        System.out.println("==================================");
        System.out.println("Servicios elegidos: " + servicio + servicio1 + servicio2 + servicio3 + servicio4);
     
    }
    
}
