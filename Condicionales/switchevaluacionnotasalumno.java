package com.mycompany.ejerciciodecondicional;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class EjerciciodeCondicional {

    public static void main(String[] args) {
        /*Pedir una nota por terminal de 0 al 10 y mostrarla de lasiguiente 
         manera : Insuficiente de 0 a 4 , suficiente 5, notable 7 y 8 
        y sobresaliente 9 al 10*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu calificacion: ");
        int notas = sc.nextInt();
        
        switch(notas){
            case 1: if (notas >= 0 && notas <5 ){
                System.out.print("La calificacion es insuficiente. ");
               }
            break;
            
            case 2: if (notas == 5);
                System.out.print("La calificacion es suficiente. ");
            
                break;
            case 3: if(notas >= 7 && notas <=8){
                System.out.print("La calificacion es notable. ");
            }
            case 4: if (notas >=9 && notas == 10){
                System.out.println("La calificacion es Sobresaliente. ");
            }    
            
            else {
                System.out.print("Final. ");
            }
            
        }
    }
}
            
