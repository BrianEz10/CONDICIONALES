package Condicionales3;

import java.util.Scanner;

public class Libros {
    public static void main(String[] args) {

        Scanner Entrada = new Scanner(System.in);

        String genero;
        int salida = 1;

        System.out.println("Bienvenido");

     do {
         System.out.println("¿Que genero de libro le gusta?\nFantasia \nMisterio \nRomance \nCiencia Ficcion");
         genero = Entrada.nextLine();
         genero = genero.toLowerCase();

         if (genero.equals("fantasia") || genero.equals("misterio")|| genero.equals("romance") || genero.equals("ciencia ficcion")) {
             switch (genero){
                 case "fantasia":
                     System.out.println("Te recomiendo leer la saga de libros de \"Harry Potter\"");
                     break;
                 case "misterio":
                     System.out.println("Un libro muy bueno es el de Paula Hawkins  \"La chica del tren\"");
                     break;
                 case "romance":
                     System.out.println("\"Romeo y Julieta\" de William Shakespeare");
                     break;
                 case "ciencia ficcion":
                     System.out.println("\"Neuromante\" de William Gibson");
                     break;
             }
         }
         else {
             System.out.println("El genero de libro no a sido encontrado");
         }

         System.out.println("quiere otra recomendacion de otro genero \nIngrese 1 para salir \nIngrese 0 para preguntar");
         salida = Entrada.nextInt();
         Entrada.nextLine();

     } while (salida != 1);
    }
}