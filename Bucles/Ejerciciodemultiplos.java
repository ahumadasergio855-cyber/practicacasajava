public class Ejerciciodebucles1 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Introduce el numero para obtener los multiplos: ");
       int num = sc.nextInt();
       int multiplos=num;
       
        for(int contador = 1; multiplos<50; contador++){            
            System.out.println("los muitiplos son " + multiplos);
            multiplos = num * contador;
            
        }
