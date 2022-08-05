package Donguler;
import java.util.Scanner;

public class TersUcgenCizme {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int line;
        System.out.print("\nTers Üçgen Çizme\n\n");
        System.out.print("Basamak sayısı: ");
        line = inp.nextInt();

        for (int i = 0; i < line; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print(" ");
            for (int j = 0; j < (line-i)*2-1; j++)
                System.out.print("*");
            System.out.print("\n");
        }
    }
}
