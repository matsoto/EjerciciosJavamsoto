
package ejercicio2;

public class Ejercicio2 {

    public static void main(String[] args) {
     
    int x = 7;
    int y = 5;
    double n = 3.1;
    double m = 2.2;
    
    int suma, diferencia, producto, cociente, resto;
    double suma1, diferencia1, producto1, cociente1, resto1;
    double suma2, cociente2, resto2;
    int doble_x, doble_y;
    double doble_m, doble_n, suma_gral, producto_gral;
    
    
    
    
    
    System.out.println("El valor de la Variable X = " + x);
    System.out.println("El valor de la Variable Y = " + y);
    System.out.println("El valor de la Variable N = " + n);
    System.out.println("El valor de la Variable M = " + m);
   
    //Operaciones
    
    suma = x + y;
    diferencia = x - y;
    producto = x * y;
    cociente = x /y;
    resto = x % y;
    
    
    suma1 = n + m;
    diferencia1 = n - m;
    producto1 = n * m;
    cociente1 = n / m;
    resto1 = n % m;
    
    suma2 = x + n;
    cociente2 = y / m;
    resto2 = y % m;
    
    // Dobles
    
    doble_x = x *2;
    doble_y = y *2;
    doble_n = n *2;
    doble_m = m *2;
    suma_gral = x + y + n + m;
    producto_gral = x * y * n * m;
    
   
    //muestro en pantalla
    
    System.out.println("Suma de x + y = " + suma);
    System.out.println("Resta de x - y = " + diferencia);
    System.out.println("Producto de x * y = " + producto);
    System.out.println("Cociente de x / y = " + cociente);
    System.out.println("Resto de x % y = " + resto);
    
    System.out.println("Suma de n + m = " + suma1);
    System.out.println("Resta de n - m = " + diferencia1);
    System.out.println("Producto de n * m = " + producto1);
    System.out.println("Cociente de n / m = " + cociente1);
    System.out.println("Resto de n % m = " + resto1);
    
    
    System.out.println("Suma de x + n = " + suma2);
    System.out.println("Cociente de y + m = " + cociente2);
    System.out.println("Resto de y % m = " + resto2);
    
    System.out.println("");
    
    System.out.println("Variable X = 7 el doble es " + doble_x);
    System.out.println("Variable Y = 5 el doble es " + doble_y);
    System.out.println("Variable N = 3,1 el doble es " + doble_n);
    System.out.println("Variable M = 2,2 el doble es " + doble_m);
    
    System.out.println("");
    
    System.out.println("La suma de todas las variables es: " + suma_gral);
     System.out.println("El producto de todas las variables: " + producto_gral);
    
    }
    
}
