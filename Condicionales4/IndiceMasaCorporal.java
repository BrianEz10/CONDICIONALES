package Condicionales4;

import javax.swing.*;
import java.text.DecimalFormat;

public class IndiceMasaCorporal {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.00");

        Double peso;
        double altura;
        double IMC;

        JOptionPane.showMessageDialog(null,"CALCULADORA DE INDICE DE MASA CORPORAL");
        JOptionPane.showMessageDialog(null,"Se le pediran los siguientes datos");
        peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su peso en kilogramos"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su altura en metros"));

        IMC = (double) (peso/(altura*altura));



        if (IMC < 18.5){
            JOptionPane.showMessageDialog(null,"Su Indice de Masa Corporal es de "+df.format(IMC)+" por ende tiene un peso bajo");
        } else if (IMC <= 24.9 && IMC >= 18.5) {
            JOptionPane.showMessageDialog(null,"Su Indice de Masa Corporal es de "+df.format(IMC)+" por ende usted esta en un peso normal");
        } else if (IMC >= 25 && IMC <= 29.9) {
            JOptionPane.showMessageDialog(null,"Su Indice de Masa Corporal es de "+df.format(IMC)+" por ende usted esta en Sobrepeso");
        } else if (IMC >= 30) {
            JOptionPane.showMessageDialog(null,"Su Indice de Masa Corporal es de "+df.format(IMC)+" por ende usted esta con Obesidad");
        }
    }
}
