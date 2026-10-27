package com.mycompany.sahualc820_peud2;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Sahualc820_peud2 {

    public static void main(String[] args) {
        System.out.println("----- MENU DE ENTRADAS DE CINE -----");
        System.out.println("1. Entrada estandar (8.00 euros/persona");
        System.out.println("2. Entrada joven (6.00 euros /persona ");
        System.out.println("3. Entrada senior (2.50 euros /persona");
        System.out.println("4. Entrada familiar (pack 30.00 euros hasta 6 personas");
        Scanner sc = new Scanner(System.in);
        //empezamos con la estructura de switch para el menu de entradas
        int menuopciones = sc.nextInt();
        switch(menuopciones){
            case 1: 
                System.out.print("Introduce el numero de entradas: ");
                int numeroentradas = sc.nextInt();
                if(numeroentradas <= 0){
                    System.out.println("La cantidad de entradas no es valido");
                    break;
                }
                double total = 0;
                total = 8 * numeroentradas;
                System.out.println("Total a pagar : " +total+"0" + " euros");
                
            break;    
            case 2:
                System.out.print("Introduce la edad: ");
                int edad = sc.nextInt();
                if(edad >=120){
                     System.out.println("Edad introducida no valida");
                     break;
                }
                if(edad >=12 && edad<=25 ){
                    System.out.println("Dato valido de edad");
                    
                }
                else {
                    System.out.println("No puede comprar este tipo de entrada: ");
                    break;
                }
                System.out.print("Introduce el numero de entradas: ");
                 numeroentradas = sc.nextInt();
                if(numeroentradas <= 0){
                    System.out.println("La cantidad de entradas no es valido");
                    break;
                }
                int palomitas = 1 ;
                palomitas = 1 * numeroentradas;
                total = 6 * numeroentradas;
                System.out.println("total a pagar: " + total +"0" );
                System.out.println("Incluye: " +palomitas+ " palomitas gratis.");
            
           break; 
           
            case 3:
                System.out.print("Introduce la edad: ");
                 edad = sc.nextInt();
                 if(edad >=120){
                     System.out.println("Edad introducida no valida");
                     break;
                 }
                if((edad >=65) ){
                    System.out.println("Dato valido de edad");
                    
                }
                else {
                    System.out.println("No puede comprar este tipo de entrada: ");
                    break;
                }
                System.out.print("Introduce el numero de entradas: ");
                 numeroentradas = sc.nextInt();
                if(numeroentradas <= 0){
                    System.out.println("La cantidad de entradas no es valido");
                    break;
                }
                int bebidas = 1 ;
                bebidas = 1 * numeroentradas;
                total = 2.50 * numeroentradas;
                System.out.println("total a pagar: " + total +"0" );
                System.out.println("Incluye: " +bebidas+ " bebidas gratis.");
            
                
           break;
            case 4:
                System.out.print("Introduce el numero de personas del grupo por favor: ");
                int gruponumero =sc.nextInt();
                if(gruponumero <=3 && gruponumero >=6 ){
                    System.out.println(" el numero de personas introducida es valida ");
                }
                else {
                    System.out.println("El numero de personas introducido no es valido");
                    break;
                }
            
            if(gruponumero > 6 ){
                gruponumero++;
                
            }      
            numeroentradas = (gruponumero/2)/2;
            total = 30 * numeroentradas;
            bebidas= 2;
            bebidas = 2 * numeroentradas;
            palomitas = 2;
            palomitas = 2 * numeroentradas;
            System.out.println("Total a pagar: " +total);
            System.out.println("Incluye"+palomitas+" Palomitas gratis");
            System.out.println("Incluye"+bebidas+" Bebidas gratis");
            
                    
            break;
            default:
                System.out.println("Error.Final de la ejecucion");
        }
    }
}
