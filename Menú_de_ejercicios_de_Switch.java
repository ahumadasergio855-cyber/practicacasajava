public class Practicacasa {

    public static void main(String[] args) {
          Scanner sc = new Scanner (System.in);
        System.out.println("Menu ejercicios condicionales");
        System.out.println("Introduzca el número del ejercicio que quiere ejecutar(1-3)");
        System.out.println("Ejercicio1");
        System.out.println("Ejercicio2");
        System.out.println("Ejercicio3");
        System.out.println("Ejercicio4");
        
       
        int menuopciones = sc.nextInt();
        switch(menuopciones){
           //Primero se declara la variable, luego lo que pide el programa que ingresen, y comparamos
            case 1: System.out.print("Tipo Pokemon atacante:fuego(1), agua(2), planta(3), o eletrico(4) :");
                 int ataquepokemon = sc.nextInt();
                 System.out.print("Tipo de pokemon defensor: fuego(1), agua(2), planta(3) o eletrico(4) :");
                 int defensapokemon = sc.nextInt();
                 //si tu ataque es igual a la defensa, no hay ventaja
            if(ataquepokemon == defensapokemon){
                    System.out.print("El ataque no tiene ventaja especial. ");
                }
                // si tu ataque es agua y la defensa es planta 
            else if (ataquepokemon == 1 && defensapokemon == 3) {
                    System.out.print("El ataque es muy eficaz ");
                }
                //si el agua es el ataque y la defensa es fuego el ataque es muy eficaz 
                else if (ataquepokemon == 2 && defensapokemon == 1){
                    System.out.print("El ataque es muy eficaz");
                }
               // si el ataque es planta y la defensa es agua 
                else if(ataquepokemon == 3 && defensapokemon == 2){
                    System.out.print("El ataque es muy eficaz");
                }
                // si el ataque es electrico y la defensa agua es muy eficaz
                else if(ataquepokemon == 4 && defensapokemon == 2){
                    System.out.print("El ataque es muy eficaz");
                }
                // si ninguno de esto se cumple, el ataque es poco efectivo ya que seria en viceversa y eso no seria efectivo al revés
                    else {
                            System.out.print("El ataque es poco efectivo");
                            }
                break;
            case 2: 
                /*int nivelink = sc.nextInt();
                
                int cantidadcorazones = sc.nextInt();
                int numeroenemigos = sc.nextInt();
                int tipozona = sc.nextInt();
                */
                System.out.print("Introduce el nivel de Link: ");
                int nivelink = sc.nextInt();
                if (nivelink >= 1 && nivelink <=10){
                    System.out.println("El nivel de link es valido");
                } else {
                    System.out.println("Error en introducir el nivel de Link.");
                    break;
                }
                //pedimos al usuario la cantidad de corazones que tiene Link
                System.out.print("Introduce la cantidad de corazones:");
                int cantidadcorazon = sc.nextInt();
                //establecemos el minimo y maximo de corazones para Link
                if(cantidadcorazon >=1 && cantidadcorazon <=10){
                  System.out.println("La cantidad de corazones es válida: ");  
                } else {
                    System.out.println("El dato de corazon introducido no es válido.");
                    break;
                }
                //le pedimos al usuario cuantos enemigos tiene en contra Link
                System.out.println("Introduce el numero de enemigos");
                int numeroenemigos = sc.nextInt();
                //establecemos que el minimo de enemigos debe ser 1 y no menor que eso y que valide  el programa, y maximo 10 
                if(numeroenemigos >=1 && numeroenemigos <=10){
                    System.out.println("El numero de enemigos introducido es válido");
                } else {
                    System.out.println("El dato de enemigos introducido no es válido.");
                    break;
                }
                System.out.print("Introduce el tipo de zona para Link (1-Bosque, 2-Montaña, 3-Templo, 4-Castillo): ");
                int tipozona = sc.nextInt();
                if(tipozona < 1 ||tipozona > 4){
                    System.out.println("El elemento elegido no es válido");
                    break;
                }
                //incluimos una variable auxiliar que al darle valor 0 parte de inicio de 0 y tomara los alores que le asignemos por parte del usuario
                int dificultadlink = 0;
                //establecemos que condiciones debe haber para que sea de una dificultad y si no la siguiente sera la dificultad
                if(nivelink <=5 && cantidadcorazon <=4 && numeroenemigos >=8){
                    dificultadlink = 3;
                } else if (nivelink >=10 &&(cantidadcorazon >=8 && numeroenemigos <=3)){
                    dificultadlink = 1;
                }
                else {
                    dificultadlink = 2;
                }
                //Hacemos un menu que imprima lo que queremos de cada uno sin el println, para que todo se imprima junto
                System.out.print("LINK:");
                   switch(tipozona){ 
                       //El menu de tipode zona 
                       case 1:  System.out.print("Bosque"); break;
                       case 2:  System.out.print("Montaña"); break;
                       case 3:  System.out.print("Templo"); break;
                       case 4:  System.out.print("Castillo"); break;
                   }
                   System.out.print(", Dificultad del nivel");
                   switch(dificultadlink){ 
                       /*El menu de tipo de dificultad donde ya se relaciona que depende el caso que sea de 
                          la misma variable que ya establecimos sus condiciones arriba, se imprimira un caso  */
                       case 1: System.out.print(" Facil");
                       break;
                       case 2: System.out.print(" normal");
                       break;
                       case 3: System.out.print("Dificil");
                       break;
                    }
                       
              break;
                    
             
                  
              
            case 3: 
                System.out.print("Introduce el numero de DNI(SIN LETRAS)");
                int numeroDNI = sc.nextInt();
                
                int resto = numeroDNI % 23;
                
                char letraAsignadasDNI = ' ';
                
                switch(resto){
                    case 0: letraAsignadasDNI = 'T'; break;
                    case 1: letraAsignadasDNI = 'R'; break;
                    case 2: letraAsignadasDNI = 'w'; break;
                    case 3: letraAsignadasDNI = 'A'; break;
                    case 4: letraAsignadasDNI = 'G'; break;
                    case 5: letraAsignadasDNI = 'M'; break;
                    case 6: letraAsignadasDNI = 'Y'; break;
                    case 7: letraAsignadasDNI = 'F'; break;
                    case 8: letraAsignadasDNI = 'P'; break;
                    case 9: letraAsignadasDNI = 'D'; break;
                    case 10: letraAsignadasDNI = 'X'; break;
                    case 11 :letraAsignadasDNI = 'B'; break;
                    case 12: letraAsignadasDNI = 'N'; break;
                    case 13: letraAsignadasDNI = 'J'; break;
                    case 14: letraAsignadasDNI = 'Z'; break;
                    case 15: letraAsignadasDNI = 'S'; break;
                    case 16: letraAsignadasDNI = 'Q'; break;
                    case 17: letraAsignadasDNI = 'V'; break;
                    case 18: letraAsignadasDNI = 'H'; break;
                    case 19: letraAsignadasDNI = 'L'; break;
                    case 20: letraAsignadasDNI = 'C'; break;
                    case 21: letraAsignadasDNI = 'K'; break;
                    case 22: letraAsignadasDNI = 'E'; break;
                }
                System.out.print("La letra correspondiente al DNI es :");
                System.out.println(letraAsignadasDNI);
                break;
            
                
            case 4: 
                //Seleccionamos jugador clase
                int jugador = 0;
                
                 
               
                      System.out.print("Introduce la clase de jugador ( Guerrero-1, Mago-2, Arquero-3: ");
                      jugador = sc.nextInt();
                        if (jugador >=1 && jugador <= 3 ){
                              System.out.println("Dato del jugador valido.");
                          }   
                        else {
                        System.out.print("Dato de jugador introducido invalido");
                }
                
                int enemigos = 0;
                           System.out.print("Introduce el tipo de enemigo (orco-1, Dragon-2, esqueleto-3:)");
                     enemigos = sc.nextInt();
                
                        if (enemigos >= 1 && enemigos <= 3){
                            System.out.println("Dato del enemigo valido");
                        }
                        else {
                            System.out.println("Dato del enemigo invalido");
                            break;
                        }
                if (jugador == enemigos ){
                    System.out.print("Combate Equilibrado");
                }
                else {
               switch(jugador){
                   case 1:
                       if(enemigos  == 1 ){
                           System.out.print("Ventaja");
                           
                       }
                       else{
                           System.out.print("Desventaja");
                       }
                       break;
                   case 2 : 
                       if(enemigos  == 2 ){
                           System.out.print("ventaja");
                           
                       }
                           else {
                                   System.out.print("Desventaja");
                                   }
                       break;
                   case 3: 
                       if(enemigos == 3 ){
                           System.out.print("Ventaja");
                         
                       }
                       else {
                           System.out.print("Desventaja");
                       }
                   
               }
                }
            
                break;
            case 5:
                System.out.print("Introduce el nivel del personaje:");
                int nivelpersonaje = sc.nextInt();
                if (nivelpersonaje >= 1 && nivelpersonaje <=20){
                    System.out.println("El dato es valido.");
                    
                } else {
                        System.out.println("El dato es invalido.");
                        break;
                        }
                
                System.out.print("Introduce la cantidad de pociones(0-10)");
                int cantidadpociones = sc.nextInt();
                if( cantidadpociones >= 0 && cantidadpociones <= 10){
                    System.out.println("El dato es valido.");
                } else {
                    System.out.print("El dato es invalido.");
                    break;
                }
                //laves del juego si o no 
                System.out.print("Introduce si el personaje tiene llave si(1) y no (2)");
                int llavejuego = sc.nextInt();
                if (llavejuego >= 1 && llavejuego <= 2){
                    System.out.println("dato valido");
                }
                else {
                    System.out.println("Dato no valido");
                    
                    //aqui me quede pensando como poner las llaves si o no en las condiciones
                }
                
                
                if (nivelpersonaje <=5 && (cantidadpociones <=2)){
                    System.out.println("Acceso peligroso");
                }
                else if (nivelpersonaje <= 15 && (cantidadpociones >=5) &&(llavejuego == 2)){
                    System.out.println("Acceso facil");
                }
                else {
                    System.out.println("Acceso Normal");
                    
                }
                System.out.print("Introduce el tipo de mazmorra (bosque oscuro-1, cueva helada-2, Torre maldita-3 , Castillo rey demonio-4)");
                int tipodezona = sc.nextInt();
                switch(tipodezona){
                    case 1: 
                        if(tipodezona == 1){
                            System.out.println("Bosque Oscuro");
                        }
                        break;
                    case 2: 
                        if(tipodezona == 2){
                            System.out.println("Cueva helada");
                        }
                        break;
                    case 3:
                        if(tipodezona == 3){
                            System.out.println("Torre maldita");
                        }
                        break;
                    case 4:
                        if(tipodezona == 4){
                            System.out.println("Castillo rey demonio");
                        }
                }
                 
            default:
                System.out.print("final");
            
        }
        
    }
}
