/*
Se necesita que al juego del vaso realizado el Viernes 22/10 se le incorpore :
- Jueguen dos participantes
-Solicitar nombre de cada uno
. Tenga tres chances cada participante
- Final muestre en pantalla puntaje y indique el ganador.

Finalizado el desarrollo agregar comentario con el git para verificar el funcionamiento

saludos
*/
package ejn15juegovaso;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class EjN15JuegoVaso {
  
    public static void main(String[] args) {
        
        Random RD = new Random();
        int pelotita = RD.nextInt(3);
      //Creo el logo del juego
      ImageIcon icon = new ImageIcon ("src/Imagenes/JuegoVaso.jpg");
      JOptionPane.showMessageDialog(null,"Bienvenido al juego!","JUEGO DEL VASO",JOptionPane.INFORMATION_MESSAGE,icon);
      
      JOptionPane.showMessageDialog(null,"Juegan dos participantes, a continuacion ingrese los nombres","JUEGO DEL VASO",JOptionPane.INFORMATION_MESSAGE);
      
      String nombreUno = JOptionPane.showInputDialog(null,"Ingresar nombre del primer jugador : ");
      String nombreDos = JOptionPane.showInputDialog(null,"Ingresar nombre del segundo jugador : ");
      
      //Jugada del primer jugador
        int contUno = 0,contDos = 0;
        for (int i=0;i<3;i++){
            int seleccion = JOptionPane.showOptionDialog(null,"Encuentra la pelotita ","JUEGO DEL VASO",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE, icon,new Object[] {"Vaso 1","Vaso 2","Vaso 3" },"Vaso 1");
        
        if (pelotita == seleccion){
                    JOptionPane.showMessageDialog(null,"Muy Bien! Jugador Nro 1","JUEGO DEL VASO ",JOptionPane.INFORMATION_MESSAGE);
                    contUno++;                      
           }else {
                    JOptionPane.showMessageDialog(null,"Muy Mal! Jugador Nro 1","JUEGO DEL VASO",JOptionPane.INFORMATION_MESSAGE);
                    } 
        }
    System.out.println("Palotitas acertadas: "+ contUno);
    
     //Jugada del segundo jugador
            for (int i=0;i<3;i++){
               int seleccion = JOptionPane.showOptionDialog(null,"Encuentra la pelotita ","JUEGO DEL VASO",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE, icon,new Object[] {"Vaso 1","Vaso 2","Vaso 3" },"Vaso 1");
        
            if (pelotita == seleccion){
                    JOptionPane.showMessageDialog(null," Muy Bien! Jugador Nro 2","JUEGO DEL VASO ",JOptionPane.INFORMATION_MESSAGE);
                    contDos++;
                               
            }else {
                    JOptionPane.showMessageDialog(null,"Muy Mal! Jugador Nro 2","JUEGO DEL VASO",JOptionPane.INFORMATION_MESSAGE);
                    } 
             }
    System.out.println("Palotitas acertadas: "+ contDos);
    
    //Resultado de las tiradas
    if(contUno>contDos){
     JOptionPane.showMessageDialog(null,"---Resultado---\n\n Nombre: "+nombreUno+ "\nCantidad de aciertos: "+contUno+"\n\nGanador Jugador numero uno! ","JUEGO DEL VASO",JOptionPane.INFORMATION_MESSAGE);
    } else if(contDos>contUno){
        JOptionPane.showMessageDialog(null,"---Resultado---\n\n Nombre: "+nombreDos+ "\nCantidad de aciertos: "+contDos+"\n\nGanador Jugador numero dos! ","JUEGO DEL VASO",JOptionPane.INFORMATION_MESSAGE);
    } else if(contUno == contDos){
        JOptionPane.showMessageDialog(null,"---Resultado---\n\n Nombre primer jugador: "+nombreUno+"\nNombre segundo jugador: "+nombreDos+ 
        "\nCantidad de aciertos primer Jugador: "+contUno+"\nCantidad de aciertos segundo Jugador: "+contDos+ "\n\nQUEDARON EMPATADOS! ","JUEGO DEL VASO",JOptionPane.INFORMATION_MESSAGE);
    }
 }
}