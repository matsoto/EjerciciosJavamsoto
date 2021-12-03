
package pkgswitch;
import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);//creo al objeto
        
        int DiasDelMes =0;
        String nombre ="";
        
        System.out.print("Ingrese un mes para saber cuantos dias tiene: ");// seleccion
        nombre = leer.nextLine();
        
    // dia del mes entero
     switch(nombre){
         case "Enero":
               DiasDelMes = 31;
         break;
         case "Febrero":
               DiasDelMes = 28;
         break;
         case "Marzo":
               DiasDelMes = 31;
         break;
         case "Abril":
               DiasDelMes = 30;
         break;
         case "Mayo":
               DiasDelMes = 31;
         break;
         case "Junio":
               DiasDelMes = 30;
         break;
         case "Julio":
               DiasDelMes = 31;
         break;
         case "Agosto":
               DiasDelMes = 31;
         break;
         case "Septiembre":
               DiasDelMes = 30;
         break;
         case "Octubre":
               DiasDelMes = 31;
         break;
         case "Noviembre":
               DiasDelMes = 30;
         break;
         case "Diciembre":
               DiasDelMes = 31;
         break;
         
         default: 
         DiasDelMes = 0;
     }
    //mostrar mes seleccionado
    System.out.println("el mes elegido es: " + nombre +  " y tiene " + DiasDelMes + " dias ");
    }   
}