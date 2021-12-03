
package ticketrestaurant;
import java.util.Scanner;
/*Realizar un programa en el cual el resultado sea el ticket de un restaurante.
Que el usuario ingrese:
- Se ingrese el nombre del Mozo
- Se ingresar el total de lo consumido
- Seleccionar modalidad de pago
- Efectivo
- Tarjeta de crédito
- Tarjeta de débito
. En el caso de ser de crédito ingresar los números
- En el caso de ser de crédito ingresar cantidad de cuotas
- En el caso de ser de débito ingresar los números

Calcular descuento o interés según el medio de pago:
-Efectivo -30%
-Débito -10%
-Tarjeta Crédito +10%

Ejemplo del ticket:
=============================
RESTAURANTE CFP N°36
Zavaleta 204, , C1437EYF CABA
=============================
Caja # 1 - Ticket # 1
LO ATENDIO: XXXXXX
30/04/2010 11:46:47 AM
=============================
1 Gaseosa
1 Milanesa Napolitana con fritas
1 Flan con Crema
1 Cafe
=============================
SUBTOTAL XXXXXX
FORMA DE PAGO: XXXXXXX
NUMERO TARJETA :XXXXXXX(si pago con tarjeta)
CUOTAS: XX (si pago con tarjeta credito)
DESCUENTO: XXXXXX

TOTAL : XXXXXX

=============================
Gracias por su visita
=============================

Se necesita que se realice el diagrama de flujo antes de decodificar.
Subir el proyecto a un repositorio nuevo, teniendo encuentra que el repositorio se deberá llamar como el proyecto y el proyecto deberá tener el siguiente estructura para identificarlo :
ApellidoFechaTema (falabrino2805scanner)
En el mismo proyecto por favor incluir el diagrama de flujo.
Por favor no se olviden de darme permisos en el repositorio y agregar su comentario con la ruta del repositorio.

Gracias
Saludos Cordiales */
public class TicketRestaurant {
    
    public static void main(String[] args) {
       
        Scanner leer = new Scanner (System.in);
        int seleccion;
        double total ;
        double tarjetaCredito =0, cantCuotas =0, recargo =0, totalParcial=0;
        int descuento;
        double totalApagar =0;
        String formaDePago="";
        int tarjetaDebito =0;
        
        System.out.print("Ingrese el nombre del mozo: ");
        String nombreMozo = leer.nextLine();
        System.out.print("Ingrese el total de lo consumido: ");
        double totalConsumido = leer.nextInt();
        
       do{ 
        System.out.println("A continuacion seleccione una modalidad de pago \n1 - Efectivo \n2 - Tarjeta de credito \n3 - Tarjeta de debito");
        seleccion = leer.nextInt();
        
        switch(seleccion){
      
            case 1:
                System.out.println("Selecciono EFECTIVO se le aplicara un %30 de Descuento");
                formaDePago = "EFECTIVO";
                totalApagar = totalConsumido - (totalConsumido * 0.30);
                
            break;
            case 2:
                System.out.print("Ingrese los numeros de la tarjeta de credito: ");
                tarjetaCredito = leer.nextDouble();
                System.out.print("En cuantas cuotas desea realizar el pago? ");
                cantCuotas = leer.nextDouble();
                formaDePago = "CREDITO";
                
                totalParcial = totalConsumido / cantCuotas;
                recargo = totalParcial * 0.10;
                totalApagar = totalParcial + recargo;
               
            break;             
            case 3:
               System.out.print("Ingrese los numeros de la tarjeta de debito: ");
               tarjetaDebito = leer.nextInt(); 
                
               totalApagar = totalConsumido - (totalConsumido * 0.10);
               formaDePago = "DEBITO"; 
            break;
            
            default: 
                System.out.println("Selecciono un metodo de pago incorrecto vuelva a ingresar un metodo de pago");
                System.out.println("");
        }
        }while(seleccion > 3 );      
       
       System.out.println("=============================");
       System.out.println("RESTAURANTE CFP N°36");
       System.out.println("Zavaleta 204, , C1437EYF CABA");
       System.out.println("=============================");
       System.out.println("Caja # 1 - Ticket # 1");
       System.out.println("LO ATENDIO: " + nombreMozo);
       System.out.println("27/10/2021 11:46:47 AM");
       System.out.println("=============================");
       System.out.println("1 Gaseosa\n1 Milanesa Napolitana con fritas \n1 Flan con Crema \n1 Cafe");
       System.out.println("=============================");
       System.out.println("SUBTOTAL: " +totalConsumido);
       System.out.println("FORMA DE PAGO: " +formaDePago);
       
       if(seleccion == 1){
       System.out.println("NUMERO DE TARJETA: \nCUOTAS: n/a \nDESCUENTO: %30 \nTOTAL: " +totalApagar );
       } else if(seleccion == 2){
                System.out.println("NUMERO DE TARJETA: " +tarjetaCredito + "\nCUOTAS:" +cantCuotas + "\n RERCARGO: +%10 \nTOTAL: " +totalApagar );
                }else { System.out.println("NUMERO DE TARJETA: " +tarjetaDebito + "\nCUOTAS: n/a \nDESCUENTO: %10 \nTOTAL: " +totalApagar );                    
                }
    }
    
}
