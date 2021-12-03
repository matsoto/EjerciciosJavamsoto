
package juegodelvaso03112021;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class JuegodelVaso03112021 {

   
    public static void main(String[] args) {
        
        Random RD = new Random();
        int pelotita = RD.nextInt(3);
        ImageIcon icon = new ImageIcon("src/Imagenes/juego.png");
        ImageIcon bien = new ImageIcon("src/Imagenes/bien.png");
        ImageIcon mal = new ImageIcon("src/Imagenes/mal.png");
        
        //Inicio del Juego 
        int seleccion = JOptionPane.showOptionDialog(null,"Encuentra la Pelotita","Juego del Vaso",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,icon,new Object[] {"Vaso 1","Vaso 2","Vaso 3" },"Vaso 1");
        
        //logica del juego
        if (pelotita == seleccion){
            JOptionPane.showMessageDialog(null,"Muy Bien","Juego del Vaso",JOptionPane.INFORMATION_MESSAGE,bien);
        }else {
            JOptionPane.showMessageDialog(null,"Muy Mal","Juego del Vaso",JOptionPane.INFORMATION_MESSAGE,mal);
        }
        
        
        
    }
    
}
