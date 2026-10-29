package com.mycompany.practicapiramidedev;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class PracticapiramideDEV {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el numero de filas: ");
        int numerofilas= sc.nextInt();
        //verificacion de maximo numero de filas es 9
       
        if(numerofilas > 9){
            System.out.println("numero de filas no valido");
        } else {
            //cada fila imprime junto la fila de ascende y descendente y el final de println hace el salto de linea de cada linea impresa
            for( int i = 1 ; i <=numerofilas ; i++){
                //para descender con el para generar los espacios 
             for( int j = numerofilas -i +1 ; j < 0  ; j-- ){
                 System.out.print("");
                 //para ascener los numeros k es igual a 1 y esa i vale 1 y se 
                 //va ascendiendo hasta que sea menor o igual a 1 para imprimir sus numero
            } for(int k = 1; k <= i; k++){
                System.out.print(k);
            }// para descender m valdra el i anterior me valdra el numero 
            //de filas y le resto 1 y ese numero se imprime hasta llegar a 1
              for( int m = i -1 ; m <= 1 ; m--){
                  System.out.print(m);
              }
             System.out.println();// imprime la lina de codigo junta primero los
                                  //numeros que mas ascendiendo luegos los que descienden y pasa a salto de linea de otra fila en cada vuelta
        }
           
        }
        
    }
}
