package com.mycompany.ejerciciosud3bucles;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class EjerciciosUD3buclesSAA{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------Ejercicios de Bucles--------");
        System.out.println("Selecciones una opcion:");
        System.out.println("1. Ordenacion");
        System.out.println("2. Incremento de la hora");
        System.out.println("3. Cifra a cifra");
        System.out.println("4. Piramide"); 
        System.out.println("5. Salir");
        int menu = sc.nextInt();
        switch(menu){
            case 1:
                System.out.print("Introduce el primer numero entero(1-100):");
                int n1 = sc.nextInt();
                if(n1 >= 1 && n1 <=100){
                    System.out.println("El numero entero introducido es valido");
                    
                } else {
                    System.out.println("El numero entero introduce es erroneo");
                    break;
                }
                System.out.print("Introduce el segundo numero entero(1-100):");
                 int n2 = sc.nextInt();
                if(n2 >= 1 && n2 <=100){
                    System.out.println("El numero entero introducido es valido");
                    
                } else {
                    System.out.println("El numero entero introduce es erroneo");
                    break;
                }
                System.out.print("Introduce el tercero numero entero(1-100):");
                 int n3= sc.nextInt();
                if(n3 >= 1 && n3 <=100){
                    System.out.println("El numero entero introducido es valido");
                    
                } else {
                    System.out.println("El numero entero introduce es erroneo");
                    break;
                }
                System.out.print("Introduce el cuarto  numero entero(1-100):");
                 int n4 = sc.nextInt();
                if(n4 >= 1 && n4 <=100){
                    System.out.println("El numero entero introducido es valido");
                    
                } else {
                    System.out.println("El numero entero introduce es erroneo");
                    break;
                }
                System.out.print("Introduce el quinto numero entero(1-100):");
                 int n5 = sc.nextInt();
                if(n5 >= 1 && n5 <=100){
                    System.out.println("El numero entero introducido es valido");
                    
                } else {
                    System.out.println("El numero entero introduce es erroneo");
                    break;
                }
                for (int i = 1; i <= 100 ; i++){
                    if( i == n1  || i == n2 || i == n3 || i == n4 || i == n5){
                    System.out.print(+i+ " ");
                } 
                    break;
                
                }  
                
                
            case 2: 
                
                
                System.out.println("Introduce los segundos :");
                int segundos = sc.nextInt();
                
                System.out.println("Introduce los minutos: ");
                int minutos = sc.nextInt();
                
                System.out.print("Introduce las horas: ");
                int hora = sc.nextInt();
                
                if( hora < 0 || hora > 23){
                    System.out.println("El dato de la hora es erronea");
                } else if ( minutos < 0 || minutos  > 59){
                    System.out.println("El dato de los minutos es erronea");
                } else if ( segundos < 0 || segundos > 60){
                    System.out.println("El dato de los segundos es erroneo");
                }
                else {
                    System.out.println("Introduce cuando segundos quieres sumar :");
                    int segundousuario = sc.nextInt();
                    for (int i = 0 ; i < segundousuario ; i++){
                        segundos++;
                        
                        if(segundos == 60){
                            segundos= 0;
                            minutos = minutos++;
                        } else if( minutos == 60){
                            minutos = 0;
                            hora = hora++;
                        }else if( hora == 24){
                            hora = 0;
                        }
                       
                    }
                    System.out.print("El tiempo es:");
                if (hora < 10) {
                    System.out.print("0" + hora + ":");
                } else {
                    System.out.print(hora + ":");
                }
                if (minutos < 10) {
                    System.out.print("0" + minutos + ":");
                } else {
                    System.out.print(minutos + ":");
                }
                if (segundos < 10) {
                    System.out.print("0" + segundos + ":");
                } else {
                    System.out.print(segundos );
                }
                break;
                }
            case 3: 
                int limitevalor = 0;
                int num = 0;
                do {
                System.out.print("Escribe el numero de tres cifras: ");
                 num = sc.nextInt();
                 limitevalor = num ;
               
                if (limitevalor < 100 || limitevalor > 999){
                    System.out.println("El numero supera los limites establecidos");
                }
                } while (limitevalor < 100 || limitevalor >999);
                    
                   
                  //logica de separar los numeros
                   int copia = num ;
                   int divisor = 100;
                   
                   while ( divisor >0){
                       int digito = copia / divisor ;
                       System.out.println(digito);
                       //actualizar datos para la siguiente vuelta imprimir el siguiente digito 
                       copia = copia % divisor ;
                       divisor = divisor / 10;
                   }
                     
                     break;
                
            case 4:
                //Ejercicio extra 4
                System.out.println("Introduce el numero de filas");
                int numerofilas = sc.nextInt();
                //verificación de número de filas
                if (numerofilas > 10){
                    System.out.println("El numero de filas no es valido");
                }else{
                    System.out.println("El numero de filas es valido");
                    
                   for( int i = 1; i <=numerofilas ; i++ ){
                for(int j = 0 ; j <=numerofilas - i ; j++){
                    System.out.print(" ");
                       }
                //impresion ascendentede numero de filas
                   for ( int k = numerofilas - i + 1; k <=numerofilas ; k++){
                       System.out.print(k);
                   }
                //impresion descendente de numerofilas
                   for( int m = numerofilas -1 ; m >= numerofilas -i +1; m--){
                       System.out.print(m);
                   }
                  System.out.println();
                       } 
                }
                
                }
        
        
        
    }
    
    }

    

