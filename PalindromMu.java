package Metotlar;
import java.util.Scanner;

public class PalindromMu {
    static void isPalindrome(int number) {
        int num_of_digits = 1, temp = number, reversed = 0;
        for (; temp/10 > 0; temp /= 10)
            ++num_of_digits;

        temp = number;
        while (temp/10 > 0) {
            int coefficient = 1;
            for (int i = 0; i < num_of_digits-1; i++)
                coefficient *= 10;
            reversed += (temp%10 * coefficient);
            temp /= 10;
            num_of_digits--;
        }   reversed += temp;

        if (reversed == number) System.out.print("\n" + number + " Palindromik sayıdır.\n");
        else System.out.print("\n" + number + " Palindromik sayı değildir.\n");
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Palindrom Mu?\n\nSayı: ");
        int number = inp.nextInt();
        isPalindrome(number);
    }
}
