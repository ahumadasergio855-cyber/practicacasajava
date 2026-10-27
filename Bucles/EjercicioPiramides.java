System.out.println("Introduce el numero de filas");
        int numerofilas = sc.nextInt();
        for( int i = 0 ; i < numerofilas ; i++ ){
            for(int j = 0 ; j <=i ; j++){
            System.out.print("*");
        }
            System.out.println();
    }
        System.out.println("Introduce el numero de filas");
        numerofilas = sc.nextInt();
        for( int i = 0 ; i < numerofilas ; i++ ){
            for(int j = 0 ; j <=numerofilas -1 -i ; j++){
            System.out.print(" ");
        }
            
            for(int a = 0; a <(2 * i + 1); a++){
                System.out.print("*");
            }
            
      
            System.out.println();
    }
}
}
