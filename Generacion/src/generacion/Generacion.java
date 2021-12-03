
package generacion;

public class Generacion {

    public static void main(String[] args) {
        
   int edad = 1982;
                
   if (edad >=1930 && edad <= 1948){
       System.out.println(+ edad + " Es de la generacion Silent Generation");
   }
        else if (edad >=1949 && edad <= 1968){
        System.out.println( + edad + " Es de la generacion Baby Boom");
         }
            else if (edad >=1969 && edad <= 1980){
            System.out.println(+ edad + " Es de la Generacion X");
            }
                else if (edad >=1981 && edad <= 1993){
                System.out.println(+ edad + " Es de la Generacion Y");
                }
                    else if (edad >=1994 && edad <= 2010){
                    System.out.println(+ edad + " Es de la Generacion Z");
                    }
                        else {
                        System.out.println(+ edad + "Se desconoce la generacion a la que pertenece");
              }
    }
    
}
