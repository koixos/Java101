package Donguler;
import java.util.Scanner;

public class SayilarinToplami {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int number, sum = 0;
        System.out.print("\nToplamak istediğiniz sayıları giriniz.\nProgramı bitirmek için tek sayı giriniz.\n\n");
        do {
            System.out.print("Sayı: ");
            number = inp.nextInt();

            if (number % 4 == 0)
                sum += number;
        } while (number % 2 == 0);
        System.out.print("\nToplam: " + sum + "\n");
    }
}
