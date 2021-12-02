/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba1;

import java.util.Scanner;

/**
 *
 * @author carpui
 */
public class Prueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mun, basura;
        int cant;
        double temp1 = 0, temp2 = 0, temp, tempactual;
        Scanner read = new Scanner(System.in);
        System.out.print("Introduce la temperatura actual donde esta usted: ");
        tempactual = read.nextDouble();
        System.out.println("¿Cuantos municipios quiere poner para saber su temperatura?");
        cant = read.nextInt();
        //Bucle
        for (int i = 1; i <= cant; i++) {
            System.out.print("Escribe un municipio: ");
            mun = read.nextLine();
            basura = read.nextLine();
            System.out.print("Dime su temperatura: ");
            temp = read.nextDouble();
            if (temp < 0) {
                System.out.println("La temperatura de " + mun + " es negativa.");
            } else {
                System.out.println("La temperatura de " + mun + " es positiva.");
            }
            if (temp < tempactual) {
                temp1 = temp;
            } else if (temp > tempactual) {
                temp2 = temp;
            }
        }
        if (temp1 < temp2) {
            System.out.println("La temperatura maxima es: " + temp2);
        } else if (temp1 > temp2) {
            System.out.println("La temperatura minima es: " + temp1);
        }
    }

}
