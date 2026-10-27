public class Ejerciciio5 {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int primeranota= sc.nextInt();
        System.out.print("Introduce la primera nota:");
        int segundanota= sc.nextInt();
        System.out.print("Introduce la segunda nota:"+primeranota);
        int notamedia = sc.nextInt();  
       
        double nota= notamedia;
               nota += segundanota;

        
        nota /=2;
        System.out.print("la nota media es:" +nota);
        
    }
}
