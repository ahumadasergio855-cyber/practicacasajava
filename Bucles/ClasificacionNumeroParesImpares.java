package com.mycompany.ejerciciopracticacontadorparesimpares;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class EjerciciopracticaContadorparesImpares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pares = 0;
        int impares = 0;
        //bucle para poner limite de 10 numero de impresion de clasificacion entre pares impares
        for(int i = 1 ; i <=10; i++){
            System.out.print("Introduce un numero:");
            int numero = sc.nextInt();
            //el numero se le saca el modulo para sacar la ultima cifra y compararla con 0 y si es igual a 0 se le suma 1 al contador 
            if(numero %2 == 0){
                pares++;
            }else{
                //sino sera impar directamente
                impares++;
            }
        }
        //impresion de los contadores de la clasificacion de los 10 numeros introducidos por el usuario
        System.out.println("Pares:" +pares);
        System.out.println("Impares: "+impares);
    }
}
