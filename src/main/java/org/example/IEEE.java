package org.example;

import java.util.Scanner;

public class IEEE {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Zahl eingeben");
        double zahl = scanner.nextDouble();
        System.out.println("Vorzeichen: " + (zahl < 0? 1 : 0));
        zahl = zahl < 0? -zahl : zahl;
        int exp;
        if(zahl >= 0){
            for (exp = 1; Math.pow(2,exp) <= zahl; exp++);
            exp--;
        }
        else {
            for (exp = -1; Math.pow(2,exp) >= zahl; exp--);
            exp++;
        }
        System.out.println("Exponent: "+Integer.toBinaryString(exp + 127));
        zahl = (zahl/Math.pow(2,exp))-1;
        System.out.println("gib irgendwas ein");
        System.out.println("Mantisse: " + zahl);
        Komma2Bin.solve(zahl);

    }
}
