/*
Se necesita un programa en el cual simule las operaciones de un cajero automático, de la siguiente manera:
- Modulo 1 :
A) Joption con logo del banco
B) Pedir contraseña
C) Mostrar menú en Joption
Manu
1. Saldo
2. Transferir
3. Retirar
4. Cambiar Clave
5. Salir
D) Consulta de Saldo

- Modulo 2 :
Punto de menú 2_Transferir
A)Al seleccionar transferir solicitar numero de CBU destinatario y solo permitir acceder 16 digitos. Si agrega mas mostrar error y volverlo a intentar 3 veces.
B)Al tener cargado el numero de CBU solicitar importe a transferir . No debe ser mas grande que el saldo de la cuenta, marcar error si es asi.
C)Imprimir ticket con datos de la transacción: Datos de la cuenta emisora ,la receptora(cbu ingresado) e importe que se envió.
d) Finalizada la operación se necesita que se reste del saldo lo transferido y mostrar el menú inicial.

- Modulo 3 

Punto de Manu 3_Retiro
A) Seleccione el monto en un joptionpane con las opciones (200,500,1000,2000 o Otros para ingresar)
B) Imprimir ticket de extracción
C) Actualizar el saldo y no debe permitir retirar mas que el saldo

Punto de Manu 4_Cambio de Clave
A)Seleccionar canal para el cambio de clave (HOME BANKING, Clave telefonica y Cajero)
B)La clave no puede ser la misma que tiene hoy
C)Imprimir comprobante de cambio de clave indicar en que canal se realizo el cmabio. No mostrar la clave solo ticket informativo.
 
Do while que valide el campo

ticket mando saldo 
*/
package ej16cajeroautomatico;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Ej16CajeroAutomatico {
    public static void main(String[] args) {
        
      int saldo = 20000;
      int saldoFinal = 0;
      String claveAcceso = "123456"; 
      int i=1,j=1;
      int longCbu = 16;
      int importeTransferir= 0;
       
      String nroCBU = "";
      String contraseña;
      String ctaemisoraCBU = "1234567891011121";     
//Creo el logo del banco
      ImageIcon icon = new ImageIcon ("src/Imagenes/bancodelsol.png");
      JOptionPane.showMessageDialog(null,"","BANCO",JOptionPane.INFORMATION_MESSAGE,icon);
      
      // Solicito la contraseña
          
     //String menu [] = {"Saldo","Transferir","Retirar","Cambiar Clave","Salir","Consultar Saldo"};
     //Object seleccion = JOptionPane.showInputDialog(null,"Seleccion una opcion","Menu",JOptionPane.QUESTION_MESSAGE,null,menu,menu[0]);
      do{
        contraseña = JOptionPane.showInputDialog("Ingrese su contraseña"); 
        
        if(contraseña.equals(claveAcceso)){
            
           System.out.println("Acceso correto");
           j=4;
        }else{
            System.out.println("Contraseña ingrese nuevamente, intento" +i + " de 3 ");}
        j++;
      }while(j<4);
      
      //Menu de opciones
      int seleccion = JOptionPane.showOptionDialog( null,"Seleccione una opcion","MENU",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null, new Object[] { "1. Saldo", "2. Transferir", "3. Retirar", "4. Cambiar Clave" ,"5. Salir"},"1. Saldo"); 
      System.out.println("Seleccion:" +seleccion);
  
      //Consulta de Saldo
      switch (seleccion){
          case 0:
                System.out.println("Consultando Saldo");
                JOptionPane.showMessageDialog(null,"SALDO: " +saldo,"BANCO DEL SOL",JOptionPane.INFORMATION_MESSAGE);     
          break;
          case 1:                
                do{
                   nroCBU = JOptionPane.showInputDialog(null,"Ingrese los numeros de un CBU a transferir: ");
                
                if(nroCBU.length() == longCbu){  
                    System.out.println("CBU Correcto");
                    i=3;
                    importeTransferir = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el monto a transferir: "));
                   
                    if(importeTransferir>=saldo){
                        JOptionPane.showMessageDialog(null,"Atencion la transferencia es mayor que el saldo y no puede ser realizada","BANCO DEL SOL",JOptionPane.ERROR_MESSAGE );
                        }else{
                            saldoFinal = saldo - importeTransferir;
                        }  
                }else{
                    JOptionPane.showMessageDialog(null,"Por favor ingresar 16 DIGITOS! Intento: "+i, "BANCO DEL SOL",JOptionPane.ERROR_MESSAGE );   
                }
                 i++;
                }while(i<4);                          
          break; 
          
          case 2:
                int retiro = JOptionPane.showOptionDialog(null,"Seleccione un monto a retirar","RETIRO",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null, new Object[]{ "200","500","1000","2000","OTRO MONTO"},"200");
                
                if(retiro == 0){
                        System.out.println("Eligio 200");
                        
                        saldoFinal = saldo - 200;
                        JOptionPane.showMessageDialog(null,"Realizo una extraccion de $200" + "\nSu saldo es de: " +saldoFinal,"TICKET EXTRACCION",JOptionPane.INFORMATION_MESSAGE);                   
                }
                if(retiro == 1){System.out.println("Eligio 500"); saldoFinal = saldo - 500; JOptionPane.showMessageDialog(null,"Realizo una extraccion de $500" + "\nSu saldo final es: " +saldoFinal,"TICKET EXTRACCION",JOptionPane.INFORMATION_MESSAGE);
                }
                if(retiro == 2){System.out.println("Eligio 1000"); saldoFinal = saldo - 1000; JOptionPane.showMessageDialog(null,"Realizo una extraccion de $1000" + "\nSu saldo final es: " +saldoFinal,"TICKET EXTRACCION",JOptionPane.INFORMATION_MESSAGE);
                }
                if(retiro == 3){System.out.println("Eligio 2000"); saldoFinal = saldo - 2000; JOptionPane.showMessageDialog(null,"Realizo una extraccion de $2000" + "\nSu saldo final es: " +saldoFinal,"TICKET EXTRACCION",JOptionPane.INFORMATION_MESSAGE);
                }
                if(retiro == 4){
                    System.out.println("Eligio Otro Monto"); 
                
                    int monto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Monto a retirar"));
                
                    if(saldo >= monto ) {
                    saldoFinal = saldo - monto;
                
                    JOptionPane.showMessageDialog(null,"Saldo en cuenta: " +saldo+ "\nRealizo una extraccion de: " +monto+ "\nSu saldo final es de: " +saldoFinal,"TICKET EXTRACCION",JOptionPane.INFORMATION_MESSAGE);
                    }else{
                          JOptionPane.showMessageDialog(null,"El monto a retirar es mayor al saldo actual!","TICKET EXTRACCION",JOptionPane.WARNING_MESSAGE );
                    }
                }    
          break;
          case 3: //Menu cambio de clave          
          int cambio = JOptionPane.showOptionDialog(null,"Opciones del menu","BANCO DEL SOL",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,new Object[] {"HOME BANKING","CLAVE TELEFONICA","CAJERO"},"HOME BANKING");
          
          if(cambio == 0 ){
              String cambioDeClave = JOptionPane.showInputDialog("Ingrese una nueva contraseña de Home Banking: ");
          }
          if(cambio == 1 ){
          }
          if(cambio == 2 ){
          }
          
          break;
          
          default:         
        }
      
      System.out.println("---------------Cajero Automatico------------");
      System.out.println("Datos de transaccion: ");
      System.out.println("CBU Origen: "+ctaemisoraCBU);
      System.out.println("CBU Destino: "+nroCBU);
      System.out.println("Importe enviado: " +importeTransferir);
      System.out.println("Saldo fila en cta: "+saldoFinal );
      
      
      

    
    
     }
      
    
}
