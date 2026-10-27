public class Practicbucle {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de filas");
        int numerofilas = sc.nextInt();
        for( int i = 0 ; i < numerofilas ; i++ ){
            for(int j = 0 ; j <=numerofilas -1 -i ; j++){
            System.out.print(" ");
        }
            
            for(int k = 0; k <(2 * i + 1); k++){
                System.out.print("*");
            }
            {
      System.out.println();
        }
    }
}
}
