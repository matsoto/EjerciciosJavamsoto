
package prestamobancario;
import javax.swing.JOptionPane;

public class PrestamoBancario {

    public static void main(String[] args) {
        
        int importeAPagar =0;
        
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        String apellido = JOptionPane.showInputDialog("Ingrese su apellido:");
        String dni = JOptionPane.showInputDialog("Ingrese su DNI: ");
     
        String numero2 = JOptionPane.showInputDialog("Ingrese su sueldo mensual: ");
        int sueldo =Integer.parseInt(numero2);
        
        String numero3 = JOptionPane.showInputDialog("Ingrese el monto a solicitar: ");
        int solicitado =Integer.parseInt(numero3);
        
        String numero4 = JOptionPane.showInputDialog("Ingrese la cantidad de las cuotas: ");
        int cantCuotas =Integer.parseInt(numero4);
        
        int sueldoAnual = sueldo * 12;
        int sueldoPorDiez = sueldo * 10;
        
        System.out.println("Sueldo anual:" +sueldoAnual);
        System.out.println("Sueldo por diez:" +sueldoPorDiez);
        
        if(solicitado <=100000){
            if (sueldoAnual <=200000){ 
                  if (solicitado <= sueldoPorDiez){ 
                      System.out.println("Prestamo aprobado");  
                      importeAPagar = solicitado / cantCuotas;
                      }
                    }
                   }else{
                        System.out.println("Prestamo no aprobado\n");
                         }
        //JOptionPane.showMessageDialog(null, "Nombre: " +nombre+ "\nApellido: " +apellido+ "\nDNI: " +dni+ "\nSueldo: " +numero2+ "\nMonto Solicitado: " +numero3+ "\Cantidad de cuotas pedidas: " +numero4 ,"INFORMACION",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Nombre: " +nombre+ "\nApellido: " +apellido+ "\nDNI: " +dni +"\nSueldo: " +sueldo+ "\nMonto Solicitado: " +solicitado+ "\nCantidad de cuotas: " +cantCuotas+ "\nEl importe a pagar es: " +importeAPagar  ,"INFORMACION",JOptionPane.INFORMATION_MESSAGE);
        
        
        /*
        System.out.println("Nombre:" +nombre);
        System.out.println("Apellido:" +apellido);
        System.out.println("DNI:" +dni);
        System.out.println("Sueldo Mensual:" +sueldo);
        System.out.println("Monto Solicitado:" +solicitado );
        System.out.println("Cantidad de cuotas solicitadas:" +cantCuotas );
        System.out.println("El importe a pagar es:" +importeAPagar);
        */
    }
    
}
