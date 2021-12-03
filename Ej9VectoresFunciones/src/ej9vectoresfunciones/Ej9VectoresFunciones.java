/*
Realizar un programa con el boletín de un alumno. El mismo debe contener el nombre del alumno, fecha de nacimiento y dni. Debe contener tres notas de una materia(dos vectores estáticos con tel nombre de la materia y la nota). Al final se debe recorrer el vector eh imprimir por consola la ficha del alumno con el promedio de cada materia.
Realiza una función para hacer el calculo del promedio
============================
====== Boletín del Alumno ======
== Alumno : Juan C Falabrino ====
== Fecha Nac: 23/06/1981 ====
== Dni: 999999999 ====
== Materia ======= Nota ======
= Literatura =1= 4 ======
= =2= 6 ======
= =3= 9 ======
============================
Promedio de : 6,333 =====
===========================



Se necesita que se realice el diagrama de flujo antes de decodificar.
Subir el proyecto a un repositorio nuevo, teniendo encuentra que el repositorio se deberá llamar como el proyecto y el proyecto deberá tener el siguiente estructura para identificarlo :
ApellidoFechaTema (falabrino2805scanner)
En el mismo proyecto por favor incluir el diagrama de flujo.
Por favor no se olviden de darme permisos en el repositorio y agregar su comentario con la ruta del repositorio.

Gracias
Saludos Cordiales

*/
package ej9vectoresfunciones;

import java.util.Scanner;
public class Ej9VectoresFunciones {
   
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
       
        double notas[] = new double[3];
        int indice= 0;
        
        System.out.print("Ingrese su Nombre: ");
        String nombre = leer.nextLine();
        System.out.print("Ingrese su Fecha de nacimiento: ");
        String fechaNacimiento = leer.nextLine();
        System.out.print("Ingrese su Edad: ");
        String dni = leer.nextLine();
        System.out.print("Ingrese la materia para calcular el promedio : ");
        String materia = leer.nextLine();
     
        do{
            System.out.println("Ingrese la nota: " );
            notas[indice] = leer.nextInt();
        
        indice++;
        }while(indice!=3);
        
        double promedio = (notas[0] + notas[1] + notas[2]) /3;
        System.out.println("Promedio:" +promedio);
        
         for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota "+i);
            System.out.print("NOTA: " +notas[i]);
            
        System.out.println("\n\n======= Boletín del Alumno ======");
        System.out.println("== Alumno: " +nombre);
        System.out.println("== Fec. Nac: " +fechaNacimiento);
        System.out.println("== DNI: " + dni);
        System.out.println("== Materia ==== Nota");
        for (int j = 0; j < notas.length; j++) {
        System.out.println("== Literatura - Nota n°" + (1+j) + ": " + notas[i]);
        }
        System.out.println("== Promedio: " + promedio);
        }
        
    }
    
}
