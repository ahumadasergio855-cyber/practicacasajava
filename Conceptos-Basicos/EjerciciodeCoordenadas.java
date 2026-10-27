package com.mycompany.practic01;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author sergio Ahumada
 */
public class Practic01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce la coordenada x:");
        double coordenadax1= sc.nextDouble();
        System.out.print("Introduce la coordenada y:");
        double coordenadax2 = sc.nextDouble();
        double distanciax ;
        distanciax = Math.pow((coordenadax1-coordenadax2), 2);
        
        System.out.print("Introduce coordenada de destino y1:");
        double coordenaday1 = sc.nextDouble();
        
        System.out.print("Introduce coordenada de destinoy2:");
        double coordenaday2 = sc.nextDouble();
        double distanciay ;
        distanciay = Math.pow((coordenaday2-coordenaday1), 2);
        
        double distanciatotal ;
        distanciatotal = Math.sqrt(distanciay + distanciax);
        System.out.println("distancia total es: " +distanciatotal);
        
        System.out.print("introduce la velocidad media en km/h:");
        double num_decimal=sc.nextDouble(); //1.89h
        int hora_entera =(int)num_decimal; // 1h
        double entero_decimal=num_decimal-hora_entera; // 1.89-1=0.89h
        double min_decimal=entero_decimal*60;
        int min_entero =(int)min_decimal;
        double seg_decimal=(min_decimal-min_entero)*60;
       int seg_entero=(int)Math.round(seg_decimal); 
       System.out.println("Segundos " +seg_entero);
       
       System.out.println("Introduce el consumo medio (L/100km):");
       double consumomedio= sc.nextDouble();
       double litrosTotal = (consumomedio * distanciatotal)/100;
       System.out.println("Litros totales necesarios:" +litrosTotal);
    }
}
