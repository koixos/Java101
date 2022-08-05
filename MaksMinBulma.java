package Donguler;
import java.util.Scanner;

public class MaksMinBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int howManyEntry, num, max = -999, min = 999;
        System.out.print("\nMaksimum - Minimum Sayı Belirleme\n\n");
        System.out.print("Kaç tane sayı girmek istiyorsunuz? : ");
        howManyEntry = inp.nextInt();

        for (int i = 0; i < howManyEntry; i++) {
            System.out.print(i+1 + ". sayı: ");
            num = inp.nextInt();
            if (max < num) max = num;
            else if (num < min) min = num;
        }
        System.out.print("\nMinimum sayı: " + min + "\nMaksimum sayı: " + max + "\n");
    }
}
