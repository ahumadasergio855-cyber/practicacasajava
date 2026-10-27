public class Practicadefechacondicionales {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int menuopcion = sc.nextInt();
        switch(menuopcion){
            case 1: 
                System.out.print("Introduce el dato de dias(1-31): ");
                int dias = sc.nextInt();
                if(dias >= 1 && dias <= 31){
                    System.out.println("Dato de dia valido");
                }
                else {
                    System.out.println("Dato de dia no valido");
                }
                System.out.print("Introduce el dato del mes(1-12)");
                int mes = sc.nextInt();
                if(mes >= 1 && mes <= 12){
                    System.out.println("Dato del mes valido");
                }
                else {
                    System.out.println("Dato del mes no valido");
                }
                System.out.print("Introduce el dato del año: ");
                int año = sc.nextInt();
                if(año >= 1900 && año <= 2026){
                    System.out.println("El dato del año es valido");
                }
                else{
                    System.out.print("el dato del año no es valido");
                }
                if(mes <10){
                    System.out.print("0"+mes);
                }
                else {
                    System.out.print(+mes);
                }
                if( (mes == 4 || mes == 6 || mes == 9 || mes == 11)&& dias >=30){
                    System.out.print("No puede aver en este mes mas de 30 dias");
                }
                if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)&& dias >= 31){
                    System.out.print("No puede aver en este mes mas de 31 dias");
                }
                if ((mes == 2)&& dias >= 28){
                    System.out.print("Este mes no puede mas de 28 dias");
                }
                System.out.println("fecha:" +dias+ "/" +mes+ "/" +año);
                break;
            default:
        }
    }
}
