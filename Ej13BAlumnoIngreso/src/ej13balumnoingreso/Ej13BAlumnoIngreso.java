/*
B)Ingrese por teclado el puntaje de un alumno que ha postulado a la Universidad, visualice un mensaje “Alumno Ingresado” si el puntaje obtenido es mayor a 500.
Solicitar nombre del alumno y tres notas (hacer promedio)

Mostrar y solicitar valores utilizando JOPTIONPANE

Se necesita que se realice el diagrama de flujo antes de decodificar.
Subir el proyecto a un repositorio nuevo, teniendo encuentra que el repositorio se deberá llamar como el proyecto y el proyecto deberá tener el siguiente estructura para identificarlo :
ApellidoFechaTema (falabrino2805scanner)
En el mismo proyecto por favor incluir el diagrama de flujo.
Por favor no se olviden de darme permisos en el repositorio y agregar su comentario con la ruta del repositorio.*/
package ej13balumnoingreso;
import javax.swing.JOptionPane;

public class Ej13BAlumnoIngreso {

   
    public static void main(String[] args) {
        
    //int promedio = 0;
    int puntaje = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un puntaje para postularse: "));
    
    if (puntaje >500){
        
        JOptionPane.showMessageDialog(null,"Alumno Ingresado " +puntaje,"PUNTAJE",JOptionPane.INFORMATION_MESSAGE); 
        }else{
        JOptionPane.showMessageDialog(null,"Alumno No Ingresado " +puntaje,"PUNTAJE",JOptionPane.INFORMATION_MESSAGE);
        }
    
    String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
    double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese una nota a promediar: "));
    double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese una segunda nota: "));
    double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese una tercera nota: "));
    
    double promedio = (nota1 + nota2 + nota3)/ 3;
    
    JOptionPane.showMessageDialog(null, "Nombre: " +nombre,"ALUMNO",JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null, "El promedio de las tres notas de es: " +promedio,"PROMEDIO",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
