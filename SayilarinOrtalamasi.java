package Donguler;
import java.util.Scanner;

public class SayilarinOrtalamasi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int     number, sum = 0, total_number = 0;
        double  average;
        System.out.print("\nSayı: "); number = inp.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                ++total_number;
            }
        }
        average = sum / total_number;
        System.out.print("\nOrtalama: " + average + "\n");
    }
}
