package com.mycompany.ordendemayormenornumero;
import java.util.Scanner;
/**
 *
 * @author Carmen
 */
public class OrdendeMayorMenornumero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numMayor= 0 ;
        int numMenor= 0 ;
        //Bucle para poner limite a los números
        for (int i = 1 ; i <= 8 ; i++){
        System.out.println("Introduce el numerode 8 numeros");
        int numero = sc.nextInt();
           if( i == 1){
               //se les asigna el valor de numero a ambos apartir del 0 para compararlos
               numMayor = numero ;
               numMenor = numero;
           }
           //si el numero que hemos asignado es menor que 
           //el numero mayor se asignara a numMayor ese valor y asi 
           //hasta obtener el maximo y minimo de los 8.
           if(numero > numMayor){
               numMayor = numero;
           }
           if(numero < numMenor){
               numMenor = numero;
           }
          
        }
        System.out.println("Mayor:"+numMayor);
        System.out.println("Menor:"+numMenor);
    }
}
