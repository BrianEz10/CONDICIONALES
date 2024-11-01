package Condicionales6;

import javax.swing.*;

public class Habitos {
    public static void main(String[] args) {

        double horassuenio;
        double horasejercicio;
        byte comidasaludable;
        double Habitos;

        byte suenio = 0;
        byte ejercicio = 0;
        byte comidas = 0;

        JOptionPane.showMessageDialog(null,"Evaluador de Habitos Saludables");
        horassuenio = Double.parseDouble(JOptionPane.showInputDialog("¿Cuantas horas al dia duerme?"));
        horasejercicio = Double.parseDouble(JOptionPane.showInputDialog("¿Cuantas horas al dia hace ejercicio?"));
        comidasaludable = Byte.parseByte(JOptionPane.showInputDialog("¿Cuantas Comidas saludables come al dia?"));

        if (horassuenio < 6){
            suenio = 1;
        } else if (horassuenio >= 6 || horassuenio <= 7 ){
            suenio = 2;
        } else if (horassuenio <= 8 || horassuenio > 7) {
            suenio = 3;
        } else if (horassuenio > 8) {
            suenio = 2;
        }
        horasejercicio = (double) horasejercicio/60;
        if (horasejercicio <= 0.5){
            ejercicio = 1;
        } else if (horasejercicio > 0.5 || horasejercicio <= 1) {
            ejercicio = 2;
        } else if (horasejercicio > 1 || horasejercicio <= 2) {
            ejercicio = 3;
        } else if (horasejercicio > 2) {
            ejercicio = 2;
        }
        if (comidasaludable <= 0){
            comidas = 1;
        } else if (comidasaludable == 1 || comidasaludable == 2) {
            comidas = 2;
        } else if (comidasaludable == 3 || comidasaludable == 4) {
            comidas = 3;
        } else if (comidasaludable > 4) {
            comidas = 2;
        }

        Habitos = (byte) (suenio+ejercicio+comidas);
        
        if (Habitos <= 3){
            JOptionPane.showMessageDialog(null, "\nRanking de Habitos Saludables \nExcelente: 8-9 puntos \nBueno: 6-7\nAceptable: 4-5 \nMejorable: 3 o menos \nTienes un puntuacion de "+Habitos+" puntos");
            JOptionPane.showMessageDialog(null,"Hay que mejorar esos habitos");
        } else if (Habitos == 5 || Habitos == 4) {
            JOptionPane.showMessageDialog(null, "\nRanking de Habitos Saludables \nExcelente: 8-9 puntos \nBueno: 6-7\nAceptable: 4-5 \nMejorable: 3 o menos \nTienes un puntuacion de "+Habitos+" puntos");
            JOptionPane.showMessageDialog(null,"Tienes unos habitos Aceptables, se podrian mejorar un poco mas");
        } else if (Habitos ==6 || Habitos == 7) {
            JOptionPane.showMessageDialog(null, "\nRanking de Habitos Saludables \nExcelente: 8-9 puntos \nBueno: 6-7\nAceptable: 4-5 \nMejorable: 3 o menos \nTienes un puntuacion de "+Habitos+" puntos");
            JOptionPane.showMessageDialog(null,"Tienes Buenos habitos");
        } else if (Habitos == 9 || Habitos == 8) {
            JOptionPane.showMessageDialog(null, "\nRanking de Habitos Saludables \nExcelente: 8-9 puntos \nBueno: 6-7\nAceptable: 4-5 \nMejorable: 3 o menos \nTienes un puntuacion de "+Habitos+" puntos");
            JOptionPane.showMessageDialog(null,"Tienes unos Habitos Excelentes, sin palabras");
        }
    }
}
