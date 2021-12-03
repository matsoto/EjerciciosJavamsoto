/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

/**
 *
 * @author SONY
 */
public class Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        System.out.println("Hola mundo");

		int v1;
		v1 = 1;

		System.out.println("Variables : " + v1);
		v1++;
		System.out.println("Variables : " + v1);
		double v2 = 1.121212;

		System.out.println("Variables : " + v2);

		float v3 = 1.13f;
		System.out.println("Variables : " + v3);

		short v4 = 1;
		System.out.println("Variables : " + v4);

		boolean v5 = true;
		System.out.println("Variables : " + v5);
		v5 = false;
		System.out.println("Variables : " + v5);

		String Nombre;
		Nombre = "Juan";
		String s3 = "Feliz Cumpleaños";
		System.out.println("Variables : " + Nombre);

		char A;
		A = 'a';
		System.out.println("Variables : " + A);

		char letraMayuscula = 'A'; // Observe la necesidad de las ' '

		char letraV = '\u0056'; // Letra 'V'

		System.out.println("letra mayuscula " + letraMayuscula);
		System.out.println("letra v " + letraV);

		int q2, q4, q5;
		q2 = 5;
		q4 = 10;
		q5 = 20;
		q2 = q4 + q5;

		System.out.println("Variables : " + q2);
		
		q2 = q5 / q4;

		System.out.println("dividir   : " + q2);
		
		q2 = q5 * q4;

		System.out.println("Producto  : " + q2);

		float qq2, qq4, qq5;
		qq2 = 5.11f;
		qq4 = 10.2559834232323233f;
		qq5 = 20.1f;
		qq2 = qq2 + qq4 + qq5;

		System.out.println("Variables : " + qq2);

		double miPi = 3.1416252431; // Aproximadamente

		float temperatura = (float) 36.65456667766; // Paciente sin fiebre

		System.out.println(miPi);
		System.out.println(temperatura);

		
		
		
		

    }
    
}
