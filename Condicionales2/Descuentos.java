package Condicionales2;

import javax.swing.*;
import java.util.Scanner;

public class Descuentos {
    public static void main(String[] args) {


        double precio;
        String persona;
        double descuento;

        int estudianteDescuento = 10;
        int adultoDescuento = 5;
        int jubiladoDescuento = 15;

        precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto comprado"));
        persona = JOptionPane.showInputDialog("Que tipo de cliente eres: \nEstudiante \nAdulto \nJubilado");

        persona = persona.toLowerCase();
        switch (persona){
            case "estudiante":
                descuento = ((precio * estudianteDescuento) / 100);
                descuento = precio - descuento;
                JOptionPane.showMessageDialog(null,"Al procuto de precio "+precio+" se le a añadido un descuento por ser Estudiante y solo pagara "+ descuento);
                break;
            case "adulto":
                descuento = ((precio * adultoDescuento)/100);
                descuento = precio - descuento;
                JOptionPane.showMessageDialog(null,"Al procuto de precio "+precio+" se le a añadido un descuento por ser Adulto y solo pagara "+ descuento);
                break;
            case "jubilado":
                descuento = ((precio * jubiladoDescuento)/100);
                descuento = precio - descuento;
                JOptionPane.showMessageDialog(null,"Al procuto de precio "+precio+" se le a añadido un descuento por ser Jubilado y solo pagara "+ descuento);
                break;
        }
    }
}