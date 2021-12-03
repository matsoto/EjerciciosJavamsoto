/*
CFP ASEGURA TU AUTO
Se necesita un programa que permita la emisión de una póliza de seguro para un vehículo. Con las siguientes características:
1) En la primera parte debe mostrar una JOption con el logo de la compañía
2) Solicitar datos del cliente:
a. Nombre y Apellido
b. Teléfono
c. EMAIL
En este caso podemos utilizar variables para cada uno de los puntos y solicitarlo por JOPTION

3) Datos del vehículo
a. Marca, utilizar un JOption combobox a un vector
b. Modelo , JOPtion input
c. Dominio, JOPtion input
d. Años de antigüedad, JOPtion input
Luego que se solicita la antigüedad del automóvil se debe realizar el calculo para calcular la cuota. Este calculo se realiza de la siguiente manera:
Si el vehículo es menor igual a 5 años pagara u extra de 500
Si el vehículo es mayor a 5 años pero menor a 10 paga un extra de 1000
Si el vehículo tiene una edad mayor igual a 10 pero menor a 15 paga 1500
Si el vehículo tiene mas de 15 años y menor 20 paga 2000
Si el vehículo es mayor a 20 años no se asegura (mostrar cartel antes de seguir avanzando)

4) Tipo de Cobertura
Utilizar un Joption combo con las opciones Terceros Completos, Todo Riesgo y Responsabilidad Civil

Los valores de cada cobertura son:
RC :1000
TC:2000
TR: 3000

5) Adicionales de la cobertura
Utilizar un Joption combo con las opciones:
a. Granizo
b. Llantas deportivas
c. Asistencia Mecánica
d. Localizador GPS

Puede seleccionar mas de un adicional. Por cada dos que selecciona se cobra uno el valor de cada adicional es 300

Cálculos del seguro: El cálculo de lo que el cliente va a abonar se calcula con:
Valor de la cuota = Tipo de cobertura (valor) + Adicionales (valor)+ antigüedad del vehículo

6) Impresión de póliza (opcional función)
Mostrar en un joption o en consola como lo prefieran, los datos que deben mostrarse son:
a. Datos del Usuario (datos cargados)
b. Datos del Vehículo (datos cargados)
c. Tipo de cobertura (detalle seleccionado)
d. Adicionales de la cobertura (detalles seleccionado)
e. */
package tpfinalpolizadesegur;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class TpFinalPolizaDeSegur {
 
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
    
    String modelo ="";
    String seleccion =""; 
    String marca ="";
    
    int adicionales =0;
    int extra =0;
    
    //1)//Logo de la compania
    ImageIcon icon = new ImageIcon ("src/Imagenes/CFPlogo.png");
    ImageIcon auto = new ImageIcon ("src/Imagenes/seguroAuto.png");
    
    
    JOptionPane.showMessageDialog(null,"Cotizacion de seguro para automovil al mejor precio","CFP ASEGURA",JOptionPane.INFORMATION_MESSAGE,icon);
    
    //2)//Cargo datos del cliente
    String nombre = JOptionPane.showInputDialog("Ingresar nombre: ");
    String apellido = JOptionPane.showInputDialog("Ingresar apellido: ");
    String telefono = JOptionPane.showInputDialog("Ingresar telefono: ");
    String email = JOptionPane.showInputDialog("Ingresar email: ");
    
     //3)// Cargo datos de los vehiculos
    String [] marcas = {"Volskwagen","Renault","Fiat","Ford","BMW","NISSAN"};
    
    String [] vw = {"GolTrend","Golf","Polo","Nivus","Vento"};
    String [] Renault = {"Clio","Sandero","Captur","Duster","Logan","Kangoo"};
    String [] Ford = {"Eco Sport","Fiesta","Kuga","Mondeo"};
    String [] Fiat = {"Palio","Argo","Mobi","Cronos","Uno","Punto"};
    String [] BMW = {"Serie 3","X5","Serie 1","Z4","Serie 8"};
    String [] Nissan = {"Versa","Sentra","Murano","Kicks"};
     
    seleccion = (String) JOptionPane.showInputDialog(null,"Seleccione una marca","VEHICULOS :",JOptionPane.QUESTION_MESSAGE,null,marcas,marcas [0]);
    
    System.out.println("Selecciono: "+seleccion);
    
    if(seleccion.equalsIgnoreCase("Volskwagen")){   
    modelo =(String) JOptionPane.showInputDialog(null,"Seleccione un modelo: " +seleccion ,"MODELOS:", JOptionPane.QUESTION_MESSAGE,null,vw,vw [0]);
    System.out.println("Eligio Volswagen" +seleccion +modelo);
        }else if(seleccion.equalsIgnoreCase("renault")){
        System.out.println("Eligio Renault");   
        modelo = (String) JOptionPane.showInputDialog(null,"Seleccione un modelo: "+seleccion ,"MODELOS:", JOptionPane.QUESTION_MESSAGE,null,Renault,Renault[0]);
            }else if(seleccion.equalsIgnoreCase("ford")){
                  System.out.println("Eligio Ford");
                  modelo = (String) JOptionPane.showInputDialog(null,"Seleccione un modelo: "+seleccion ,"MODELOS:", JOptionPane.QUESTION_MESSAGE,null,Ford,Ford[0]);
                  marca ="ford";
                }  else if(seleccion.equalsIgnoreCase("fiat")){
                        System.out.println("Eligio Fiat");
                        modelo = (String) JOptionPane.showInputDialog(null,"Seleccione un modelo: "+seleccion ,"MODELOS:", JOptionPane.QUESTION_MESSAGE,null,Fiat,Fiat[0]);
                        } else if(seleccion.equalsIgnoreCase("BMW")){
                                System.out.println("Eligio BMW");
                                modelo = (String) JOptionPane.showInputDialog(null,"Seleccione un modelo: "+seleccion ,"MODELOS:", JOptionPane.QUESTION_MESSAGE,null,BMW,BMW[0]);     
                                } else if(seleccion.equalsIgnoreCase("Nissan")){
                                        System.out.println("Eligio Nissan");
                                        modelo = (String) JOptionPane.showInputDialog(null,"Seleccione un modelo: "+seleccion ,"MODELOS:", JOptionPane.QUESTION_MESSAGE,null,Nissan,Nissan[0]);
                                        }
    
    String dominio = JOptionPane.showInputDialog("Ingrese el dominio de su vehiculo: ");
    int antiguedad  =Integer.parseInt (JOptionPane.showInputDialog("Ingrese el año del Vehiculo: "));
    
    System.out.println("Año ingresado: " +antiguedad);
 
    //Calculo de la cuota
   int extraA = 500, extraB =1000, extraC = 1500, extraD = 2000;
   
    int RC = 1000;int TC= 2000;int TR = 3000;
    
    if(antiguedad >= 2016 && antiguedad<=2021  ){ JOptionPane.showMessageDialog(null,"Tendra que abonar un Extra de: $" +extraA,"AÑO VEHICULO",JOptionPane.INFORMATION_MESSAGE); 
    extra = extraA; }
        else if(antiguedad<=2016 && antiguedad>=2011 ){
             JOptionPane.showMessageDialog(null,"Tendra que abonar un Extra de: $" +extraB,"AÑO VEHICULO",JOptionPane.INFORMATION_MESSAGE); extra = extraB;
            }else if(antiguedad<=2011 && antiguedad>=2006) { JOptionPane.showMessageDialog(null,"Tendra que abonar un Extra de: $" +extraC,"AÑO VEHICULO",JOptionPane.INFORMATION_MESSAGE); extra = extraC;
                } else if(antiguedad<=2006 && antiguedad>=2001){ JOptionPane.showMessageDialog(null,"Tendra que abonar un Extra de: $" +extraD,"AÑO VEHICULO",JOptionPane.INFORMATION_MESSAGE); extra = extraD;
                    } else{ JOptionPane.showMessageDialog(null,"Su vehiculo es mayor a 20 años, no se puede asegurar por no cumplir con los requisitos","AÑO VEHICULO",JOptionPane.INFORMATION_MESSAGE);
                           System.exit(0);
                        } 
    //Seleccion de cobertura
    //4)//
    JOptionPane.showMessageDialog(null,"Cobertura: \nResponsabilidad Civil = $ "+RC+" \nTerceros Completo = $ "+TC+" \nTodo Riesgo = $ "+TR,"TIPOS DE COBERTURA",JOptionPane.INFORMATION_MESSAGE);
    int cobertura = JOptionPane.showOptionDialog(null,"A continuacion seleccione una cobertura","CFP ASEGURA",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null, new Object[] {"RESPONSABILIDAD CIVIL","TERCEROS COMPLETOS","TODO RIESGO"},"RC");
    System.out.println("Selecciono:" +cobertura);
    String coberturaAuto = "";
    
    switch(cobertura){
        case 0 : cobertura = RC; coberturaAuto = "Responsabilida Civil";
        break;
        case 1: cobertura = TC; coberturaAuto = "Terceros Completos";
        break;
        case 2: cobertura = TR; coberturaAuto = "Todo riesgo";
        break;           
        default:
        System.out.println("No selecciono ninguna de las tres opciones");
    }
    
  //5)// Adicionales 
  //String [] adicionales = {"Granizo","LLantas deportivas","Asistencia mecanica","Localizador GPS"};
  JOptionPane.showMessageDialog(null,"A continuacion seleccione un adicional \nPor cada dos adicionales se le suma $300","ADICIONALES",JOptionPane.INFORMATION_MESSAGE);
  
  int cont=0; int cont1= 0; int cont2=0; int cont3=0; int cont4=0;        
  int consulta=0;int adicional=0;
  String granizo ="", llantasDeportivas="",asistenciaMecanica="",localizadorGps="", sinAdicional="";
  
  do{
  adicional = JOptionPane.showOptionDialog(null,"Seleccione un adicional si lo requiere", "ADICIONAL",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null, new Object[]{ "Granizo","Llantas Deportivas","Asistencia mecanica","Localizador GPS","Sin adicional"},"Granizo");
  System.out.println("Seleciono:" +adicional);
  
  switch(adicional){
      case 0:  
            granizo="Granizo";
            if(cont!=0){
            JOptionPane.showMessageDialog(null,"Ya selecciono el adicional Granizo");
            }else {cont++;}
      break; 
      case 1:     
            llantasDeportivas="Llantas Deportivas";
            if(cont1!=0){
            JOptionPane.showMessageDialog(null,"Ya selecciono el adicional llantas deportivas");
            } else {cont1++;}
      break;
      case 2:
           asistenciaMecanica="Asistencia Mecanica";
           if(cont2!=0){
           JOptionPane.showMessageDialog(null,"Ya selecciono el adicional asistencia mecanica");
           }else {cont2++;}
      break;
      case 3:
          localizadorGps="Localizador Gps";
           if(cont3!=0){
           JOptionPane.showMessageDialog(null,"Ya selecciono el adicional asistencia mecanica");
           }else {cont3++;}
      break;
      case 4:
           sinAdicional="Sin Adicional";
           if(cont4!=0){
           JOptionPane.showMessageDialog(null,"Ya selecciono el adicional asistencia mecanica");
           } else {cont4++;}
      break;
      default:
          System.out.println("No selecciono ningun adicional");        
  }
  consulta = JOptionPane.showConfirmDialog(null, "Desea agregar otro adicional?");
  System.out.println("Seleccion adicional:" +consulta);

  }while(consulta!=1);
  
  adicionales = cont+cont1+cont2+cont3;
  System.out.println("Calculo de adicionales:"+ adicionales);
  
 if(adicionales == 1){ 
     adicionales =300;
 }else if(adicionales==2 || adicionales ==3){
          adicionales = 600;
         }else if(adicionales==4){
                  adicionales = 600;
                } else {System.out.println("No posee adicionales");}

  //Calculo de la cobertura
   int valorCuota = calculoCuota(cobertura,adicionales,extra);
   System.out.println("Calculo de la cuota" +valorCuota);
   
  //6//Imprimir Poliza
  JOptionPane.showMessageDialog(null,"Cotizacion Poliza de seguro\n"
          + "\nDATOS DEL USUARIO\n" +"Nombre: "+nombre +"\nApellido: "+apellido+"\nTelefono: "+telefono+"\nEmail: "+email+
          "\n\nDATOS DEL VEHICULO\nMarca: "+seleccion+ "\nModelo: "+modelo+ "\nDominio: "+dominio+"\nAño del vehiculo: " +antiguedad+ 
          "\n\nTIPO DE COBERTURA\nCobertura: " +coberturaAuto+"\nValor de la cobertura : $ "+cobertura+ "\nAdicional por la antiguedad del automovil: $" +extra+
          "\n\nDETALLE DE LA COBERTURA \nAdicionales seleccionados: " +granizo+" "+llantasDeportivas+" "+asistenciaMecanica+" "+localizadorGps+" "+sinAdicional+ "\nAdicionales al seguro: $" +adicionales+ "\n\nVALOR DE LA CUOTA FINAL: $" +valorCuota,"CFP ASEGURA",JOptionPane.INFORMATION_MESSAGE, auto);
  }   
 public static int calculoCuota(int n1,int n2, int n3){
     
     int resultado = n1 + n2 + n3;
     return resultado;
  } 
 }
