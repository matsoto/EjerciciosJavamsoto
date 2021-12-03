/*
 Crear un programa para una compañía de seguros de automotor en donde el productor de seguros le solicite al cliente:
Nombre 
Apellido
Marca del vehículo (Tener un listado de marcas y cada marca identificarla con una gama)
Año del vehículo 
Dominio del vehículo.


En base a la gama establecer el precio y sumarle el año dependiendo en que margen se encuentra.

Crear diagrama de flujo

- si es una marca de alta gama agregar $1800 cuota final;
- si no es alta gama agregar $890 cuota final;

// Crear una función

"Gama baja"
- si el año se encuentra entre 1990-1999 = $ 480;
- si el año se encuentra entre 2000-2010 = $ 780;
- si el año se encuentra entre 2011-2016 = $ 950;

"Gama alta"
- si el año se encuentra entre 2017-2020 = $ 1200;
- SI NO SE ENCUENTRA EN LOS RANGOS MENCIONADOS = $ 350

crear un Joption final resultado de toda la cotización o imprimir en consola con formato de cotización (Datos de la compañía + datos cargados y calculados del sistema )
 */
package ej14automotorjoptionpane;
import javax.swing.JOptionPane;

public class Ej14AutomotorJOptionPane {
    
  
    public static void main(String[] args) {
        
        int cuotaParcial=0;
        int gamaBaja=890, gamaAlta=1800, totalAPagar=0;
        String marca = "";
        String gama ="";
        String gamaB = "Gama Baja";
        String gamaA = "Gama Alta";
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        String apellido = JOptionPane.showInputDialog("Ingrese su apellido:");
        
        int seleccion = JOptionPane.showOptionDialog( null,"Selecciones una marca de vehiculo","AUTOMOVILES",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null, new Object[] { "Ford", "Fiat", "Renaut", "Volkswagen", "BMW" },"Fiat");
        System.out.println("elegido:" +seleccion);
        
        
        //Seleccion de Gama
        switch(seleccion){
            case 0:
                gama = gamaB;
                System.out.println("Gama Baja:"+gamaBaja);
                marca = "FORD";
            break;
            case 1:
                gama = gamaB;
                System.out.println("Gama Baja:"+gamaBaja);
                marca = "FIAT";
            break;
            case 2:
                gama = gamaB;
                System.out.println("Gama Baja:"+gamaBaja);
                marca = "RENAULT";
            break;
            case 3:
                gama = gamaA;
                System.out.println("Gama Alta:"+gamaAlta);
                marca = "VOLSKSWAGEN";
            break;
            case 4:
                gama = gamaA;
                System.out.println("Gama Alta:"+gamaAlta);
                marca = "BMW";
            break;
         default: 
                System.out.println("No selecciono una gama"); 
        }
        
        int añoVehiculo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año del vehiculo: "));
        String dominio = JOptionPane.showInputDialog("Ingrese el dominio de su vehiculo:");
        
        
        // Calculo precios de la poliza
        if(añoVehiculo >=1990 && añoVehiculo <=1999 ){
           cuotaParcial = 480;
           totalAPagar = cuotaParcial + gamaBaja;
           
           }else if(añoVehiculo >=2000 && añoVehiculo <=2010) { 
                    cuotaParcial = 780;
                    totalAPagar = cuotaParcial + gamaBaja;
              
                    }else if(añoVehiculo >=2011 && añoVehiculo <=2016){
                         cuotaParcial = 950;
                         totalAPagar = cuotaParcial + gamaBaja;
              
                        }else if(añoVehiculo >=2017 && añoVehiculo <=2020){
                                 cuotaParcial = 1200;
                                 totalAPagar = cuotaParcial + gamaAlta;
             
                            } else {
                                    cuotaParcial = 350;
                                    totalAPagar = cuotaParcial + gamaBaja;
                           }

        //System.out.println("Suma total: " +sumar); 
        // Imprimo la cotizacion de la poliza
        System.out.println("==================================");
        System.out.println("======= COTIZACION DEL SEGURO ============");
        System.out.println("Automotores CFP N°36");
        System.out.println("Zavaleta 204, C1437EYF, CABA");
        System.out.println("==================================");
        System.out.println("Nombre del Cliente: " +nombre+ "\nApellido: " +apellido+ "\nMarca del Vehiculo: " +marca+ "\nDominio del Vehiculo: " +dominio+ "\n\"Año del vehiculo: " +añoVehiculo);
        System.out.println("Tipo de gama del vehiculo:" +gama );
        System.out.println("==================================");
        System.out.println("Total a abonar en la poliza:" +totalAPagar);
        System.out.println("==================================");
        
    }
    
}
