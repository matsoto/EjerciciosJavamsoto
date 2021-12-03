package sueldo;
/* Consigna

Crear un Programa que calcule los aumentos de sueldo de los empleados dependiendo el área en donde se desarrollan.
Solicitar el nombre apellido del empleado  luego mostrar opciones para que seleccione el área y la categoría.
Realizar el calculo del aumento de sueldo que le corresponde.
imprimir la ficha del empleado con :
Nombre
Fecha de Nacimiento
Área
Categoría
Años de antigüedad
Sueldo actual
Porcentaje de aumento
Sueldo con el aumento

Nota : los datos deben solicitarse o darle opción a que los seleccione 

Categoría    Aumento
A                     18%
B                      12%
C                       9%
D                       6% */
import java.util.Scanner;
public class Sueldo {

    public static void main(String[] args) {
   
    Scanner leer = new Scanner (System.in);
    int categoria = 0;  
    int A = 10000, B = 20000, C = 30000, D = 40000;
  
    double catA = 1.18, catB = 1.12, catC = 1.09, catD = 1.06; 
    double aumento = 0;

    System.out.print("Ingrese su nombre: ");
    String nombre = leer.nextLine();
    System.out.print("Ingrese su apellido: ");
    String apellido = leer.nextLine();
    System.out.println("");
    System.out.print("Ingresar fecha de nacimiento: ");
    String fecha = leer.nextLine();
    System.out.println("¿En que area trabaja?");
    System.out.println("Ej:"); 
    System.out.println("Desarrollo");
    System.out.println("Test");
    System.out.println("Proyectos");
    System.out.println("Implementacion");
    System.out.println("");
    String seleccion = leer.nextLine();
    System.out.println("¿Cuantos años de antiguedad tiene?");
    int antiguedad  = leer.nextInt();
    System.out.println(" -------- Seleccione un numero de categoria ---------");
    System.out.println("1 - Categoria A");
    System.out.println("2 - Categoria B");
    System.out.println("3 - Categoria C");
    System.out.println("4 - Categoria D");
    categoria = leer.nextInt();
    
    switch(categoria){
        case 1:
            aumento = A * catA;
        break;
        case 2:
            aumento = B * catB;
        break;
        case 3:
            aumento = C * catC;
        break;
        case 4:
            aumento = D * catD;
        break;
        default:  
        System.out.println("Selecciono una categoria incorrecta"); 
    }    
    
    System.out.println("----------------Ficha del Empleado-------------");
    System.out.println("Nombre: " + nombre);
    System.out.println("Apellido: " + apellido);
    System.out.println("Fecha de nacimiento: " + fecha);
    System.out.println("Categoria: " + seleccion);
    System.out.println("Años de antiguedad: " + antiguedad);
    
    if (categoria == 1 ){
        System.out.println("Sueldo Actual: " + A  );
        System.out.println("Cateroria A");
        System.out.println("Le corresponde un %18 de aumento");
        } else if(categoria == 2){
            System.out.println("Sueldo Actual: " + B  );
            System.out.println("Cateroria B");
            System.out.println("Le corresponde un %12 de aumento");
            } else if(categoria == 3){
                System.out.println("Sueldo Actual: " + C  );
                System.out.println("Cateroria C");
                System.out.println("Le corresponde un %0.9 de aumento");
                    } else if(categoria == 4) {
                        System.out.println("Sueldo Actual: " + D  );
                        System.out.println("Cateroria C");
                        System.out.println("Le corresponde un %0.6 de aumento");
                        } else{
                            System.out.println("Categoria incorrecta");
                            }                     
    System.out.println(" El sueldo con el aumento es:" + aumento);
    }
    
}
