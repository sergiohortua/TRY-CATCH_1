/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception_1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author PC-50
 */
public class Exception_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner tc;

        double di = 0.0;
        double div = 0.0;
        double divi = 0.0;

        try {
            do {
                tc = new Scanner(System.in);
                try {
                    System.out.print("Digite el dividendo ");
                    div = tc.nextDouble();
                } catch (InputMismatchException ex) {
                    System.out.println("No se puede digitar letras");
                    div = -1;
                }
            } while (div < 0);

            do {
                tc = new Scanner(System.in);

                try {
                    System.out.print("Digite el divisor ");
                    divi = tc.nextDouble();
                } catch (InputMismatchException ex) {
                    System.out.println("No se puede digitar letras");
                    divi = -1;
                }
            } while (divi < 0);

            di = div / divi;
            System.out.println("el resultado es: " + di);
        } catch (Exception ex) {
            System.out.println("Error");

            /* } catch (InputMismatchException ex) {
            System.out.println("No se puede meter letras, solo numeros");

        }*/
        }
    }
}
