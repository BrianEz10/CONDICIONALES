package Condicionales5;

import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner Entrada = new Scanner(System.in);


        String turno;
        int piedra = 0;
        int papel = 1;
        int tijera = 2;
        String exit = "no";

        do {
            int RANDOM = random.nextInt(3);
            System.out.println("Juguemos un juego");
            System.out.println("Piedra \nPapel \nTijera");
            System.out.println("Ingrese tu eleccion");
            turno = Entrada.nextLine();
            turno = turno.toLowerCase();


            switch (RANDOM){
                case 0://"0" es la piedra
                    if (turno.equals("piedra")){
                        System.out.println("La maquina eligio Piedra \nEMPATE!");
                        break;
                    } else if (turno.equals("papel")){
                        System.out.println("La maquina eligio Piedra \nHas Ganado!");
                        break;
                    } else if (turno.equals("tijera")){
                        System.out.println("La maquina eligio Piedra \nHas Perdido!");
                        break;
                    }
                case 1: //"1" es papel
                    if (turno.equals("papel")){
                        System.out.println("La maquina eligio Papel \nEMPATE!");
                        break;
                    } else if (turno.equals("piedra")){
                        System.out.println("La maquina eligio Papel \nHas Perdido!");
                        break;
                    } else if (turno.equals("tijera")){
                        System.out.println("La maquina eligio Papel \nHas Ganado!");
                        break;
                    }
                case 2: //"2" es la tijera
                    if (turno.equals("tijera")){
                        System.out.println("La maquina eligio Tijera \nEMPATE!");
                        break;
                    } else if (turno.equals("papel")){
                        System.out.println("La maquina eligio Tijera \nHas Perdido!");
                        break;
                    } else if (turno.equals("piedra")){
                        System.out.println("La maquina eligio Tijera \nHas Ganado!");
                        break;
                    }
            }
            System.out.println("¿Desea jugar otra vez? \nsi \nno");
            exit = Entrada.nextLine();
        }while(exit == "no");
        System.out.println("Gracias Por Jugar");
    }
}