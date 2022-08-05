package Donguler;
import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int number;
        System.out.print("\nFibonacci Serisi Hesaplama\n\n");
        System.out.print("Seri boyutu: ");
        number = inp.nextInt();

        System.out.print("\nFibonacci Serisi: 1  ");
        for (int i = 0, j = 1; number > 1; number--) {
            int temp = j;
            j += i;
            i = temp;
            System.out.print(j + "  ");
        }
    }
}
