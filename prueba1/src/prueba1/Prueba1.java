/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba1;

import java.util.Scanner /**
         *
         * @author carpui
         */

public class Prueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int temperatura;
        Scanner read = new Scanner(System.in);
        System.out.println("Indica cual es la temperatura donde te encuentras");
        temperatura = read.nextInt();
        if (temperatura < 0) {
            System.out.println("La temperatura es negativa.");
        } else {
            System.out.println("La temperatura en positiva.");
        }
    }

}
