package Donguler;
import java.util.Scanner;

public class DortveBesinKuvvetleri {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int number, i;
        System.out.print("\nSayı: ");
        number = inp.nextInt();

        System.out.print("\n4'ün Kuvvetleri: ");
        for (i = 1; i <= number; i *= 4) {
            System.out.print(i + ", ");
        } System.out.print("\b\b");

        System.out.print("\n5'in Kuvvetleri: ");
        for (i = 1; i <= number; i *= 5) {
            System.out.print(i + ", ");
        } System.out.print("\b\b\n");
    }
}
