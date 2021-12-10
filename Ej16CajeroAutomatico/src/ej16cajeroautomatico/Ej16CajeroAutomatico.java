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
      String claveAcceso = "123456"; 
      String[] claves = new String[]{"123456","clavehome","clavetel"};
   
      int j=1, i=0;
      int seleccion =0;
      String contraseña;
        

      //Creo el logo del banco
      ImageIcon icon = new ImageIcon ("src/Imagenes/bancodelsol.png");
      JOptionPane.showMessageDialog(null,"","BANCO",JOptionPane.INFORMATION_MESSAGE,icon);
      
      // Solicito la contraseña
      do{
        contraseña = JOptionPane.showInputDialog("Ingrese su contraseña"); 
        
        if(contraseña.equals(claveAcceso)){
            
           System.out.println("Acceso correcto");
           j=4;
        }else{
            System.out.println("Contraseña ingrese nuevamente, intento" +j + " de 3 ");}
        j++;
        if (j==4){System.exit(0);}
            
      }while(j<4);
      
      //Menu de opciones
      do {
                seleccion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Saldo\n2. Transferir\n3. Extracción\n4. Cambio de Clave\n5. Salir"));
                System.out.println("Seleccion:" +seleccion);
                switch(seleccion) {
                    case 1:
                    saldo(saldo);
                    break;
                    case 2:
                    saldo = transferir(saldo);
                    break;
                    case 3:
                    saldo = extraccionDinero(saldo);
                    break;
                    case 4:
                    claves = cambioClave(claves);
                }
            } while(seleccion!=5);
     } 
    
   // MODULO 1 Impresion de saldo
    public static void saldo(int saldo) {
                System.out.println("Consultando Saldo");
                JOptionPane.showMessageDialog(null,"SALDO: " +saldo,"BANCO DEL SOL",JOptionPane.INFORMATION_MESSAGE);
   }  
    
    //Modulo 2 Transferencia
    public static int transferir(int saldo) {
        
        String nroCBU = "";
        int longCbu = 22;
        int importeTransferir= 0;
        String emisoraCBU = "1234567891011121250215";
        int i=1;
       
        //Ingresar CBU
        do{
                nroCBU = JOptionPane.showInputDialog(null,"Ingrese los numeros de un CBU a transferir: ");
                if(nroCBU.length() == longCbu){  
                    System.out.println("CBU Correcto");
                    i=3;
                    importeTransferir = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el monto a transferir: "));
                    if(importeTransferir>=saldo){
                        JOptionPane.showMessageDialog(null,"Atencion la transferencia es mayor que el saldo y no puede ser realizada","BANCO DEL SOL",JOptionPane.ERROR_MESSAGE );
                        }else{
                            saldo = saldo - importeTransferir;
                        }  
                }else{
                    JOptionPane.showMessageDialog(null,"Por favor ingresar 22 DIGITOS! Intento: "+i, "BANCO DEL SOL",JOptionPane.ERROR_MESSAGE );   
                }
                 i++;
                }while(i<4);       
        JOptionPane.showMessageDialog(null,"BANCO SOL\n\nCBU Emisora: "+ emisoraCBU + "\nTranferencia a CBU: "+ nroCBU + "\nMonto de la transferencia: "+ importeTransferir+"\nSaldo actual: "+ saldo, "BANCO SOL",JOptionPane.INFORMATION_MESSAGE );
        return saldo;
    }
    
    //Modulo 3 Extraccion
     public static int extraccionDinero(int saldo) {
        int montoExtraccion=0, retiro =0;
        String[] opciones = {"200","500","1000","2000","Otro Importe"};
        
             retiro = JOptionPane.showOptionDialog(null,"Seleccione un monto a retirar","RETIRO",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null, new Object[]{ "200","500","1000","2000","OTRO MONTO"},"200");
                
                if(retiro == 0){
                        System.out.println("Eligio 200");
                        montoExtraccion = 200;
                        saldo = saldo - montoExtraccion;
                        JOptionPane.showMessageDialog(null,"Realizo una extraccion de $200" + "\nSu saldo es de: " +saldo,"TICKET EXTRACCION",JOptionPane.INFORMATION_MESSAGE);                   
                }
                if(retiro == 1){System.out.println("Eligio 500"); montoExtraccion = 500; saldo = saldo - montoExtraccion; JOptionPane.showMessageDialog(null,"Realizo una extraccion de $500" + "\nSu saldo final es: " +saldo,"TICKET EXTRACCION",JOptionPane.INFORMATION_MESSAGE);
                }
                if(retiro == 2){System.out.println("Eligio 1000"); montoExtraccion = 1000; saldo = saldo - montoExtraccion; JOptionPane.showMessageDialog(null,"Realizo una extraccion de $1000" + "\nSu saldo final es: " +saldo,"TICKET EXTRACCION",JOptionPane.INFORMATION_MESSAGE);
                }
                if(retiro == 3){System.out.println("Eligio 2000"); montoExtraccion = 2000; saldo = saldo - montoExtraccion; JOptionPane.showMessageDialog(null,"Realizo una extraccion de $2000" + "\nSu saldo final es: " +saldo,"TICKET EXTRACCION",JOptionPane.INFORMATION_MESSAGE);
                }
                if(retiro == 4){
                    System.out.println("Eligio Otro Monto"); 
                    int monto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Monto a retirar"));
                    if(saldo >= monto ) {
                    saldo = saldo - monto;
                    JOptionPane.showMessageDialog(null,"Saldo en cuenta: " +saldo+ "\nRealizo una extraccion de: " +monto+ "\nSu saldo final es de: " +saldo,"TICKET EXTRACCION",JOptionPane.INFORMATION_MESSAGE);
                    }else{
                          JOptionPane.showMessageDialog(null,"El monto a retirar es mayor al saldo actual!","TICKET EXTRACCION",JOptionPane.WARNING_MESSAGE );
                    } 
            }         
        return saldo;
       }
 
    public static String[] cambioClave(String[]claves) { 
        String passwordNuevo="";
        String encriptado = "*******";
        String[] opciones = {"Homebanking","Clave Telefónica","Clave de Cajero"};
        Object opcion = JOptionPane.showInputDialog(null,"Seleccionar canal para el cambio de clave:","BANCO",JOptionPane.QUESTION_MESSAGE,null, opciones,opciones[0]);
        System.out.println(opcion);
        
        switch ((String)opcion) {
            case "Homebanking":
                passwordNuevo=JOptionPane.showInputDialog(null,"Ingresar nueva Clave de Homebanking:");
                if (!passwordNuevo.equals(claves[1])) {
                    claves[1]=passwordNuevo;    
                    JOptionPane.showMessageDialog(null, "Se cambio su contraseña de Home Banking "+encriptado, "Banco del Sol", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "La nueva Clave de Homebanking es igual a la anterior","",JOptionPane.ERROR_MESSAGE);
                }
                break;
            case "Clave Telefónica":
                if (!passwordNuevo.equals(claves[2]))  {
                passwordNuevo=JOptionPane.showInputDialog(null,"Ingresar nueva Clave Telefonica:");
                claves[2]=passwordNuevo;
                JOptionPane.showMessageDialog(null, "Se cambio su contraseña de Telefonica"+encriptado, "Banco del Sol", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "La nueva Clave Telefonica es igual a la anterior","",JOptionPane.ERROR_MESSAGE);
                }
                break;
            case "Clave de Cajero":
                if (!passwordNuevo.equals(claves[0])) {
                passwordNuevo=JOptionPane.showInputDialog(null,"Ingresar nueva Clave de Cajero:");
                claves[0]=passwordNuevo;
                JOptionPane.showMessageDialog(null, "Se cambio su contraseña de Cajero "+encriptado, "Banco del Sol", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "La nueva Clave de Cajero es igual a la anterior","",JOptionPane.ERROR_MESSAGE);
                }
                break;
        }
        return claves;
    }     
}
