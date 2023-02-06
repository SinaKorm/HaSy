package org.example;

import java.util.Scanner;

public class Komma2Bin {

    public static void main(String[] args) {
        double x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gebe die Zielbasis an: ");
        int base = scanner.nextInt();
        System.out.println("Gebe ein: 1 für Zahl, 2 für Bruch");
        int art = scanner.nextInt();
        if (art == 1) {
            System.out.println("Gebe eine Zahl x ein: ");
            x = scanner.nextDouble();
        } else {
            System.out.println("Zähler eingeben.");
            int z = scanner.nextInt();
            System.out.println("Nenner eingeben");
            int n = scanner.nextInt();
            x = (double) z / (double) n;
        }
        for (int i = 0; i < 33; i++) {
            System.out.printf("%.2f * %d = ", x, base);
            x = x * base;
            if (x > 1) {
                System.out.printf("%.2f\t %d\n", x, (int) x);
                while (x >= 1)
                    x = x - 1;
                continue;
            }
            if (x < 1) {
                System.out.printf("%.2f\t 0\n", x);
                continue;
            }
            System.out.printf("%.2f\t 1\n", x);
            return;
        }
    }

    public static void solve(double x){

        int base = 2;
        for (int i = 0; i<33; i++){
            System.out.printf("%.2f * %d = ",x,base);
            x = x * base;
            if (x > 1) {
                System.out.printf("%.2f\t %d\n",x,(int)x);
                while (x >= 1)
                    x = x - 1;
                continue;
            }
            if (x < 1){
                System.out.printf("%.2f\t 0\n",x);
                continue;
            }
            System.out.printf("%.2f\t 1\n",x);
            return;
        }

    }
}
