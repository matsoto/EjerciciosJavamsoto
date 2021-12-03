
package pkgwhile;

import java.util.Scanner;
/*
 b)Realizar un programa utilizando WHILE que  le pida al usuario un valor inicial y un valor final por consola,
 e incrementemos el valor inicial dado hasta el tope establecido, 
 mostrando el valor de la variable contadora en cada iteración.
 */

public class While {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner (System.in);
       int valorInicial = 0, valorFinal = 0;
       
       System.out.println("--------------Mostrar numero en pantalla------------");
       System.out.print("Ingrese un numero entero para iniciar: ");
       valorInicial = ingreso.nextInt();
       System.out.println("");
       
       System.out.print("Ingrese un numero entero para finalizar: ");
       valorFinal = ingreso.nextInt();
       
       System.out.println("");
       System.out.println("");
       
       if(valorInicial < valorFinal){
           
       while(valorInicial <= valorFinal){
       
           System.out.print(" , " +valorInicial );
           
           valorInicial++;
        }
       } else{
           System.out.println("El primer valor es mayor al primero");
       }
    }  
}

