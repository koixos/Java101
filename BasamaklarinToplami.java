package Donguler;
import java.util.Scanner;

public class BasamaklarinToplami {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int i, number, sum = 0;
        System.out.print("\nBasamak değerlerinin toplamını hesaplamak istediğiniz sayıyı giriniz.\n");
        System.out.print("Sayı: ");
        number = inp.nextInt();

        while (number >= 10) {
            sum += number % 10;
            number /= 10;
        }
        sum += number;

        System.out.print("\nToplam basamak değeri: " + sum + "\n");
    }
}

