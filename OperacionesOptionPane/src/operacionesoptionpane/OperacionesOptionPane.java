/*A)Crear una aplicación, que permita el ingreso de 2 números, para luego calcular la suma, resta, división, multiplicación, división y residuo.

Mostrar y solicitar valores utilizando JOPTIONPANE

Se necesita que se realice el diagrama de flujo antes de decodificar.
Subir el proyecto a un repositorio nuevo, teniendo encuentra que el repositorio se deberá llamar como el proyecto y el proyecto deberá tener el siguiente estructura para identificarlo :
ApellidoFechaTema (falabrino2805scanner)
En el mismo proyecto por favor incluir el diagrama de flujo.
Por favor no se olviden de darme permisos en el repositorio y agregar su comentario con la ruta del repositorio.*/
package operacionesoptionpane;
import javax.swing.JOptionPane;

public class OperacionesOptionPane {   
    
    public static void main(String[] args) {
        
        double suma, resta, division, multiplicacion;
        
        
       double num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero:")); 
       double num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero:"));
       
       suma = num1 + num2;
       resta = num1 - num2;
       division = num1 / num2;
       multiplicacion = num1 * num2;
       
       JOptionPane.showMessageDialog(null,"El resultado de la suma de ambos numeros es: " +suma ,"SUMA",JOptionPane.INFORMATION_MESSAGE); 
       
       JOptionPane.showMessageDialog(null,"El resultado de la resta de ambos numeros es: " +resta ,"RESTA",JOptionPane.INFORMATION_MESSAGE);
       JOptionPane.showMessageDialog(null,"El resultado de la division de ambos numeros es: " +division ,"DIVISION",JOptionPane.INFORMATION_MESSAGE);
       JOptionPane.showMessageDialog(null,"El resultado de la multiplicaion de ambos numeros es: " +multiplicacion ,"MULTIPLICACION",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
