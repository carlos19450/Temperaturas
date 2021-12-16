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
        String mun, basura;
        int cant;
        double menor = 10000, mayor = -10000, temp, tempactual;
        Scanner read = new Scanner(System.in);

        System.out.println("¿Cuantos municipios quiere poner para saber su temperatura?");
        cant = read.nextInt();

        //Bucle
        for (int i = 1; i <= cant; i++) {
            //System.out.print("Escribe un municipio: ");
            //mun = read.nextLine();
            //basura = read.nextLine();
            System.out.print("Dime la temperatura: ");
            temp = read.nextDouble();
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
        System.out.println("La temperatura menor es: " + menor + "\n La temperatuera mayor es: " + mayor);
    }
    
}
