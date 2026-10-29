for(int y = 5; y >= 2; y--){
  System.out.print(y);
}
//Explicacion
//vuelta 1 seria y = 5
//5 es menor igual que 2 y se imprime 5 
//a continuación se le resta 1 a 5 ( 5-1 = 4)
// se actualiza el dato de y = 4
// vuelta 2 seria y = 4
// 4 es menor igual que 2 y se imprime 4
//A continuación se le resta a 4 y se queda en k= 3
// en la vuelta 3 pasara a valer 2 al final del recorrido
// en la vuelta 4 pasara a imprimirse 2 pero se le resta al final otra vez 2-1 y la siguiente vuelta que seria la 5 rompe el bucle
