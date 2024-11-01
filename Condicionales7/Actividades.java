package Condicionales7;

import java.util.Scanner;

public class Actividades {
    public static void main(String[] args) {

        Scanner Entradin = new Scanner(System.in);
        String Estado;

        System.out.println("Buenas");
        System.out.println("Seleccione un estado de animo de como se encuentra actualmente \nFeliz\nTriste\nEnergico\nRelajado");
        Estado = Entradin.nextLine();
        Estado = Estado.toLowerCase();

        switch (Estado) {
            case "feliz": {
                System.out.println("Estas Feliz estas actividades haran que disfrutes mas de tu felicidad");
                System.out.println("Escuchar musica animada o tu playlist favorita\nSalir a Pasear\nReunirte con amigos o familiares\nEscribir en un diario o hacer un collage de recuerdos");
                break;
            }
            case "triste": {
                System.out.println("Estas actividades te ayudaran a mejorar esa sensacion de tristeza");
                System.out.println("Escribir tus pensamientos\nVer una pelicula o serie reconfortante\nLeer un libro de autoayuda o un libro inspirador\nPasar tiempo con una mascota o con la naturaleza");
                break;
            }
            case "energico": {
                System.out.println("Como estas lleno de enegia estas actividades aprovecharan esa vitalidad");
                System.out.println("Hacer ejercio fisico\nEmprender un proyecto nuevo\nBaile o actividad grupal\nPracticar un deporte");
                break;
            }
            case "relajado":{
                System.out.println("Como te sientes relajado, estas actividades haran que profundices esa calma aun mas");
                System.out.println("Meditar o practicar respiracion profunda\nLeer un libro\nEscuchar musica suave o instrumental\nDibujar o colorear");
            }
            default:
                System.out.println("Estado de animo no encontrado");
        }
    }
}
