package org.example;

import java.util.Scanner;

public class Dec2Base {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gebe die Zielbasis an: ");
        int base = scanner.nextInt();
        System.out.println("Gebe eine Zahl x ein: ");
        int x = scanner.nextInt();

        while (x > 0){
            System.out.println(x + " % " + base + "= " +x%base + "\t" + x + " / "+base+" = " + x/base);
            x = x/base;
        }
    }
}
