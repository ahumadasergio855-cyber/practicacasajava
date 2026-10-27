package com.mycompany.mavenproject1;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author Carmen
 */
public class Mavenproject1 {

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
        double num_decimal=sc.nextDouble(); 
        int hora_entera =(int)num_decimal; 
        double entero_decimal=num_decimal-hora_entera; 
        double min_decimal=entero_decimal*60;
        int min_entero =(int)min_decimal;
        double seg_decimal=(min_decimal-min_entero)*60;
       int seg_entero=(int)Math.round(seg_decimal); 
       System.out.println(hora_entera + "h" + min_entero + "m" + seg_entero + "s");
       
       System.out.println("Introduce el consumo medio (L/100km):");
       double consumomedio= sc.nextDouble();
       double litrosTotal = (consumomedio * distanciatotal)/100;
       System.out.println("Litros totales necesarios:" +litrosTotal);
       System.out.println("Introduce el precio del litro (E)");
       double precioLitro = sc.nextDouble();
       
       double costeTotalViaje = litrosTotal * precioLitro;
       System.out.println("Coste de viaje total : " +costeTotalViaje + "€");
       
       System.out.println("Introduce tu presupuesto (€):");
       double presupuesto =  sc.nextDouble();
       
       boolean dentroPresupuesto = presupuesto >= costeTotalViaje;
       System.out.println("¿Dentro del presupuesto? " + dentroPresupuesto);
       
       boolean esOptimo = (costeTotalViaje <= presupuesto) && (num_decimal <= 2);
       System.out.println("¿Viaje óptimo? " + esOptimo);

        boolean menorDe2h = num_decimal < 2;
        System.out.println("¿Menor de 2 horas? " + menorDe2h);
       
       
    }
}
