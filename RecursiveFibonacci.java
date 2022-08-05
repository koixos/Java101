package Metotlar;
import java.util.Scanner;

public class RecursiveFibonacci {
    static void recursiveFibonacci(int counter, int temp, int number) {
        System.out.print(number + "  ");
        counter--;
        if (counter == 0)
            return;
        number += temp;
        recursiveFibonacci(counter, number, temp);
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int number;
        System.out.print("\nFibonacci Serisi Hesaplama\n\nSerinin eleman sayısı: ");
        number = inp.nextInt();
        System.out.print("\n");
        recursiveFibonacci(number, 1, 1);
        System.out.print("\n");
    }
}
