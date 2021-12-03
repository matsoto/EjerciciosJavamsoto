/*
 * Se necesita crear un vector estático  de tipo double que tenga como resultado útiles escolares.
 * Imprimiendo en pantalla:
 * Litado de precios de los Útiles escolares
 * Lapicera  $ 40.5
 * Cuaderno  $ 139.99
 * Cartuchera  $ 560.5
 * Mochila  $ 1399.99
 */
package ejercicioclase22.pkg10;

public class EjercicioClase2210 {

    public static void main(String[] args) {
    
        double[] utilesEscolares = new double[]{40.5, 139.99, 560.5, 1399.9};
       
        System.out.println("========Listado de precios utiles escolares=======\n");
        
        System.out.println("Lapicera: " +utilesEscolares[0]);
        System.out.println("Cuaderno: " +utilesEscolares[1]);
        System.out.println("Cartuchera: " +utilesEscolares[2]);
        System.out.println("Mochila: " +utilesEscolares[3]);
    }
    
}
