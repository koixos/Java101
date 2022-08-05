package Donguler;
import java.util.Scanner;

public class UsHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double i, base, exponent, result = 1;
        System.out.print("\nÜs Hesaplama\n\n");
        System.out.print("Taban: ");    base = inp.nextInt();
        System.out.print("Kuvvet : ");  exponent = inp.nextInt();

        for (i = 0; i < exponent; i++)
            result *= base;

        System.out.print("\nSonuç: " + result + "\n");
    }
}
