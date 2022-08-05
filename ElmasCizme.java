package Donguler;
import java.util.Scanner;

public class ElmasCizme {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int i, line;
        System.out.print("\nYıldızlarla Elmas Çizme\n\n");
        System.out.print("Basamak sayısı : ");
        line = inp.nextInt();
        System.out.print("\n");

        for (i = 0; i < line*2; i+=2) {
            if (i < line) {
                for (int j = 0; j < line - i-1; j+=2)
                    System.out.print(" ");
                for (int j = 0; j < i+1; j++)
                    System.out.print("*");
            }
            else {
                for (int j = 0; j <= i - line; j+=2)
                    System.out.print(" ");
                for (int j = 0; j < line*2-i-1; j++)
                    System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
