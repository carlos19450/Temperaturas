/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperaturascarlos;

import java.util.Scanner;

/**
 *
 * @author carpui
 */
public class TemperaturasCarlos {

    public static void main(String[] args) {
        // TODO code application logic here
        int cant;
        double menor = Double.MAX_VALUE, mayor = Double.MIN_VALUE, temp = 0;
        Scanner read = new Scanner(System.in);

        System.out.println("¿Cuantos municipios quiere poner para saber su temperatura?");
        cant = read.nextInt();
        double[] num = new double[cant];

        //Bucles 1 array
        for (int i = 0; i < num.length; i++) {
            System.out.print("Dime la temperatura: ");
            num[i] = read.nextDouble();
            temp = num[i];
            //temp = read.nextDouble();
            if (temp < 0) {
                System.out.println("La temperatura de " + temp + " es negativa.\n");
            } else {
                System.out.println("La temperatura de " + temp + " es positiva.\n");
            }
            if (temp < menor) {
                menor = temp;
            }
            if (temp > mayor) {
                mayor = temp;
            }
        }
        //Bucles 2 array
        double acum;
        System.out.println("Las temperaturas son:\n");
        for (int i = 0; i < num.length; i++) {
            acum = num[i];
            System.out.println(acum);
        }
        System.out.println("");
        //Temperatura mayor y menor
        System.out.println("La temperatura menor es: " + menor);
        System.out.println("La temperatuera mayor es: " + mayor);
    }

}
