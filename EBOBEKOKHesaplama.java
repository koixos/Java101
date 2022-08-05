package Donguler;
import java.util.Scanner;

public class EBOBEKOKHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int i = 1, num1, num2, gcd = 1, lcm = 1;
        System.out.print("\nEBOB-EKOK Hesaplama\n\n");
        System.out.print("Ilk sayı: ");      num1 = inp.nextInt();
        System.out.print("Ikinci sayı: ");   num2 = inp.nextInt();

        // determining which number is bigger
        int max = num1, min = num1;
        if (num1 < num2) max = num2;
        else min = num2;

        while (i <= min) {
            if (num1 % i == 0 && num2 % i == 0)
                gcd = i;
            ++i;
        }
        lcm = num1 * num2 / gcd;
        System.out.print("\nEBOB: " + gcd + "\nEKOK: " + lcm + "\n");
    }
}
