package condicionalesif;
/*
<Ejercicio N°1> */
public class CondicionalesIF {
    
    public static void main(String[] args) {
    
    int temperatura = 28;
    
System.out.println("--------Ejercicio N°1------------");    

if (temperatura > 27){ 
    System.out.println("Ir a la playa");
} else{
    System.out.println("No ir a la playa");
}
/* Ejercicio N°2 Hace sol */
System.out.println("--------Ejercicio N°2------------");

boolean HaceSol = true;

if (HaceSol ==true){
    System.out.println("No te olvides la sombrilla");   
}

/* Ejercicio N°3 */    
System.out.println("--------Ejercicio N°3------------");  

boolean nevado = true;

if(HaceSol || nevado == true ){
   System.out.println("Que bien!");
}

/* Ejercicio N°4 */
System.out.println("--------Ejercicio N°4------------");

int temp = 29;
boolean nevando = true;
        
if (nevando && temp >= 20 && temp <= 30 ){    
    System.out.println("No me lo creo ");
}

/* Ejercicio N°5 */
System.out.println("--------Ejercicio N°5------------");

temperatura = 32;

if(temperatura < 0 || temperatura > 30 && HaceSol ){
    System.out.println("Mejor me quedo en casa");
}

/* Ejercicio N°6 */
System.out.println("--------Ejercicio N°6------------");

if(temperatura >25){
    System.out.println("A la Playa!");
}

/* Ejercicio N°7 */
System.out.println("--------Ejercicio N°7------------");

temperatura = 10;

if(temperatura <=25){
    System.out.println("Esperando al buen tiempo");
    }

/* Ejercicio N°8 */
System.out.println("--------Ejercicio N°8------------");

if(temperatura > 25){
    System.out.println("A la playa!!");
}else{
    System.out.println("Esperando al buen tiempo");    
    }

/* Ejercicio N°9 */
System.out.println("--------Ejercicio N°9------------");

if(temperatura > 25){ // temperatura mayor que 25
    System.out.println("A la playa");
} else if(temperatura < 25){ // temperatura menor que 25
        System.out.println("A la montaña!!");
    } else if(temperatura < 5 && nevado){
           System.out.println("A esquiar");
           }
            else{
                System.out.println("A dormir");
                }

/* Ejercicio N°10 */
System.out.println("--------Ejercicio N°10------------");

temperatura = 10;

if(temperatura < 15){
    if (temperatura <5){
        System.out.println("A esquiar!!!");
 } else{
    System.out.println("A dormir zzzz!");
    }  
  }
else if(temperatura > 25){
    System.out.println("A la playa!!!");
  } else{
        System.out.println("A la montaña");
        }
  }
}