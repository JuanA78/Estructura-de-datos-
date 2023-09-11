/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.pricipal;

import javax.swing.JOptionPane;

/**
 *
 * @author Juan Angel
 */
public class Menus {

    public static void menuPrincipal() {
        boolean sentinal = true;
        final String menu = "Menu Principla \n" //final constantes 
                + "1) Ciclos\n"
                + "2) Reursividad\n"
                + "3) Arreglos\n"
                + "4) Listas Enlazadas \n"
                + "5) Colas y  Pilas\n"
                + "6) Arboles binarios\n"
                + "7) Salir\n"
                + "¿Qué opcion desea?\n";

        String opc = "";

        do {

            opc = JOptionPane.showInputDialog(menu);

            switch (opc) {
                case "1":
                    menuCiclos();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "7":
                    sentinal = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "opcio no valida ");
            }

        } while (sentinal);
    }

    private static void menuCiclos() {
        String menu = "Menu Ciclos \n"
                + "1) Ejercicio 1\n"
                + "2) Ejercicio 2\n"
                + "3) Regresar\n"
                + "¿Qué opcion desea?\n";
        String opc = JOptionPane.showInputDialog(menu);

        switch (opc) {
            case "1":

                break;
            case "2":
                break;
            case "3":
                menuPrincipal();
                break;
            case "4":
            default:
                JOptionPane.showMessageDialog(null, "opcio no valida ");
        }

    }

}
