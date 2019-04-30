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
        double dividendo = 0.0;
        double divisor = 0.0;

        try {
            do {
                tc = new Scanner(System.in);
                try {
                    System.out.print("Digite el dividendo ");
                    dividendo = tc.nextDouble();
                } catch (InputMismatchException ex) {
                    System.out.println("No se puede digitar letras");
                    dividendo = -1;
                }
            } while (dividendo < 0);
            System.out.println("=======");
            do {
                tc = new Scanner(System.in);

                try {
                    System.out.print("Digite el divisor ");
                    divisor = tc.nextDouble();
                } catch (InputMismatchException ex) {
                    System.out.println("No se puede digitar letras");

                    divisor = -1;
                }

            } while (divisor < 0);

            di = dividendo / divisor;
            System.out.println("el resultado es: " + di);
        } catch (Exception ex) {
            System.out.println("Error");

            /* } catch (InputMismatchException ex) {
            System.out.println("No se puede meter letras, solo numeros");

        }*/
        }
    }
}
