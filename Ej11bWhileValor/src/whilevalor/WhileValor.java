
package whilevalor;
import java.util.Scanner;
/*
 b)Realizar un programa utilizando WHILE que  le pida al usuario un valor inicial y un valor final por consola,
 e incrementemos el valor inicial dado hasta el tope establecido, 
 mostrando el valor de la variable contadora en cada iteración.
 */
public class WhileValor {

    public static void main(String[] args) {
       Scanner ingreso = new Scanner (System.in);
       int valorInicial = 0, valorFinal = 0;
       
       System.out.println("--------------Mostrar numero en pantalla------------");
       System.out.println("Ingrese un numero entero para iniciar");
       valorInicial = ingreso.nextInt();
       System.out.println("");
       
       System.out.println("Ingrese un numero entero para finalizar");
       valorFinal = ingreso.nextInt();
       
       while(valorInicial <= valorFinal){
       
           System.out.print(" " +valorInicial );
           
           valorInicial++;
       }
       
    
    }
    
}
