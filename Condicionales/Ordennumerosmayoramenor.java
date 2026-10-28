package com.mycompany.ejerciciosintroductoriosun2;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class EjerciciosintroductoriosUN2 {

    public static void main(String[] args) {
        //Declaramos el Scanner
       Scanner sc = new Scanner(System.in) ;
       //logica de comparacion de numeros de las 3 variables
       System.out.print("Introducir la primera variable: ");
       int num1= sc.nextInt();
       System.out.print("Introducir la segunda variable:");
       int num2 = sc.nextInt();
       System.out.print("Introducir la tercera variable:");
       int num3 = sc.nextInt();
       //condicionales donde compararemos cada numero con las otras variables 
      if (num1 > num2 && num1 > num3) {
            System.out.println("El numero mayor es: " + num1);
         } else if (num2 > num1 && num2 > num3) {
              System.out.println("El numero mayor es: " + num2);
         } else {
             System.out.println("El numero mayor es: " + num3);
             } 
}       
    
    
}

