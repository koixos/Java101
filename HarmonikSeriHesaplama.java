package Donguler;
import java.util.Scanner;

public class HarmonikSeriHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int     i, number;
        double  sum = 0;
        System.out.print("\nHarmonik serisini hesaplamak istediğiniz sayıyı giriniz.\n");
        System.out.print("Sayı: ");
        number = inp.nextInt();

        for (i = 1; i <= number; i++)
            sum += 1.0/i;

        System.out.print("\nSeri toplamı: " + sum + "\n");
    }
}

