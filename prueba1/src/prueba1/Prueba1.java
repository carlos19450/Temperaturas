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
        double temp;
        Scanner read = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Escribe un municipio: ");
            mun = read.nextLine();
            basura = read.nextLine();
            System.out.print("Dime su temperatura: ");
            temp = read.nextInt();
            if (temp < 0) {
                System.out.println("La temperatura de "+mun+" es negativa.");
            }else {
                System.out.println("La temperatura de "+mun+" es positiva.");
            }
        }
    }

}
