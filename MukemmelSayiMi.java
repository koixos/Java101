package Donguler;
import java.util.Scanner;

public class MukemmelSayiMi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int i = 1, num, sum = 0;
        System.out.print("\nMükemmel Sayı Mı?\n\n");
        System.out.print("Sayı: ");
        num = inp.nextInt();

        while (i < num) {
            if (num % i == 0)
                sum += i;
            ++i;
        }
        if (sum == num) System.out.print("\n" + num + " mükemmel sayıdır.\n");
        else System.out.print("\n" + num + " mükemmel sayı değildir.\n");
    }
}
