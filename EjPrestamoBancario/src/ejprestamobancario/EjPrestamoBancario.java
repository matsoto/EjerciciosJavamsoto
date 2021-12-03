
package ejprestamobancario;

import javax.swing.JOptionPane;

public class EjPrestamoBancario {

    public static void main(String[] args) {
        
        int importeAPagar =0;
        
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        String apellido = JOptionPane.showInputDialog("Ingrese su apellido:");
        String numero = JOptionPane.showInputDialog("Ingrese su DNI: ");
        //int dni = Integer.parseInt(numero);
        String numero2 = JOptionPane.showInputDialog("Ingrese su sueldo mensual: ");
        int sueldo =Integer.parseInt(numero2);
        
        String numero3 = JOptionPane.showInputDialog("Ingrese el monto a solicitar: ");
        int solicitado =Integer.parseInt(numero3);
        
        String numero4 = JOptionPane.showInputDialog("Ingrese el monto a solicitar: ");
        int cantCuotas =Integer.parseInt(numero4);
        
        
        int sueldoAnual = sueldo * 12;
        int sueldoPorDiez = sueldo * 10;
        
        if (sueldoAnual <=200000 && solicitado <=sueldoPorDiez ){
            
           importeAPagar = solicitado /cantCuotas;
        }
        
        System.out.println("El importe a pagar es:" +importeAPagar);
        
        
    }
    
}
