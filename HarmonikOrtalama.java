package Diziler;

import java.util.Scanner;

public class HarmonikOrtalama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int     sizeOfArray;
        double  sum = 0;
        System.out.print("\nHarmonik Ortalama Hesaplama\n\nSerinin eleman sayısı: ");
        sizeOfArray = inp.nextInt();
        System.out.print("\n");

        int[]   arr = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print(i+1 + ". eleman: ");
            arr[i] = inp.nextInt();
        }
        for (int i: arr)
            sum += 1.0/i;
        double  result = sizeOfArray/sum;
        System.out.print("\nHarmonik Ortalama: " + result + "\n");
    }
}
