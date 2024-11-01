package Condicionales1;

import java.util.Locale;
import java.util.Scanner;

public class Peliculas {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        String pelicula;

        System.out.println("¿Que genero de peliculas te gusta? \nAccion \nComedia \nDrama \nCiencia Ficcion");
        pelicula = Entrada.nextLine();
        pelicula = pelicula.toLowerCase();

        if (pelicula.equals("accion")){
            System.out.println("\"Mad Max: Fury Road\" (2015) - Esta película es un impresionante regreso a la franquicia \"Mad Max\", conocida por sus espectaculares escenas de acción, efectos visuales y una narrativa única en un mundo postapocalíptico");
        }
        else if (pelicula.equals("comedia")){
            System.out.println("\"Superbad\" (2007) - Una comedia sobre la adolescencia que captura la experiencia de dos amigos en su último año de secundaria. Es divertida, entrañable y ha dejado una marca en la cultura pop");
        }
        else if (pelicula.equals("drama")) {
            System.out.println("\"The Social Network\" (2010) - Dirigida por David Fincher, esta película retrata la creación de Facebook y explora temas de amistad, traición y el impacto de la tecnología en las relaciones humanas");
        }
        else if (pelicula.equals("ciencia ficcion")) {
            System.out.println("\"Inception\" (2010) - Dirigida por Christopher Nolan, esta innovadora película explora el mundo de los sueños y la percepción de la realidad, y es conocida por su compleja narrativa y efectos visuales impresionantes");
        }
    }
}