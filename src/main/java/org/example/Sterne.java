package org.example;

public class Sterne {
    public void printSterne() {
        for (int i = 1; i <= 7; i++) {

            for (int j = 1; j <= i - 1; j++) {
                System.out.print("*");
            }

            for (int k = 1; k <= 14 - 2 * i; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i - 1; j++) {
                System.out.print("*");
            }

            System.out.print("\n");
        }
    }

}
